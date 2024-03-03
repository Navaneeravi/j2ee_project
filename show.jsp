<%@page import = "com.j2eeproject.modtel.Student"%>
<%@page import = "java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Student Details </h1>

<%
ArrayList<Student> al = (ArrayList<Student>) request.getAttribute("student");
%>
<table border="2">
<%
for(Student s : al)
{
%>
 <tr bgcolor="green"><td><%= s.getStudid() %></td>
     <td><%= s.getName() %></td>
     <td><%= s.getDegree() %></td>
     <td><%= s.getStream() %></td>
     <td><%= s.getMailid() %></td>
     <td><%= s.getState() %></td>
  </tr>
                    
<%
}
%>
</table>

</body>
</html>