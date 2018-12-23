package Bean;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import Service.MedicalPathServiceLocal;

import entity.MedicalPath;





@ManagedBean(name="mp")
@ViewScoped
public class MedicalPathBean {
	
	private String description; 
	private Date dateParcour; 

	
	
	@EJB
	private MedicalPathServiceLocal mdpselo;
	public String doAdd()
	{
		mdpselo.addMedicalPath(new MedicalPath(dateParcour,description));
		return "addmedpath.xhtml?faces-redirect=true";
	
	}
	public List<MedicalPath> ListMedicalPath()
	{
		System.out.println("okkkk");
		
		List<MedicalPath> MedicalPaths=	mdpselo.getAllMedicalPath();
		System.out.println(MedicalPaths.size());
		return MedicalPaths;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateParcour() {
		return dateParcour;
	}
	public void setDateParcour(Date dateParcour) {
		this.dateParcour = dateParcour;
	}
	
	
}


