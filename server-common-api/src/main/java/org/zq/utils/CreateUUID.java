package org.zq.utils;

import java.util.UUID;

public class CreateUUID {

	public static String getuuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
		
	
}
