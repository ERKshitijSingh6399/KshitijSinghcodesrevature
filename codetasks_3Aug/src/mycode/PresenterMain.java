package mycode;


public class PresenterMain {
	public static void main(String[]args) {
		
	BusinessValidation b1=new BusinessValidation();
	try {
		if(b1.isValidemail("ksh@gmail.com"))
		{System.out.println("Pan Validated");}

	}catch(InvalidEmailException e)
		{System.out.println(e.getMessage());}

}
}
