/**
 * 
 */
package com.qhit.sbm.goods.dao;

import com.qhit.sbm.goods.bean.Goods;

/**
 * @author admin
 * 2017��11��13��
 */
public interface GoodsDao {

	/**
	 * @param goodsName
	 * @return
	 * ������Ʒ����ȥ��ѯ��Ʒ��Ϣ
	 */
	public Goods getGoodsInfoByName(String goodsName);
	
	/**
	 * @param num
	 * @return
	 * ���¿��
	 */
	public int updateStore(int num, int goodsId);
}