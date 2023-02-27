<html>
<head><title>Success Page</title>
</head>
<body>
<%
    String data=(String)session.getAttribute("session-uid");
    String result ="Welcome "+ data+"!!";
    out.println(result);
%>
</body>
</html>