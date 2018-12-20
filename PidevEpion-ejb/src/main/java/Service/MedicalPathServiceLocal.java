package Service;

import java.util.List;

import javax.ejb.Local;

import entity.MedicalPath;

@Local
public interface MedicalPathServiceLocal {
	  public void addMedicalPath(MedicalPath m) ;
	  public List<MedicalPath> getAllMedicalPath();
	  
}
