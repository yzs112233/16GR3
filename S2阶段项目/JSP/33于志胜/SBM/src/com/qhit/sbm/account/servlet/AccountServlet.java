/**
 * 
 */
package com.qhit.sbm.account.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qhit.sbm.account.service.AccountService;
import com.qhit.sbm.account.service.impl.AccountServiceImpl;
import com.qhit.sbm.common.bean.PageBean;
import com.qhit.sbm.common.service.CommonService;
import com.qhit.sbm.common.service.impl.CommonServiceImpl;
import com.qhit.sbm.goods.bean.Goods;

/**
 * @author admin
 * 2017��11��13��
 */
public class AccountServlet extends HttpServlet {
	private CommonService commonService = new CommonServiceImpl();
	private AccountService accountService = new AccountServiceImpl();

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cmd = request.getParameter("cmd");
		switch (cmd) {
		case "getPageBean":
			getPageBean(request, response);
			break;
		case "addAccount":
			addAccount(request, response);
			break;
		case "getAccountByParam":
			getAccountByParam(request, response);
			break;
		case "deleteAccount":
			deleteAccount(request, response);
			break;
		case "updateAccount":
			updateAccount(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @param request
	 * @param response
	 * ����
	 * @throws IOException 
	 */
	private void updateAccount(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String accountId = request.getParameter("accountId");
		String providerId = request.getParameter("providerId");
		String isPayed = request.getParameter("isPayed");
		
		int row = accountService.upDateAccountById(
				Integer.parseInt(accountId), 
				Integer.parseInt(providerId), 
				Integer.parseInt(isPayed));
		if(row > 0){
			//���³ɹ�
			response.sendRedirect("account?cmd=getPageBean&&p=1");
		}else{
			//����ʧ��
			PrintWriter out = response.getWriter();
			out.print("<script>alert('����ʧ��');</script>");
		}
	}

	/**
	 * @param request
	 * @param response
	 * ɾ��
	 * @throws IOException 
	 */
	private void deleteAccount(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String accountId = request.getParameter("accountId");
		
		int row = accountService.deleteAccountById(Integer.parseInt(accountId));
		
		if(row > 0){
			//ɾ���ɹ�
			response.sendRedirect("account?cmd=getPageBean&&p=1");
		}else{
			//ɾ��ʧ��
			PrintWriter out = response.getWriter();
			out.print("<script>alert('ɾ��ʧ��');</script>");
		}
	}

	/**
	 * @param request
	 * @param response
	 * @throws IOException 
	 */
	private void getAccountByParam(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String goodsName = request.getParameter("goodsName");
		String isPayed = request.getParameter("isPayed");
		List<String> wheres = new ArrayList<>();
		List<String> values = new ArrayList<>();
		if(goodsName != null && goodsName != ""){
			wheres.add("g.goodsName");
			values.add(goodsName);
		}
		if(isPayed != null && isPayed != ""){
			wheres.add("a.isPayed");
			values.add(isPayed);
		}
		
		PageBean pageBean = accountService.getPageBeanByParam(wheres, values);
		
		request.getSession().setAttribute("pageBean", pageBean);
		
		PrintWriter out = response.getWriter();
		out.print("<script>location.href = 'jsp/admin_bill_list.jsp'</script>");
	}

	/**
	 * @param request
	 * @param response
	 * ����˵���
	 * 1������ҳ��֮ǰ��Ҫ�Ȳ�ѯ���еĹ�Ӧ�̣���Ӧ��ģ�飨����ɣ�
	 * 2�������ύ����Ʒ���Ʋ�ѯ��Ʒ��Ϣ:��Ʒģ��(�����)
	 * 3��������Ʒ��Ϣ���ύ�Ľ������������㽻���ܶ�˵�ģ��
	 * 4,������Ʒ��棨��ѡ��
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void addAccount(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		Goods goods = (Goods) request.getAttribute("goods");
		String businessNum = request.getParameter("businessNum");
		String providerId = request.getParameter("providerId");
		String isPayed = request.getParameter("isPayed");
		
		int row = accountService.addAccount(
				goods, 
				Integer.parseInt(businessNum), 
				Integer.parseInt(providerId), 
				Integer.parseInt(isPayed));
		
		if(row > 0){
			//���¿��
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("goods?cmd=updateStore");
			requestDispatcher.forward(request, response);
			
		}else{
			//���ʧ��
			PrintWriter out = response.getWriter();
			out.print("<script>alert('���ʧ��');</script>");
		}
	}

	/**
	 * @param request
	 * @param response
	 * ��ҳ��ѯ�˵��б�����
	 * @throws IOException 
	 */
	private void getPageBean(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		/**
		 * pagesize=5
		 * data:ʵ����
		 * count��1
		 * pagetotal:2
		 * p:3
		 * */
		PageBean pageBean = new PageBean();
		int count = commonService.getCount("tb_account", null, null);
		pageBean.setCount(count);
		
		String p = request.getParameter("p");
		if(p != null && p != ""){
			//�в���p
			pageBean.setP(Integer.parseInt(p));
		}else{
			//û�в�������һ�ν���
			pageBean.setP(1);
		}
		
		pageBean = accountService.getPageBean(pageBean);
		//��������
		System.out.println(pageBean.getData().size());
		request.getSession().setAttribute("pageBean", pageBean);
		//�ض���
//		response.sendRedirect("jsp/admin_index.jsp");
		if(p != null && p != ""){
			//�в���p
			PrintWriter out = response.getWriter();
			out.print("<script>location.href = 'jsp/admin_bill_list.jsp'</script>");
		}else{
			response.sendRedirect("jsp/admin_index.jsp");
		}
		
	}

}

