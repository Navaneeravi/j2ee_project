<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>INSERT STUDENT INFORMATION BELOW</h1>
<form action="insertstudent" method="post">
Name : <input type = "text" name="name" placeholder="ENTER NAME"/><br><br>
Degree : <input type = "text" name="degree" placeholder="ENTER DEGREE"/><br><br>
Stream : <input type ="text" name="stream" placeholder="ENTER STREAM"/><br><br>
E-mail : <input type ="email" name="mailid" placeholder="ENTER EMAIL"/><br><br>
state : <input type ="text" name ="state" placeholder="ENTER NATIVE-PLACE"/><br><br> 

<input type = "submit" value="insert student"/>

</form>

</body>
</html>