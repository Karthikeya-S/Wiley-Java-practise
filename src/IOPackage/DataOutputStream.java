package IOPackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class DataOutputStream {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("D:\\\\Wiley Edge\\\\Code Practise\\\\wiley_java\\\\src\\\\Datas1.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeBytes("I am Karthikeya S");
//		dos.flush();
//		dos.close();
		
		FileInputStream fin = new FileInputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src\\Datas1.txt");
		
		DataInputStream dis = new DataInputStream(fin);
		int count = fin.available();
		byte[] ba = new byte[count];
		dis.read();
		for(byte b: ba) {
			System.out.println((char)b);
		}
		dis.close();
		fin.close();
	}
}
