/**
 * 
 */
package com.qhit.sbm.provider.service.impl;

import java.util.List;

import com.qhit.sbm.provider.bean.Provider;
import com.qhit.sbm.provider.dao.impl.ProviderDaoImpl;
import com.qhit.sbm.provider.service.ProviderService;

/**
 * @author admin
 * 2017Äê11ÔÂ13ÈÕ
 */
public class ProviderServiceImpl implements ProviderService {

	public List<Provider> getAllProvider() {
		// TODO Auto-generated method stub
		return new ProviderDaoImpl().getAllProvider();
	}

}
