package com.test;

public class Ttest {
	
	
	
	public static void main(String args[])
	{
	String aa = "helloword";
	String bb = "hello";
	String cc = "word";
	String dd = bb+cc;
	String kk = new String("helloword");
	
	Integer ai = 1;
	Integer bi = 1;
	
	Integer c = 100;
	Integer d = 100;
	
	
	
	//System.out.println(ai==bi);
	System.out.println(c==d);
	
	System.out.println(aa.equals(dd));
	System.out.println(aa==kk);
	
	
	System.out.println("-------------------");
			String str = "abc";
			String str1 = "abc";
			String str2 = new String("abc");
			System.out.println(str == str1);
			System.out.println(str1 == "abc");
			System.out.println(str2 == "abc");
			System.out.println(str1 == str2);
			System.out.println(str1.equals(str2));
			System.out.println(str1 == str2.intern());
			System.out.println(str2 == str2.intern());
			System.out.println(str1.hashCode() == str2.hashCode());
	 
	
	
	}

}
