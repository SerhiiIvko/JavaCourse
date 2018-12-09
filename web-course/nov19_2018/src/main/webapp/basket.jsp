<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>

<html>
<head>
    <title>Basket</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: black;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: black;
        }

        .tg .tg-s268 {
            text-align: left
        }
    </style>
</head>
<body>
<%
    String thisUser = null;
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("thisUser")) {
                thisUser = cookie.getValue();
            }
        }
    }
%>
<h3>Welcome, </h3>
<%
    if (thisUser != null) {
        out.println(thisUser);
    }
%>
<h2>Your order</h2>
<table class="tg">
    <tr>
        <td class="tg-s268">product</td>
        <td class="tg-s268">price</td>
        <td class="tg-s268">quantity</td>
    </tr>
    <tr>
        <td class="tg-s268"><%out.println(session.getAttribute("product"));%></td>
        <td class="tg-s268"><%out.println(session.getAttribute("price"));%></td>
        <td class="tg-s268"><%out.println(session.getAttribute("quantity"));%>
        </td>
    </tr>
</table>
<h3>Total payment:
    <%
        double price = Double.parseDouble((String) session.getAttribute("price"));
        double quantity = Double.parseDouble((String) session.getAttribute("quantity"));
        out.println(price * quantity);
    %></h3>
</body>
</html>