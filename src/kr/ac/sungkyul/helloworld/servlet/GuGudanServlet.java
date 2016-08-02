package kr.ac.sungkyul.helloworld.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuGudanServlet
 */
@WebServlet("/gugudan")
public class GuGudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		
		out.println("<h1>구구단</h1>");
		
		out.println("<pre>");
		for(int i=1; i<10; i++){
			
			for(int j=1; j<10; j++){
				
				out.print(j+" x "+i+" = "+j * i);
			
			}
			
			out.println("\n");
			
		}
		out.println("</pre>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
