package wiley_core_java;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer chatH = new StringBuffer();
		
		String sender = "Karthikeya S";
		String msg = "Good morning";
		
		chatH.append(sender).append(": ");
		chatH.append(msg).append("\n");
		
		sender = "Karthik Selva";
		msg = "Good Evening";
		
		chatH.append(sender).append(": ");
		chatH.append(msg).append("\n");
		
		System.out.println(chatH);
	}

}
