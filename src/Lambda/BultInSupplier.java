package Lambda;

import java.util.function.Supplier;

public class BultInSupplier {
	public static void main(String[] args) {
		Supplier<String> msg = () -> "Happy Birthday Karthi";
		System.out.println(msg.get());
	}
}
