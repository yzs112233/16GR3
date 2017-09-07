/**
 * 
 */
package com.qhit.sbm.account.service;

import java.util.List;

import com.qhit.sbm.common.bean.PageBean;
import com.qhit.sbm.goods.bean.Goods;

/**
 * @author admin
 * 2017��11��13��
 */
public interface AccountService {

	/**
	 * @param pageBean
	 * @return
	 * ��ҳ��ҵ��
	 */
	public PageBean getPageBean(PageBean pageBean);
	
	
	/**
	 * @param goods
	 * @param businessNum
	 * @param providerId
	 * @param isPayed
	 * @return
	 * ����˵�
	 */
	public int addAccount(Goods goods, int businessNum, int providerId, int isPayed);
	
	/**
	 * @param wheres
	 * @param values
	 * @return
	 * ���ݲ�����ѯ
	 */
	public PageBean getPageBeanByParam(List<String> wheres,List<String> values);
	
	
	/**
	 * @param accountId
	 * @return
	 * ɾ��
	 */
	public int deleteAccountById(int accountId);
	
	
	/**
	 * @param accountId
	 * @param providerId
	 * @param isPayed
	 * @return
	 * ����
	 */
	public int upDateAccountById(int accountId, int providerId, int isPayed);
}

