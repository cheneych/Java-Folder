package Cerner;

import java.util.*;
import java.io.*;




public class Prescription1{
	
	private String medicineName;
	
	private Calendar startDate;
	private Calendar endDate;
	
	public enum Frequencies{
		FOUR_HOURS, ONCE_A_DAY, WITH_MEALS, BEFORE_BED, AS_NEEDED,HOUR 
	}
	
	private Frequencies frequencies;
	
	public enum stopType{
		days,doses,forever;
	}

	public void remainder(int days,int doses,int n){
	

		Calendar tempDate=Calendar.getInstance();
	
		tempDate=startDate;

	if(stoptype.equals(stopType.days)){
		 
		tempDate.add(Calendar.DAY_OF_MONTH,days);
	}
	
	else if(stoptype.equals(stopType.doses)){
		
		switch(frequencies){
		
		case FOUR_HOURS:
				
				for (int i=0;i<doses;i++){
					tempDate.add(Calendar.HOUR_OF_DAY,4);
				}
				
				break;
				
		case ONCE_A_DAY:
				
				for (int i=0;i<doses;i++){
					tempDate.add(Calendar.DAY_OF_MONTH,1);
				}
				
				break;
				
			//when hour value changes dynamically then pass 'n' parameter to the method
		case HOUR:
				
				for (int i=0;i<doses;i++){
					tempDate.add(Calendar.HOUR_OF_DAY,n);
				}
				
				break;
				
			//for this case, nurse gets remainder every day and gives the doses to patients asneeded for that specific day
		case AS_NEEDED:
					tempDate.add(Calendar.DAY_OF_MONTH,1);
				break;
		}
	}
	else{
		
		//forever case, set year value to interger max value
		endDate.set(Calendar.YEAR, Integer.MAX_VALUE);
	}
	
	endDate = tempDate;
 
	Calendar temp=Calendar.getInstance();
	temp = startDate; 
		
	switch(frequencies){

	case FOUR_HOURS:

	while(temp.compareTo(endDate)<=0){

	//System.out.println(temp.getTime());

	temp.add(Calendar.HOUR_OF_DAY, 4);

	}

	break;

	case ONCE_A_DAY:

	while(temp.compareTo(endDate)<=0){

	//System.out.println(temp.getTime());

	temp.add(Calendar.DAY_OF_MONTH, 1);

	}


	break;

	case WITH_MEALS:

	while(temp.compareTo(endDate)<=0){

	//System.out.println(temp.getTime());

	temp.add(Calendar.DAY_OF_MONTH, 1);

	}

	break;

	case BEFORE_BED:

	while(temp.compareTo(endDate)<=0){

	//System.out.println(temp.getTime());

	temp.add(Calendar.DAY_OF_MONTH, 1);

	}

	break;
	}
}
}