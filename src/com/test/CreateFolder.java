package com.test;

import java.io.File;
import java.util.ArrayList;

import com.test.Base64MDH;
public class CreateFolder {
	public static void main(String[] args) {
		String BaseDir = "D:/POHOTO/800/";

		String ADDdir = "";

		ADDdir = "";
		Base64MDH bs64 = new Base64MDH();

		ArrayList<String> folderList = new ArrayList<String>();
		folderList.add("4822033021100090000");
		folderList.add("4822033021100100000");
		folderList.add("4822033021100110001");
		folderList.add("4822033021100110002");
		folderList.add("4822033021100120000");
		folderList.add("4822033021100120001");
		folderList.add("4822033021100130000");
		folderList.add("4822033021100220001");
		folderList.add("4822033021100220002");
		folderList.add("4822033021100630001");
		folderList.add("4822033021100630002");
		folderList.add("4822033021100650001");
		folderList.add("4822033021100700005");
		folderList.add("4822033021100700005");
		folderList.add("4822033021100710003");
		folderList.add("4822033021100720002");
		folderList.add("4822033021100740001");
		folderList.add("4822033021100740002");
		folderList.add("4822033021100740003");
		folderList.add("4822033021100740004");
		folderList.add("4822033021100740005");
		folderList.add("4822033021100750001");
		folderList.add("4822033021100760001");
		folderList.add("4822033021100800001");
		folderList.add("4822033021100800001");
		folderList.add("4822033021100800002");
		folderList.add("4822033021100800003");
		folderList.add("4822033021100800004");



		for (int i = 0; i < folderList.size(); i++) {
			ADDdir = BaseDir + folderList.get(i) + "/";
			System.out.println(ADDdir);
			bs64.createfol(ADDdir);
		}

	}
}
