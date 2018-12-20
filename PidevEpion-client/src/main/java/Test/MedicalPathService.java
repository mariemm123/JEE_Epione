package Test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Service.MedicalPathServiceRemote;
import entity.MedicalPath;

public class MedicalPathService {
	public static void main(String[] args) throws NamingException {
		
		
		MedicalPath m=new MedicalPath(new Timestamp(2),"zzzzzzzzzzzzz");
		
		
		
		Context context=new InitialContext();
	String jndiName="PidevEpion-ear/PidevEpion-ejb/MedicalPathService!Service.MedicalPathServiceRemote";
	MedicalPathServiceRemote proxy=(MedicalPathServiceRemote)context.lookup(jndiName);
	proxy.addMedicalPath(m);

	System.out.println("fffffffffffffffffff");
}
}
