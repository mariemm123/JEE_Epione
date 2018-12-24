package utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import Service.ReviewManagementLocal;
import Service.UserManagementLocal;
import entity.Review;



@Singleton
@Startup
public class DBPopulation {
	@EJB
	UserManagementLocal um;
	ReviewManagementLocal rl ;
	Review r = new Review("nonono",(float) 15);
		//User u1=new User("nom4","login4","mdp4","mm");
		//User u2=new User("nom4","login4","mdp4");
		
	@PostConstruct
	public  void Init()
	{
		//um.addUser(u1);
		//rl.addReview(r);
		//rl.deleteReviewbyid(r.getId());
		//um.addUser(u2);
	}

}
