/**
 * 
 */
package com.qhit.lh.gr3.yzs.sbm.user.dao;
import java.util.List;
import com.qhit.lh.gr3.yzs.sbm.user.bean.User;



/**
 * @author ��־ʤ
 * TODO
 * 2017��12��7��
 */
public interface UserDao {
	
	/**
	 * @return
	 * ��ѯ���е��û�
	 * @throws Exception 
	 */
	public List<User> getAll() throws Exception;
	
	/**
	 * @param user
	 * @return
	 * ����û�
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * ��䛵Ĕ����L��
	 */
	public User doLogin(String userName,String userPassword);
}
