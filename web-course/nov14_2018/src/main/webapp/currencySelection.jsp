<%--
  Created by IntelliJ IDEA.
  User: ivko
  Date: 04.12.18
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<p>Select your preferred currency pair</p>
<form method="post" action="/save-exchange-rates-pair">
    <input type="radio" name="currencyPair" value="USD/EUR">USD/EUR<br/>
    <input type="radio" name="currencyPair" value="USD/CAD"> USD/CAD<br/>
    <input type="radio" name="currencyPair" value="USD/AUD"> USD/AUD<br/>
    <input type="submit" value="Submit">
</form>
</html>