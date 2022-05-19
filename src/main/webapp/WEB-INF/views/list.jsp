<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 8:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>회원목록출력</h2>
    <div class="container">

    </div>
   <table>
       <tr>
           <th>id</th>
           <th>memberid</th>
           <th>memberPassword</th>
           <th>memberName</th>
           <th>memberAge</th>
           <th>memberPhone</th>
           <th>조회</th>
           <th>삭제</th>
       </tr>
        <c:forEach items="${memberList}" var="member">
            <tr>
                <th>${id}</th>
                <th>${memberid}</th>
                <th>${memberPassword}</th>
                <th>${memberName}</th>
                <th>${memberAge}</th>
                <th>${memberPhone}</th>
                <td><a href="/detail?id=${member.id}">조회</a></td>
                <%-- 클릭한 회원의 정보를 DB에서 가져와서 detail1.jsp에 출력 --%>
            </tr>
        </c:forEach>
   </table>
</body>
</html>
