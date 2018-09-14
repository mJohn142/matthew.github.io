/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

/**
 *This class will run our weather program
 * @author HP-
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class RunWeather 
{

	public static void main(String[] args) 
	{
		
		String Week [] = {"Rain", "Snow", "Sunny", "Thunder","Tornado", "Hail", "Foggy"};
		 Scanner in = new Scanner(System.in);
		 Weather [] Week1 = new Weather[7];
		 
		 for (Weather w: Week1)
		 {
			 
		 System.out.println("Enter the day with the highest temperature." + w.getDate() + w.gethiTemp() + "");
		 System.out.println("Enter the total precipitation for the week" + w.getPrecipitation());
		 
		 
		 
		
		
		
		
		
		
	}

	
		
	}

}
