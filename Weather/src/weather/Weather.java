/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *This code will display the weather for a certain date using the temperature and precipitation
 * @author HP-
 */
public class Weather 
{
	private String date;
	private double hiTemp;
	private double lowTemp;
	private double precipitation;
	
	public Weather(String date, double hiTemp, double lowTemp, double precipitation)
	{
		date = "";
		hiTemp = 72;
		lowTemp = 32;
		precipitation = 16;
	}
		
	public void setdate(String date)
	{
		if(date=="")
		{
			date="";
		}
	}
		public void sethiTemp(double hiTemp)
		{
			if(hiTemp==72)
			{
				hiTemp=72;
			}
		}
		
		public void setlowTemp(double lowTemp)
		{
			if(lowTemp==32)
			{
				lowTemp=32;
			}
		}
		
		public void setPrecepitation(double precipitation)
		{
			if(precipitation==16)
			{
				precipitation=16;
			}
		}
		
		public String getDate()
		{
			return date;
		}
		
		public double gethiTemp()
		{
			return hiTemp;
		}//Farenheit
		
		public double getlowTemp()
		{
			return lowTemp;
		}//Farenheit
		
		public double getPrecipitation()
		{
			return precipitation;
		}//inches
		
		public void displayWeather()
		{
			 displayWeather();
		}
		
	}

