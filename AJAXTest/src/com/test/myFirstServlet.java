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
		//클라이언트가 접근하면 가장 먼저 처리
		//1. 입력받고 2. 로직처리하고. 3.출력
		//3-1 출력하려는 데이터의 종류를 먼저 알려준다
		response.setContentType("text/html; charset = utf8");
		//3-2 출력하기위한 데이터 연결통로인 stream을 만들어요!
		PrintWriter out = response.getWriter();
		//3-3 연결통로를 통해서 데이터를 클라이언트에게 전달
		out.println("message form server");
		//3-4 데이터출력을 정확히 처리하기 위해 flush작업을 해줘요!
		out.flush();
		//3-5 사용된 자원 해제
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
