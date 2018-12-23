package Bean;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import Service.CommentManagementLocal;
import entity.Comment;

/**
 * Session Bean implementation class CommentBean
 */
@ManagedBean
@SessionScoped
public class CommentBean {
	private Comment c = new Comment();
	@EJB
	private CommentManagementLocal CommentManagementLocal;
    /**
     * Default constructor. 
     */
    public CommentBean() {
        // TODO Auto-generated constructor stub
    }
    
	 public Comment getC() {
		return c;
	}
	public void setC(Comment c) {
		this.c = c;
	}
	public CommentManagementLocal getCommentManagementLocal() {
		return CommentManagementLocal;
	}
	public void setCommentManagementLocal(CommentManagementLocal commentManagementLocal) {
		CommentManagementLocal = commentManagementLocal;
	}
	public List<Comment> getComments() {
		return Comments;
	}
	public void setComments(List<Comment> comments) {
		Comments = comments;
	}

	private List<Comment> Comments;
	    public List<Comment> displayAllComment()
	    {
	    	Comments =CommentManagementLocal.getComment();
	    	return Comments;
	    }

}
