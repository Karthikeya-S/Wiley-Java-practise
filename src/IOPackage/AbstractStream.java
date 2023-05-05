package IOPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AbstractStream {
	public static void main(String[] args) throws IOException {
		OutputStream fout = new FileOutputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src\\data4.txt");
		int i=0;
		String str = "Karthikeya S- Java Programmer";
		byte[] b = str.getBytes();
		fout.write(b);
//		while((i=fout.read())!=-1) {
//			System.out.println((char) i);
//		}
		fout.flush();
		fout.close();
	}
}
