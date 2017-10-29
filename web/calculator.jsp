<%--
  Created by IntelliJ IDEA.
  User: lampstudio
  Date: 10/30/2017
  Time: 1:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form>
    <h2> Phep Cong 1</h2>
    <input name="a" value="${param.a}"/>+<input name="b" value="${param.b}"/>
    <button > = </button>
    <label>${param.a+param.b}</label>
    <h2> Phep Nhan 2</h2>
    <input name="c" value="${param.c}"/>+<input name="d" value="${param.d}"/>
    <button > = </button>
    <label>${param.c*param.d}</label>
</form>

</body>
</html>
