package com.test;

import java.util.ArrayList;

public class CREATESELECT {
	public static void main(String[] args) {
		String MEM_NO = "56001";
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
	String testext =
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','000','','TEST1.JPG') from dual; " +
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','000','','TEST2.JPG') from dual; "+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','000','','TEST3.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','000','','TEST4.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','100','','TEST1.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','100','','TEST2.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','100','','TEST3.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','100','','TEST4.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','800','','TEST1.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','800','','TEST2.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','800','','TEST3.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','800','','TEST4.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','920','','TEST1.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','920','','TEST2.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','920','','TEST3.JPG') from dual;"+
					" select oraagim.MS_INSERT_OR_DELETE_PHOTO('0','"+MEM_NO+"', '"+folderList.get(i)+"','920','','TEST4.JPG') from dual;";
		System.out.println(testext);	
		}	
	}
}
