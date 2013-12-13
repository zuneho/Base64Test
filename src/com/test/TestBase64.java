package com.test;

public class TestBase64 {

	public static void main(String[] args) {

		Base64MDH base64mdh = new Base64MDH();
		// System.out.print("start");

		String test = base64mdh.base64EncodeMDH("D:/test/1231.jpg");
		//System.out.println(test.length());
		base64mdh.base64DecodeMDH(test,"D:/test2", "1231");
		// System.out.print("com");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		System.out.println("---");
		String ad = base64mdh.getCurrentTimeTRIM();
		System.out.println(ad);

	}

}
