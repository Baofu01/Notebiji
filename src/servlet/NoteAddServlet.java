package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Note;
import service.NoteService;



@WebServlet("/NoteAddServlet")
public class NoteAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final NoteService noteService = new NoteService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String author = request.getParameter("author");
        String noteTitle = request.getParameter("noteTitle");
        String noteContent = request.getParameter("noteContent");
        String categoryName = request.getParameter("categoryName");
        Note note = new Note(author, noteTitle, noteContent, categoryName);
        
        boolean success = noteService.insertNote(note);
        if (success) {        	
            response.sendRedirect("note_add.jsp?success=1");
        } else {
        	System.out.println("º”»Î± º« ß∞‹");
            response.sendRedirect("note_add.jsp?success=0");
        }
	}

}
