import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter4j.FilterQuery;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterColl {
	static String token = null; // replace it with your own token after first run.
	static String tokenSecret = null; // replace it with your token secret after first run.
	final static String consumerKey = "hh2NJB8N3Gyke502yT5Vx5TRc";
	final static String consumerSecret = "7CYPlw6gCNwns044phMwN4OiGEjN9J40U6xHOlzM5qJBHE1ijV";
	static int count = 0;
	static int endline_count = 0;
	static BufferedWriter bufferWritter = null;
	static FileWriter fileWritter  = null;
	static File file = null;
	public static void main(String[] args) throws TwitterException, IOException {
		Twitter twitter = TwitterFactory.getSingleton();
		AccessToken accessToken = null;
		// accessToken = new AccessToken(token, tokenSecret);       --> remove this comment after you run the once and updated the token and tokensecret.
		if(accessToken == null || accessToken.getToken() == null)
			accessToken = getAccessToken(twitter);
		// twitter.setOAuthConsumer(consumerKey, consumerSecret);   ---> remove this comment after you run the once and updated the token and tokensecret. 
		twitter.setOAuthAccessToken(accessToken);
		file =new File("YOURNETID_tweets_1_to_20000.txt");  // ---> Append you Netid to the start of filename.
		if(!file.exists()){
			file.createNewFile();
		}
		fileWritter = new FileWriter(file.getName(),true);
        bufferWritter = new BufferedWriter(fileWritter);
		streamTweets(twitter);
		System.out.println("Control Returned");
	}

	public static void streamTweets(Twitter twitter) throws TwitterException, IOException{
		ConfigurationBuilder config = new ConfigurationBuilder();
		config.setOAuthConsumerKey(consumerKey);
		config.setOAuthConsumerSecret(consumerSecret);
		config.setOAuthAccessToken(token);
		config.setOAuthAccessTokenSecret(tokenSecret);
		TwitterStream twitterStream = new TwitterStreamFactory(config.build()).getInstance();
		StatusListener listener = new StatusListener() {
			
			@Override
			public void onException(Exception arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onTrackLimitationNotice(int arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onStatus(Status status) {
				if(status.getLang().equals("en"))
				{
					User user = status.getUser();
					try {
						
					count++;
					if(count > 1 && count%20000==1)
					{
						int endcount = count+19999;
						bufferWritter.close();
						file = new File("YOURNETID_tweets_"+count+"_"+endcount+".txt");  // ---> Append you Netid to the start of filename.
						if(!file.exists()){
							file.createNewFile();
						}
						fileWritter = new FileWriter(file.getName(),true);
				        bufferWritter = new BufferedWriter(fileWritter);
					}
						if(bufferWritter!=null)
						{
							System.out.println(count);
							bufferWritter.write("\n");
							bufferWritter.write("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
							bufferWritter.write(status.getCreatedAt().toString());
							bufferWritter.write(" +@$!#/^&* ");
							if(status.getUser().getLocation()!=null)
							{
								bufferWritter.write(status.getUser().getLocation());
							}
							else
							{
								bufferWritter.write("null");
							}
							bufferWritter.write(" +@$!#/^&* ");
							if(status.getGeoLocation()!=null)
							{
							 bufferWritter.write(status.getGeoLocation().getLatitude()+" "+status.getGeoLocation().getLongitude());
							}
							else
							{
								bufferWritter.write("null");
							}
							bufferWritter.write(" +@$!#/^&* ");
							bufferWritter.write(String.valueOf(status.getUser().getId()));
							bufferWritter.write(" +@$!#/^&* ");
							bufferWritter.write(status.getUser().getScreenName());
							bufferWritter.write(" +@$!#/^&* ");
							bufferWritter.write(String.valueOf(status.getId())); // tweet_id
							bufferWritter.write(" +@$!#/^&* ");
							bufferWritter.write(status.getText());
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			@Override
			public void onStallWarning(StallWarning arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onScrubGeo(long arg0, long arg1) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onDeletionNotice(StatusDeletionNotice arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		FilterQuery fq = new FilterQuery();
		String keywords[] = {"#ucertify","ucertify"}; // Your set of keywords here.
		fq.track(keywords);
        twitterStream.addListener(listener);
        twitterStream.filter(fq);
        while(true)
        {
        	
        }
        
        
	}
	public static AccessToken getAccessToken(Twitter twitter)
			throws TwitterException, IOException {
		twitter.setOAuthConsumer(consumerKey, consumerSecret);
		RequestToken requestToken = twitter.getOAuthRequestToken();
		AccessToken accessToken = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (null == accessToken) {
			System.out.println("Open the following URL and grant access to your account:");
			System.out.println(requestToken.getAuthorizationURL());
			System.out
					.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
			String pin = br.readLine();
			try {
				if (pin.length() > 0) {
					accessToken = twitter
							.getOAuthAccessToken(requestToken, pin);
				} else {
					accessToken = twitter.getOAuthAccessToken();
				}
				token = accessToken.getToken();
				System.out.println(token);
				tokenSecret = accessToken.getTokenSecret();
				System.out.println(tokenSecret);
			} catch (TwitterException te) {
				if (401 == te.getStatusCode()) {
					System.out.println("Unable to get the access token.");
				} else {
					te.printStackTrace();
				}
			}
			
		}
		return accessToken;
	}
}
