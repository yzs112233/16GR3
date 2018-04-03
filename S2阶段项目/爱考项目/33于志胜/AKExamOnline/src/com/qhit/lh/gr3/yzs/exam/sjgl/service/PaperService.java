package com.qhit.lh.gr3.yzs.exam.sjgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.yzs.exam.common.bean.PageBean;
import com.qhit.lh.gr3.yzs.exam.sjgl.bean.Paper;

public interface PaperService {

	/**
	 * @param parameter
	 * @return
	 * 查询试卷列表
	 */
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex);
}
