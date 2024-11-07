package servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.NoteService;



@WebServlet("/NoteQueryServlet")
public class NoteQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final NoteService noteService = new NoteService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");		
		String categoryName = request.getParameter("categoryName"); 
		List<Map<String, Object>> note = noteService.selectNoteByCategoryName(categoryName);
		request.setAttribute("note", note);
        request.getRequestDispatcher("/note_query.jsp").forward(request, response);
	}

}
