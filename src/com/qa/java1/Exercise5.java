package com.qa.java1;

public class Exercise5 {

	public static void main(String[] args) {
		
		String[] u = {"","one","two","three","four","five","six","seven","eight",
		"nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"	};
		
		String[] t = {"", "", "twenty", "thrity", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		String[] h = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
		
		for (int i = 0; i <= 1000; i++) { 
			if (i < 20) { 
				System.out.println(u[i]);
			}
			else if (i >= 20 && i < 100)  {
				System.out.println(t[i/10] + u[i % 10]);
		}
			else if (i >= 100 && i % 100 < 20 && i < 1000  ) {
				System.out.println(h[i/100] + " " + u[i%100]);
			}
			else if (i >= 100 && i % 100 >= 20 && i < 1000) {
				System.out.println(h[i/100] + " " + t[(i/10)%10] + " " + u[i%10]);

			}
			else { 
				System.out.println("ONE THOUSAND!");
			}

	}

}

}