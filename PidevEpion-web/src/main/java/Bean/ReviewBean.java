package Bean;



import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Service.ReviewManagement;
import entity.Review;




/**
 * Session Bean implementation class RdvBean
 */
@ManagedBean
@SessionScoped
public class ReviewBean {
	private Review review= new Review();
	@EJB
	private ReviewManagement ReviewManagementLocal;
    /**
     * Default constructor. 
     */
    public ReviewBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String doAdd(){
    	ReviewManagementLocal.addReview(review);
    	return "/listReview.xhtml?faces-redirect=true";
    }

	public Review getReview() {
		return review;
	}
	
	 private List<Review> Reviews;
	    public List<Review> displayAllReview(){
	    	Reviews =ReviewManagementLocal.getAllReview();
	    	return Reviews;
	    }
	    
	    public int removeReview (int ReviewId)
	    {
	    	ReviewManagementLocal.deleteReviewbyid(ReviewId);
	    	System.out.println("supprimee2");
	    	return ReviewId;
	    }

	public void setReview(Review review) {
		this.review = review;
	}

	public ReviewManagement getReviewManagementLocal() {
		return ReviewManagementLocal;
	}

	public void setReviewManagementLocal(ReviewManagement reviewManagementLocal) {
		ReviewManagementLocal = reviewManagementLocal;
	}
    
    

}
