package IOPackage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordReader {
	DataInputStream dataInput;
	public StudentRecordReader(String inputFile) throws FileNotFoundException{
		dataInput = new DataInputStream(new FileInputStream(inputFile));
	}
	
	public List<students> readAll() throws IOException{
		List<students> listStudent = new ArrayList<>();
		
		try {
			while(true) {
				String name = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();
				
				System.out.println("Name: "+name);
				students student = new students(name,gender,age,grade);
				listStudent.add(student);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		dataInput.close();
		return listStudent;
	}
	public static void main(String[] args) {
		String InputFile = "D:\\Wiley Edge\\Code Practise\\wiley_java\\sr\\datas.dat";
		try {
			StudentRecordReader reader = new StudentRecordReader(InputFile);
			List<students> l = reader.readAll();
			for(students student: l) {
				System.out.println("Name: "+student.getName());
				System.out.println("Gender: "+student.getGender());
				System.out.println("Age: "+student.getAge());
				System.out.println("Grader: "+student.getGrade());
			}
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}
	}
}
