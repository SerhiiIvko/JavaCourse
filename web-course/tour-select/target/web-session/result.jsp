<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<body>
<center>
    <h1>
        Available tours
    </h1>
        <%
        List result= (List) request.getAttribute("types");
        Iterator iterator = result.iterator();
        out.println("<br>we have: <br><br>");
        while(iterator.hasNext()) {
        out.println(iterator.next() + "<br>");
        }
        %>
</body>
</html>