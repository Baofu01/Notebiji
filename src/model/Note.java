package model;

public class Note {
	private int noteID;
	private String author;  //作者
    private String noteTitle;  //标题
    private String noteContent;  //内容
    private int visit;
    private String categoryName;  //类型
    private String createTime;
    private String updateTime;
    
	public Note(String author, String noteTitle, String noteContent, String categoryName) {
		super();
		this.author = author;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.categoryName = categoryName;
		this.visit = 0;
		this.createTime = "";
		this.createTime = "";
	}

	
	
	public Note(int noteID, String author, String noteTitle, String noteContent, int visit, String categoryName,
			String createTime, String updateTime) {
		super();
		this.noteID = noteID;
		this.author = author;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.visit = visit;
		this.categoryName = categoryName;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Note() {
        super();
    }

	public int getNoteID() {
		return noteID;
	}



	public void setNoteID(int noteID) {
		this.noteID = noteID;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getNoteTitle() {
		return noteTitle;
	}



	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}



	public String getNoteContent() {
		return noteContent;
	}



	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}



	public int getVisit() {
		return visit;
	}



	public void setVisit(int visit) {
		this.visit = visit;
	}



	public String getCategoryName() {
		return categoryName;
	}



	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}



	public String getCreateTime() {
		return createTime;
	}



	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}



	public String getUpdateTime() {
		return updateTime;
	}



	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}



	@Override
	public String toString() {
		return "Note [noteID=" + noteID + ", author=" + author + ", noteTitle=" + noteTitle + ", noteContent="
				+ noteContent + ", visit=" + visit + ", categoryName=" + categoryName + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}



	
    
	
}
