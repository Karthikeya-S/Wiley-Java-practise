package wiley_core_java;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
//import java.util.Currency;
import java.util.Locale;
public class CurrencyClass {
	public static void main(String[] args) {
//		Currency usd = Currency.getInstance("USD");
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		String formatterVal = nf.format(102.3);
		System.out.println(formatterVal);	
		
		
		//Indian Rupee - INR
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		String formatterVal1 = nf1.format(112.5);
		System.out.println(formatterVal1);
		
		double price = 1990.99;
		Locale local =  new Locale("en", "US");
		NumberFormat formatterVal2 = NumberFormat.getCurrencyInstance(local);
		String finalprice = formatterVal2.format(price);
		System.out.println(finalprice);
		
		//custom Format
		DecimalFormat df = new DecimalFormat("#,##0.00");
		df.setPositivePrefix("%");
		String resval = df.format(price);
		System.out.println("Custom Format: "+resval);
		
		Currency cur = Currency.getInstance("USD");
		String symbol = cur.getSymbol();
		String code = cur.getCurrencyCode();
		System.out.println(symbol+" "+code);
		
		//Exchange Rate Provider
		
	}

}
