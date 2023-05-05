package wiley_core_java;

interface bank{
	void account();
}
interface bank1{
	void account();
}
interface atm extends bank,bank1{
	void insertcard();
	void selectoption();
	void enterpasscode();
	
}
interface aa{
	void m1();
	
}
abstract class newatm implements atm,aa{
	public void account() {}
	public void m1(){}
}
public class InterfaceBank extends newatm{
	public void insertcard() {
		System.out.println("Insert card");
	}
	@Override
	public void selectoption() {
		System.out.println("Select option");
	}
	@Override
	public void enterpasscode() {
		System.out.println("Enter the passcode");
	}

}
