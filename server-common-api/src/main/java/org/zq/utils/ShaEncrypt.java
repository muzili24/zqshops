package org.zq.utils;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/**
 * @author sivan 
 * 2016�?5�?9日下�?4:45:58
 * sha密码处理�?
 */
public class ShaEncrypt {
	/**
	 * 
	 * @param inStr
	 *            明文
	 * @return 密文
	 * @throws Exception
	 */
	public static String shaEncode(String inStr)  {
		MessageDigest sha = null;
		try {
			sha = MessageDigest.getInstance("SHA");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}

		byte[] byteArray=null;
		try {
			byteArray = inStr.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] md5Bytes = sha.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		return hexValue.toString();
	}

	/**
	 * 测试主函�?
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		String str = new String("111111");
		System.out.println("SHA后：" + shaEncode(str));
	}
}