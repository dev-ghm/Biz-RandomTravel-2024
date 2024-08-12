<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>	
<header>
</header>
<nav class="main">
	<ul>
		<li class="home"><a href="${rootPath}/">랜덤여행</a></li>
		<li class="notice"><a href="${rootPath}/">자유게시판</a></li>
		<li class="student"><a href="${rootPath}/">여행 테마</a></li>
		<li class="login"><a href="${rootPath}/user/login">로그인</a></li>
		<li class="join"><a href="${rootPath}/user/join">회원가입</a></li>
	</ul>
</nav>