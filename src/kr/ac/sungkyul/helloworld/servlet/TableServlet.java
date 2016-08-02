package kr.ac.sungkyul.helloworld.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		
		int nRow=Integer.parseInt(row);
		int nCol=Integer.parseInt(col);
		
		//header
		response.setContentType("text/html; charset=utf-8");
		
		//body
		PrintWriter out=response.getWriter();
		
		out.println("<table>");
		
		for(int i=0; i<nRow; i++){
			out.println("<tr>");
			
			for(int j=0; j<nCol; j++){
				
				out.println("<td>cell("+i+","+j);
			}
					
					out.println("</tr>");

		}
		
		
		out.println("</table>");
		
		out.println(nRow);
		out.println("<br>");
		out.println(nCol);
		
		System.out.println(nRow+":"+nCol); //콘솔한테 뿌린다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
