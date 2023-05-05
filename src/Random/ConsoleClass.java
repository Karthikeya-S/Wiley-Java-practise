package Random;

import java.io.Console;

public class ConsoleClass {
	public static void main(String[] args) {
		Console console = System.console();
		if(console == null) {
			System.out.println("Console not available");
			System.exit(1);
		}
		
		String name = console.readLine("Username: ");
		char[] password = console.readPassword("Enter password: ");
		
		console.printf("Hello, %s\n",name);
		console.printf("Your password is %s\n", new String(password));
	}
}
