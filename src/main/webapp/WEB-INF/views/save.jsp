<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 6:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>회원가입정보</h2>
    <form action="/save" method="post">
        계정: <input type="text" name="memberId"><br>
        비밀번호: <input type="password" name="memberPassword"><br>
        이름: <input type="text" name="memberName"><br>
        나이: <input type="text" name="memberAge"><br>
        전화번호: <input type="text" name="memberPhone"><br>
        <input type="submit" value="전송">
    </form>
</body>
</html>
