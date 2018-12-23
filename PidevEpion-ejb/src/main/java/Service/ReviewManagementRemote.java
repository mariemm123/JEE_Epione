package Service;

import javax.ejb.Remote;

import entity.Review;

@Remote
public interface ReviewManagementRemote {
	public void addReview(Review review);
}
