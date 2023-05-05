package IOPackage;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class BOStream {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fout = new FileOutputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src");
//		BufferedOutputStream bos = new BufferedOutputStream(fout);
//		String str = "My name is Karthikeya S";
//		byte[] b = str.getBytes();
//		//System.out.println(b);
//		try {
//			bos.write(b);
//			//bos.flush();
//			bos.close();
//		}catch(IOException e) {
//			e.getLocalizedMessage();
//		}
		
		FileInputStream fin = new FileInputStream("D:\\Wiley Edge\\Code Practise\\wiley_java\\src\\Datas.txt");
		BufferedInputStream bis = new BufferedInputStream(fin);
		int i;
		while( (i = bis.read())!=-1 ) {
			System.out.println((char)i);
		}		
		bis.close();
		fin.close();
	}
}
