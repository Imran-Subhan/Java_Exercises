package com.qa.java1;

public class Exercise3_CheckString {
	
//	public static void checkString(String anyString) {
//		
//		String y = "hello";
//		
//		int x = y.compareTo(anyString);
//		
//		if(x == 0) {
//		System.out.println("hello hardcoded to y");
//		}
//		else {
//			System.out.println("The input isn't hardcoded");
//		}
//	
//		return;
//	}
//	public static void main(String[] args) {
//		
//		checkString("hello");
//	
//
//}
//}
	
	public static void identicalString(String oneString, String twoString) {
		
		
		int x = oneString.compareTo(twoString);
		
		if(x == 0) {
		System.out.println("These 2 Strings are identical");
		}
		else {
			System.out.println("The 2 Strings are different");
		}
	
		return;
	}
	public static void main(String[] args) {
		
		identicalString("hello","hello");
	

}
}
