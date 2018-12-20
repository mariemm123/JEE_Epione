package Test;



import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import Service.ConsommationRemote;
import Service.MedicalPathServiceRemote;


public class Consommation {
public static void main(String[] args) throws NamingException {
		
		
	
	InitialContext cxt = new InitialContext();
	Object Object = cxt.lookup("PidevEpion-ear/PidevEpion-ejb/Consommation!Service.ConsommationRemote");
	ConsommationRemote client =  (ConsommationRemote) Object ;

	System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkk");
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	/*	Context context=new InitialContext();
	Object obj=context.lookup("PidevEpion-ear/PidevEpion-ejb/Consommation!Service.ConsommationRemote");
	ConsommationRemote proxy=(ConsommationRemote)obj;
	//proxy.addMedicalPath(m);
proxy.ConsommationMedPath();
System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkk");*/
	
}
}