package com;


 
import java.util.*;
import java.text.DecimalFormat;
 
public class CurrencyConverter {
 
	public static void main(String[] args) {
 
		double amount, dollar, pound, code, euro, yuan, drham, birr;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("hi, Welcome to the Currency Converter!");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("1:Birr \t2:Dollar \t3:Pound \n4:Euro \t5:Youan \t6:Drham ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 44.29;
			System.out.println("Your " + amount + "Birr is : " + f.format(dollar) + " Dollar");
 
			pound = amount / 60.89;
			System.out.println("Your " + amount + " Birr is : " + f.format(pound) + " Pound");
 
			euro = amount / 52.13;
			System.out.println("Your " + amount + " Birr is : " + f.format(euro) + " Euro");
 
			yuan = amount / 6.97;
			System.out.println("Your " + amount + " Birr is : " + f.format(yuan) + " Yuan");
 
			drham = amount / 12.06;
			System.out.println("Your " + amount + " Birr is : " + f.format(drham) + " drham");
		} else if (code == 2) {
			// For Dollar Conversion
 
	birr = amount * 44.29;
			System.out.println("Your " + amount + " Dollar is : " + f.format(birr) + " Birr");
 
			pound = amount * 0.78;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.87;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
 
			yuan = amount * 6.48;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yuan) + " Yuan");
 
			drham = amount * 3.67;
			System.out.println("Your " + amount + " Dollar is : " + f.format(drham) + " drham");
		} else if (code == 3) {
			// For Pound Conversion
 
			birr = amount * 60.89;
			System.out.println("Your " + amount + " pound is : " + f.format(birr) + " Birr");
 
			dollar = amount * 1.37;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
 
			euro = amount * 1.10;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
 
			yuan = amount * 8.91;
			System.out.println("Your " + amount + " pound is : " + f.format(yuan) + " Yuan");
 
			drham = amount * 5.05;
			System.out.println("Your " + amount + " pound is : " + f.format(drham) + " drham");
		} else if (code == 4) {
			// For Euro Conversion
 
			birr = amount * 52.13;
			System.out.println("Your " + amount + " euro is : " + f.format(birr) + " Birr");
 
			dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.90;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
 
			yuan = amount * 7.63;
			System.out.println("Your " + amount + " euro is : " + f.format(yuan) + " Yuan");
 
			drham = amount * 4.32;
			System.out.println("Your " + amount + " euro is : " + f.format(drham) + " drham");
		} else if (code == 5) {
 
			// For Yuan Conversion
 
			birr = amount * 6.83;
			System.out.println("Your " + amount + " yuan is : " + f.format(birr) + " Birr");
 
			dollar = amount * 0.15;
			System.out.println("Your " + amount + " yuan is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.11;
			System.out.println("Your " + amount + " yuan is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.13;
			System.out.println("Your " + amount + " yuan is : " + f.format(euro) + " Euro");
 
			drham = amount * 0.57;
			System.out.println("Your " + amount + " yuan is : " + f.format(drham) + " ringgit");
			//drham conversion
		} else if (code == 6) {
       birr = amount * 12.06;
			System.out.println("Your " + amount + " drham is : " + f.format(birr) + " Birr");
 
			dollar = amount * 0.27;
			System.out.println("Your " + amount + " drham is : " + f.format(dollar) + " dollar");
 
			pound = amount * 0.20;
			System.out.println("Your " + amount + " drham is : " + f.format(pound) + " pound");
 
			euro = amount * 0.23;
			System.out.println("Your " + amount + " drham is : " + f.format(euro) + " euro");
 
			yuan = amount * 1.76;
			System.out.println("Your " + amount + " drham is : " + f.format(yuan) + " yuan");
		} else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Thank you for choosing our  Project");
	}
 
}
/** group names         ID
kibruyisfa Getahun ..... 1069-12
Mamusha Ayano ......... 1096-12
Yohannes Tiruneh ........2108-12
Mandefro Abebe .........0433-09 (Add)
Yared Aschenaki ........1785-12
Wale Mirete ...........1728-12
Azimeraw Molla .........0296-12**/
