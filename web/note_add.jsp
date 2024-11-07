<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>添加笔记</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <h1>添加笔记</h1>
    <form action="NoteAddServlet" method="post">
        作&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;者: <input type="text" name="author" required><br>
        笔记标题: <input type="text" name="noteTitle" value="" required><br>
        笔记内容: 
        <textarea id="comment" name="noteContent" rows="4" cols="50" required></textarea><br>
        笔记类别: 
		        <select name="categoryName">
				  <option value="游记">  游记  </option>
				  <option value="散文">  散文  </option>
				  <option value="知识">  知识  </option>
				</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        
        <input type="submit" value=" 提 交 ">
    </form>
    <%
        String success = request.getParameter("success");
        if (success != null && success.equals("1")) {
            out.println("<p>笔记添加成功</p>");
        } else if (success != null && success.equals("0")) {
            out.println("<p>笔记添加失败</p>");
        }
    %>
</body>
</html>