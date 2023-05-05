package IOPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class CharacterStreamClass {
	public static void main(String[] args) throws Exception {
		Writer out = new OutputStreamWriter(System.out);
		Writer fw = new FileWriter("D:\\\\Wiley Edge\\\\Code Practise\\\\wiley_java\\\\src\\\\data4.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am a good boy, what to do");
		bw.flush();
		bw.close();
		fw.close();
	}

}
