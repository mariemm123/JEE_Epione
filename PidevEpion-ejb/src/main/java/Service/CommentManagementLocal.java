package Service;

import java.util.List;

import javax.ejb.Local;
import entity.Comment;
@Local
public interface CommentManagementLocal {

	
	public List<Comment> getComment() ;
}
