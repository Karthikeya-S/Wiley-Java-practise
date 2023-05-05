package wiley_core_java;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberClass {
	public static void main(String[] args) {
		BigDecimal num1 = new BigDecimal("22");
		BigDecimal num2 = new BigDecimal("7");
		
		BigDecimal res = num1.divide(num2, 3, RoundingMode.HALF_UP);
		System.out.println(res);
	}
}
