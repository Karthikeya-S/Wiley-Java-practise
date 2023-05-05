package IOPackage;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileStream {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src\\data4.txt");	
//		FileOutputStream fout = new FileOutputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src\\data4.txt");	
//		String str = "Karthikeya S";
//		byte[] b = str.getBytes();
//		fout.write(b);
//		fout.flush();
//		fout.close();
		int i=0;
		while((i=fin.read())!=-1) {
			System.out.println((char) i);
		}
		fin.close();
	}

	
}