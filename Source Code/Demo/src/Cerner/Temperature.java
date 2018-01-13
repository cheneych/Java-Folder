package Cerner;

import java.util.ArrayList;
import java.util.List;

public class Temperature {

	
	private double temperature;
	
	public enum MeasuringMethod
	{
		ARMPIT, EAR, MOUTH
	}
	
	MeasuringMethod measuringmethod;
	
	public enum MeasuringUnit
	{
		CELCIUS, FAHRENHEIT, KELVIN 
	}
	
	MeasuringUnit measuringunit;
	
	public Temperature()
	{
		
	}
	
	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}
	
	public double getTemperature()
	{
		return temperature;
	}
	
	public void setMeasuringMethod(MeasuringMethod measuringmethod)
	{
		this.measuringmethod=measuringmethod;
	}

	public MeasuringMethod getMeasuringMethod()
	{
		return measuringmethod;
	}

	public void setMeasuringUnit(MeasuringUnit measuringunit)
	{
		this.measuringunit=measuringunit;
	}

	public MeasuringUnit getMeasuringUnit()
	{
		return measuringunit;
	}

	public Temperature(double temperature,MeasuringUnit measuringunit, MeasuringMethod measuringmethod)
	{
		this.temperature = temperature;
		this.measuringmethod=measuringmethod;
		this.measuringunit=measuringunit;
		
	}
	
	public boolean checkFever(Temperature initialTemperature)
	{
		
//		if(measuringunit.equals(MeasuringUnit.FAHRENHEIT))
//		{
//			temperature = fahrenheittocelcius(temperature);
//		}
		
		if(measuringmethod.equals(initialTemperature.getMeasuringMethod()) && (temperature - initialTemperature.getTemperature())>1)
		{
			return true;
		}
		
		else if(!measuringmethod.equals(initialTemperature.getMeasuringMethod()) && (temperature -initialTemperature.getTemperature())>2)
		{
			return true;
		}
		
		else 
			 return false;
		
	}
	
	public static void main(String[] args){
		Temperature initialTemperature = new Temperature();
		initialTemperature.setTemperature(208.58);
		initialTemperature.setMeasuringMethod(MeasuringMethod.MOUTH);
		initialTemperature.setMeasuringUnit(MeasuringUnit.FAHRENHEIT);
		
		//1am
		Temperature one = new Temperature();
		Temperature two = new Temperature();
		
		
		
		List<Temperature> list1 = new ArrayList();
		list1.add(one);
		list1.add(two);
		double sum = 0.0;
		for(Temperature t : list1){
			sum = sum + t.getTemperature();
		}
		double avg = sum/list1.size();
		
		Temperature temperature1 = new Temperature();
		temperature1.setTemperature(208.58);
		temperature1.setMeasuringMethod(MeasuringMethod.MOUTH);
		temperature1.setMeasuringUnit(MeasuringUnit.FAHRENHEIT);
		
		System.out.println(temperature1.checkFever(initialTemperature));
	}
	
}


