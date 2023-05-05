package wiley_core_java;


public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		long timestamp = System.currentTimeMillis();
		sb
			.append("[")
			.append(timestamp)
			.append("]");
		int userId = 12234;
		sb.append("User ").append(userId).append(": ");
		String msg = "Login Successfully";
		sb.append(msg);
		System.out.println(sb);
	}

}
