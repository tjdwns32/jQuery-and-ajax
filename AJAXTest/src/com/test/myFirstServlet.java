package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myFirstServlet
 */
@WebServlet("/first")
public class myFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public myFirstServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� �����ϸ� ���� ���� ó��
		//1. �Է¹ް� 2. ����ó���ϰ�. 3.���
		//3-1 ����Ϸ��� �������� ������ ���� �˷��ش�
		response.setContentType("text/html; charset = utf8");
		//3-2 ����ϱ����� ������ ��������� stream�� ������!
		PrintWriter out = response.getWriter();
		//3-3 ������θ� ���ؼ� �����͸� Ŭ���̾�Ʈ���� ����
		out.println("message form server");
		//3-4 ����������� ��Ȯ�� ó���ϱ� ���� flush�۾��� �����!
		out.flush();
		//3-5 ���� �ڿ� ����
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
