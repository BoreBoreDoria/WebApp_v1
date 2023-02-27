<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>
    <%
        System.out.println("Отработал JSP");
        String test = "test";
        String name =(String) request.getAttribute("name");
        System.out.println(name);
        out.println(name);
       out.println("Your IP address is " + request.getRemoteAddr());   %>
</h2>

<p>Today's date: <%= LocalDateTime.now().toString()%></p>
</body>
</html>
