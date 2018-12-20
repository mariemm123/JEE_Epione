package Service;

import java.util.List;

import javax.ejb.Remote;

import entity.MedicalPath;

@Remote
public interface MedicalPathServiceRemote {
	  public void addMedicalPath(MedicalPath m) ;
	  public List<MedicalPath> getAllMedicalPath();
}
