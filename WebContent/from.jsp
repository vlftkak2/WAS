<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="join.jsp" method="get">

		이름 : <input type="text" name="name" value="" /> <br /> <br /> 
		이메일 :
		<input type="text" name="email" value="" /> <br /> <br /> 
		password
		: <input type="password" name="password" value="" /> <br /> <br />
		<br /> 
		성별 : 
		남<input type="radio" name="gender" value="mail" /> 
		여<input type="radio" name="gender" value="femail" checked /> <br /> <br />

		생년 <select name="birthYear">
			<option value="1992">1992년</option>
			<option value="1993">1993년</option>
			<option value="1994">1994년</option>
			<option value="1995">1995년</option>
			<option value="1996">1996년</option>
			<option value="1997">1997년</option>

		</select> </br>
		</br> 
		취미
		수영<input type="checkbox" name="hobby" value="Swimming" /> 
		독서<input type="checkbox" name="hobby" value="Reading" />
	          잠자기<input type="checkbox" name="hobby" value="Sleeping" />
		먹기<input type="checkbox" name="hobby" value="eating" /> 
		
		<br/><br/>
		
		<input type="submit" value="회원가입" />

	</form>

</body>
</html>