/**
 * 
 */
package com.qhit.sbm.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qhit.sbm.user.bean.User;
import com.qhit.sbm.user.service.UserService;
import com.qhit.sbm.user.service.impl.UserServiceImpl;

/**
 * @author admin
 * 2017��11��13��
 */
public class UserServlet extends HttpServlet {
	private UserService usService = new UserServiceImpl();

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
		case "login":
			doLogin(request, response);
			break;
		case "exit":
			doExit(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @param request
	 * @param response
	 * �˳�����
	 * @throws IOException 
	 */
	private void doExit(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		request.getSession().invalidate();
//		response.sendRedirect("index.jsp");
		PrintWriter out = response.getWriter();
		
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		
		out.print("<script>window.top.location.href='"+basePath+"'</script>");
	}

	/**
	 * @param request
	 * @param response
	 * ��¼����
	 * @throws IOException 
	 */
	private void doLogin(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		boolean isOnline = false;
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		
		User user = usService.doLogin(userName, userPassword);
		
		if(user != null){
			/**
			 * ��½�ɹ�
			 * */
			//�����û���Ϣ���Ự��
			request.getSession().setAttribute("user", user);
			//��ȡ�����û�����
			List<User> users = (List<User>) request.getSession().getServletContext().getAttribute("online");
			for (User user2 : users) {
				if(user2.getUserId() == user.getUserId()){
					//˵����ǰ�û��Ѿ�����,ֱ����ת�Ϳ���
					isOnline = true;
					break;
				}
			}
			if(!isOnline){
				//��ӵ�ǰ�û��������û�����
				users.add(user);
				//���������û�����
				request.getSession().getServletContext().setAttribute("online", users);
			}
			response.sendRedirect("account?cmd=getPageBean");
		}else{
			//��¼ʧ��
			response.sendRedirect("index.jsp?loginMsg=failed");
		}
	}

}
