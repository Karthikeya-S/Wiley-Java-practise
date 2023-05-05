package wiley_core_java;

public class friday_21 implements Cloneable{
	//CREATE CLASS
	int a = 10;
	public void add() {
		System.out.println("Number adding");
		
	}
	int val1 = 20;
	int val2 = 32;
	public void sum(int val, int val0) {
		int val1 = 22;
		int val2 = 23;
		//System.out.println("Sum of 2 numbers is : "+(this.val1+this.val2));
		
		this.sub(val1, val2);
	}
	public void sub(int a,int b) {
		int val = val1-val2;
		System.out.print("Value: "+val);
	}
	static int mul(int a, int b) {
		return a*b;
	}
	static String name = "Karthikeya";
	int ins = 20;
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		//create object with new operator
		friday_21 f = new friday_21();
		f.add();
		System.out.println(f);
		
		//create object with new Instance
		try {
			Class f1 = Class.forName("wiley_core_java.friday_21");
			
			friday_21 fi = (friday_21) f1.newInstance();
			
			fi.add();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//create object using object clone
		friday_21 objClone = (friday_21) f.clone();
		
		objClone.add();
		
		System.out.println("Clone: "+ objClone);
		
		
		//Understanding local variable,instance variable and this keyword
		int loc = 10;
		System.out.println("Local variable : "+loc);
		System.out.println("Instance variable : "+f.ins);
		System.out.println("Name: "+ name);
		f.sum(10,20);
		System.out.println();
		//static method
		System.out.println(mul(20,11));
	}
}