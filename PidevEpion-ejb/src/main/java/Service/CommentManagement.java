package Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entity.Comment;

/**
 * Session Bean implementation class CommentManagement
 */
@Stateless
@LocalBean
public class CommentManagement implements CommentManagementRemote, CommentManagementLocal {

    /**
     * Default constructor. 
     */
	
	@PersistenceContext
	EntityManager em ;
    public CommentManagement() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public List<Comment> getComment() {
		List<Comment> query=em.createQuery("select e from Comment e",
				Comment.class).getResultList();
		return query ;
	}

}
