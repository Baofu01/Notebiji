package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;

import model.Note;
import utils.DataSourceUtils;

public class NoteDao {
	public boolean insertNote(Note note) {
		try {

			QueryRunner r = new QueryRunner(DataSourceUtils.getDataSource());
	        String sql = "INSERT INTO note (author, noteTitle, noteContent, categoryName) VALUES (?,?,?,?)";
	        int i=r.update(sql, note.getAuthor(), note.getNoteTitle(), note.getNoteContent(), note.getCategoryName());
	        if (i>0){
	        	return true;
	        }
	        return false;
		} catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
		    	
    }

	public List<Map<String,Object>> selectNoteByCategoryName(String categoryName) throws SQLException {
		QueryRunner r = new QueryRunner(DataSourceUtils.getDataSource());
        String sql = "select * from note where categoryName=? ";       
        return r.query(sql, new MapListHandler(), categoryName);       
    }
}
