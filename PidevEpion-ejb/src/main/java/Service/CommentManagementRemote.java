package Service;

import java.util.List;

import javax.ejb.Remote;
import entity.Comment;

@Remote
public interface CommentManagementRemote {

	
	public List<Comment> getComment() ;
}
