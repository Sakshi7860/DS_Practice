package Practice;

public class Exception1 {

	
		static void validate(int data){
			try{
			     ExpP2 exp=new ExpP2();
			     exp.sum(data);
			   }

			catch(Exception ex)
			{
			    System.out.println("Exception is : "+ ex.getMessage());
			}
			}
		

		 public static void main(String args[]){
		      validate(13);
		      System.out.println("rest of the code...");
		  }

}
