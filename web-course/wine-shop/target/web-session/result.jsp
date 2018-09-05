<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Available Brands
    </h1>
        <%
        List result= (List) request.getAttribute("brands");
        Iterator it = result.iterator();
        out.println("<br>We have <br><br>");
        while(it.hasNext()){
        out.println(it.next()+"<br>");
        }
        %>
</body>
</html>