<html>
<head><title>Sign-in Failed Page</title>
</head>
<body>
<%
    String data2 = (String) session.getAttribute("session-uid");
    String result = "Hi " + data2 + ". Id/Password are wrong. Please try Again.";
    out.println(result);
%>
</body>
</html>