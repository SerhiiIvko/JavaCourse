<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="true" %>
<html>
<head>
    <title>Session Tracking</title>
</head>
<body>
<%
    Integer visitCount = 0;
    String visitCountKey = "visitCount";
    if (session.isNew()) {
        session.setAttribute(visitCountKey, visitCount);
    }
    visitCount = (Integer) session.getAttribute(visitCountKey);
    visitCount = visitCount + 1;
    session.setAttribute(visitCountKey, visitCount);
%>

<center>
    <tr>
        <td>Number of visits:</td>
        <td>
            <%
                out.print(visitCount);
            %>
        </td>
    </tr>
</center>
</body>
</html>