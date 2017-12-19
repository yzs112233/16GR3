package com.qhit.lh.gr3.yzs.sbm.utils;
/**
 * @author 于志胜
 * TODO
 * 2017年12月7日
 */
import java.util.UUID;

public class IDUtil {

	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
