<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
			prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" 
			prefix="tiles"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html lang="ko">
  <tiles:insertAttribute name="head"/>
  <link rel="stylesheet" href="${rootPath}/static/css/main.css" />

  <body >	
  
  		<tiles:insertAttribute name="header" />
	<div class="all">
		<div class="btn-1">
		<button class="btn-2">시작</button>
		</div>
		</div>  
  </body>
</html>
