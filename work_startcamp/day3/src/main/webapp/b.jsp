<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
    //자바 공간
    System.out.println("서버");
    String num1 = request.getParameter("aaa");
    String num2 = request.getParameter("bbb");
    
    System.out.println("aaa : " + num1 + ", bbb :" + num2);
    int result = Integer.parseInt(num1) + Integer.parseInt(num2);
    System.out.println("result :" + result);
    
	String[] langs = request.getParameterValues("lang");
	for(String s : langs){ result);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
결과페이지<br>
결과값<br>
<%= "결과값" %>
<script type="text/javascript">
console.log('aa')
</script>
</body>
</html>