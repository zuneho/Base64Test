package com.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.html.ImageView;

import com.sds.mobiledesk.mdhybrid.common.Base64;

public class Base64MDH {

	public Base64MDH() {

	}
	/**
	 * Base64 이미지를 디코딩하여 서버내의 특정 위치에 이미지 파일을 생성하는 함수(로그 수집용)
	 * 
	 * @param base64ByteString
	 *            (String) Base64로 인코딩된 데이타
	 */
	@SuppressWarnings("static-access")
	public boolean base64DecodeMDH(String base64ByteString, String filePath,
			String fileName) {
		boolean boolResult = false;

		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdirs();
		}

		file = new File(filePath + "/" + fileName + ".jpg");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

		Base64 base64 = new Base64();
		FileOutputStream imageOutput = null;
		ByteBuffer bb = ByteBuffer.wrap(base64.decode(base64ByteString));
		bb.order(ByteOrder.LITTLE_ENDIAN); // 저장방식 설정
		bb.put(base64.decode(base64ByteString));

		try {
			imageOutput = new FileOutputStream(file);
			imageOutput.write(base64.decode(base64ByteString));
			imageOutput.close();
			bb.clear();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		boolResult = true;
		return boolResult;
	}

	@SuppressWarnings("static-access")
	public String base64EncodeMDH2(String FilePath) {
		Base64 base64 = new Base64();
		String strResult = "";
		ByteArrayOutputStream ous = null;
		FileInputStream ios = null;
		try {
			byte[] buffer = new byte[4096];
			ous = new ByteArrayOutputStream();
			try {
				ios = new FileInputStream(FilePath);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int read = 0;
			try {
				while ((read = ios.read(buffer)) != -1) {
					ous.write(buffer, 0, read);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ByteBuffer bb = ByteBuffer.wrap(base64.encode(ous.toByteArray()));
			bb.order(ByteOrder.LITTLE_ENDIAN); // 저장방식 설정
			bb.put(base64.encode(ous.toByteArray()));
			for (int i = 0; i < bb.limit(); i++) {
				System.out.println(bb.get(i));
				strResult = strResult + bb.get(i);
			}

		} finally {
			try {
				if (ous != null)
					ous.close();
			} catch (IOException e) {
			}

			try {
				if (ios != null)
					ios.close();
			} catch (IOException e) {
			}
		}
		return strResult;
	}

	public String base64EncodeMDH(String FilePath) {
		Base64 base64 = new Base64();
		String byteResult = null;
		File file = new File(FilePath);
		System.out.println(file.exists() + "!!");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		byte[] buf = new byte[1024];
		try {
			for (int readNum; (readNum = fis.read(buf)) != -1;) {
				bos.write(buf, 0, readNum);
			}
		} catch (IOException ex) {
			// Logger.getLogger(ConvertImage.class.getName()).log(Level.SEVERE,
			// null, ex);
		}
		byte[] bytes = bos.toByteArray();
		// bytes is the ByteArray we need

		/*
		 * The second part shows how to convert byte array back to an image file
		 */
		byte[] base = base64.encode(bytes);
		byteResult = new String(base);
		System.out.println(byteResult);

		// System.out.print(strResult);
		return byteResult;

	}
	
	public String getCurrentTimeTRIM() {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmss");
		return sdf.format(currentDate);
	}
	
	public  boolean createfol(String filePath){
		boolean boolResult = true;

		File file = new File(filePath);
		if (!file.exists()) {
			file.mkdirs();
		}
		return boolResult;
		
	}

	
}
