<%@ page import = " java.util.* " %>
<html>
<body>
<%
    String username=request.getParameter("uname");
    String password=request.getParameter("pass");
    out.println("Name: "+username+" Password: "+password);
%>
</body>
</html>