<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Note"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>笔记查询</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>笔记查询</h1>
	<form action="NoteQueryServlet" method="post">
		笔记类别: <select name="categoryName">
			<option value="游记">游记</option>
			<option value="散文">散文</option>
			<option value="知识">  知识  </option>
		</select> <input type="submit" value="提交">
	</form>
	<c:if test="${!empty note }">
		<table>
			<thead>
				<tr>
					<th>ID</th>
					<th>作者</th>
					<th>笔记标题</th>
					<th>笔记内容</th>
					<th>浏览次数</th>
					<th>类别</th>
					<th>创建时间</th>
					<th>修改时间</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${note}" var="n" varStatus="status">
					<tr>
						<td>${n.noteID}</td>
						<td>${n.author}</td>
						<td>${n.noteTitle}</td>
						<td>${n.noteContent}</td>
						<td>${n.visit}</td>
						<td>${n.categoryName}</td>
						<td>${n.createTime}</td>
						<td>${n.updateTime}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>
</body>
</html>