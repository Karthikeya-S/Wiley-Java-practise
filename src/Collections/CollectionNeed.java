package Collections;

class Book{}
class Student{}
public class CollectionNeed {
	public static void main(String[] args) {
		Student[] students = new Student[10]; //1. Fixed in size
		students[0] = new Student();
		students[1] = new Student();
		//students[2] = new Book();		2. Contains only homogeneous data elements
		// 3. ready made APIs support is not available 
	}

}
