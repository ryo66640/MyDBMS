<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<%@ include file="../html/header.html"%>

<c:forEach var="p" items="${products}" >
	<p>${p.id}:${p.name}:${p.price}</p>
</c:forEach>

<a href="search.jsp">検索に戻る</a>


<%@ include file="../html/footer.html"%>
