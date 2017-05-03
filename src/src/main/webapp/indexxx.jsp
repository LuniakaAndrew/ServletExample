<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ServletExample</title>
</head>
<body>
<h1>Hello Servlet from ${name}</h1>
<form action="HelloForm" method="POST">
    First Name: <input type="text" name="first_name">
    <br />
    Last Name: <input type="text" name="last_name" />
    <input type="submit" value="Submit" />
</form>

</body>
</html>