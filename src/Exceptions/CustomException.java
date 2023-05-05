package Exceptions;

class AgeNotValid extends Exception{
	public AgeNotValid(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "This age is not valid";
	}
	
	@Override
	public String toString() {
		return "Age not applicable";
	}
}
public class CustomException {
	public static void getAge(int age) throws AgeNotValid{
		if(age>18) {
			try {
				throw new AgeNotValid("Age not valid");
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			}
		}
		else {
			System.out.println("Age valid");
		}
	}
	public static void main(String[] args) throws AgeNotValid{
		getAge(20);
	}

}