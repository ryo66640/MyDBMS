<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="../html/header.html" %>
<form action="Insert.action" method="post">
	<p>
		名前<input type="text" name="name" placeholder="登録する名前を入力してください">
		料金<input type="text" name="price" placeholder="料金を入力してください">
		<input type="submit" value="登録">
	</p>
</form>
<a href="../index.jsp">トップに戻る</a>

<%@ include file="../html/footer.html" %>
