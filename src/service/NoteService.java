package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import dao.NoteDao;
import model.Note;



public class NoteService {
	private final NoteDao noteDao = new NoteDao();
	
	public boolean insertNote(Note note) {
        return noteDao.insertNote(note);
    }
	
	public List<Map<String,Object>> selectNoteByCategoryName(String categoryName) {
        List<Map<String,Object>> list=null;
        try {
            list=noteDao.selectNoteByCategoryName(categoryName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
