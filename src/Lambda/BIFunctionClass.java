package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BIFunctionClass {
	public static void main(String[] args) {
		UnaryOperator<Integer> nn = a -> a^ 1;
		System.out.println(nn.apply(0));
		
		BinaryOperator<Integer> n = (a,b) -> a & b;
		System.out.println(n.apply(10, 6));
	}
}
