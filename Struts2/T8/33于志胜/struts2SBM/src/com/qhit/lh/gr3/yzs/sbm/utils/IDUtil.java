package com.qhit.lh.gr3.yzs.sbm.utils;
/**
 * @author ��־ʤ
 * TODO
 * 2017��12��7��
 */
import java.util.UUID;

public class IDUtil {

	public static String getUUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
