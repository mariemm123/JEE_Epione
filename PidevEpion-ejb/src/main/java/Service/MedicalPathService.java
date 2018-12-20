package Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entity.MedicalPath;




@Stateless
@LocalBean
public  class MedicalPathService implements MedicalPathServiceRemote, MedicalPathServiceLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public MedicalPathService() {
    
    }
    public void addMedicalPath(MedicalPath m) 
    {
		em.persist(m);
	} 
	public List<MedicalPath> getAllMedicalPath() 
	{System.out.println("ok");
	 TypedQuery<MedicalPath> query= em.createNamedQuery("MedicalPath.findAll", MedicalPath.class);
	 
	
    	System.out.println("ok2");
		return query.getResultList();
	
	}


}
