/**
 * 
 */
package com.qhit.sbm.common.dao;

import java.util.List;

/**
 * @author admin
 * 2017��11��14��
 */
public interface CommonDao {
	/**
	 * @param tableName
	 * @param wheres
	 * @param values
	 * @return
	 * �ܼ�¼����ҵ��
	 */
	public int getCount(String tableName, List<String> wheres, List<String> values);
}
