package IOPackage;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*; 

import IOPackage.students;

public class studentoutput {
	DataOutputStream dataOutput;
	public studentoutput() throws IOException {
		dataOutput = new DataOutputStream(new FileOutputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src\\Students Record.txt"));
	}
	public void writer(students student) throws IOException {
		dataOutput.writeUTF(student.getName());
		dataOutput.writeBoolean(student.getGender());
		dataOutput.writeInt(student.getAge());
		dataOutput.writeFloat(student.getGrade());
	}
	public void save() throws IOException {
		dataOutput.close();
	}
	public static void main(String[] args) throws IOException {
		if(args.length < 1) {
			System.out.println("Please provide output file");
			System.exit(0);
		}
		List<students> listStudent = new ArrayList<>(); 
		listStudent.add(new students("Karthikeya S",true,21,92.4f));
		listStudent.add(new students("Karthik Selvakumar",true,21,95.6f));
		listStudent.add(new students("Vijay",true,45,91.1f));
		listStudent.add(new students("Nandhini",false, 25, 95.1f));
		try {
			studentoutput outputWriter = new studentoutput();
			for(students student: listStudent) {
				outputWriter.writer(student);
			}
			outputWriter.save();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}