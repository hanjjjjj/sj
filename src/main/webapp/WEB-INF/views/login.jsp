<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 7:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>로그인페이지</h2>
    <form action="/login" method="post">
        아이디: <input type="text" name="memberId">
        비번: <input type="password" name="memberPassword">
        <input type="submit" value="로그인">
    </form>
</body>
</html>
