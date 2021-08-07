package mycode;

public class BusinessValidation {
	public boolean isValidemail(String email) throws InvalidEmailException{
		boolean x= false ;
		int i=email.indexOf("@");
	if(email.length()>=6 && email.contains("@") && (email.substring(i).contains(".com") && email.substring(0,i).matches("[a-zA-Z0-9]{1,}")))
			{x= true;}
	
	else { throw new InvalidEmailException("Entered Email "+email+" is INVALID") ;
	}
	return x ;
	}
	
}
