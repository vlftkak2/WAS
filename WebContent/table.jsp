<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	String row = request.getParameter("r");
	String col = request.getParameter("c");
	
	int nRow=Integer.parseInt(row);
	int nCol=Integer.parseInt(col);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title> 
</head>
<body>
     <h1><%=nRow%>x<%=nCol%>테이블</h1>
	<table border="1px" cellspacing="0" cellpadding="5px">
	
	<%
	for(int i=0; i<nRow; i++){
		
	
	%>
		<tr>
		<td>cell(<%=i %>,0)</td>
		<td>cell(<%=i %>,1)</td>
		<td>cell(<%=i %>,2)</td>
		</tr>
		<tr>
		<%
	               }
		%>

	</table>

</body>
</html>