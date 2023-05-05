package Random;

import java.io.RandomAccessFile;

public class RandomAccessClass {
	public static void main(String[] args) {
		try {
			RandomAccessFile file = new RandomAccessFile("testfile.txt","rw");
			file.writeBytes("Hello Wiley");
			
			file.seek(0);
			byte[] bytes = new byte[13];
			file.read(bytes);
			String data = new String(bytes);
			System.out.println(data);
			file.seek(7);
			file.writeBytes("Kart");
			
			//read modified data back from the file
			file.seek(0);
			bytes = new byte[13];
			file.read(bytes);
			data = new String(bytes);
			
			System.out.println(data);
			file.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
