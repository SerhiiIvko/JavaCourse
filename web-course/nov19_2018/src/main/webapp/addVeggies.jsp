<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="AddProduct" method="POST">
    Product:<br/><label>
    <input type="text" name="product"/>
</label><br/>
    Price:<br/><label>
    <input type="text" name="price"/>
</label><br/>
    Quantity:<br/><label>
    <input type="text" name="quantity"/>
</label><br/>
    <input type="submit" value="makeOrder"/>
</form>
</body>
</html>