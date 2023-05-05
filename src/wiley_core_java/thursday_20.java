package wiley_core_java;

enum weekday{
    MONDAY,TUESDAY,WEDNESDAY, THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class thursday_20 {
	    public static void main(String[] args) {
	        long a = 500;
	        double b = a;   //Type-Casting
	        System.out.println(b);
	        String s = "100";
	        int b1 = Integer.parseInt(s);
	        System.out.println(b1);

	        weekday day = weekday.MONDAY;
	        System.out.println(day);
	        System.out.println();
	        for(weekday wd: weekday.values()){
	            System.out.println(wd);
	        }
	        
	        int a1 = 5000, b2 = 2000, c = 3500, d = 675;
	        int tot = calc(a1,b2,c,d);
	        float disc = 0;
	        if(tot>10000){
	            disc = (float) (0.1*tot);
	        }
	        System.out.println("Total cart value: "+tot);
	        System.out.println("Discount:         "+disc);
	        System.out.println("Final value:      "+(tot-disc));

	        int age = 20;
	        String  res = age >= 18 ? "true" : "false";
	        System.out.println(res); 

	        int i = 1;
	        // do{
	        //     System.out.println(i);
	        //     i++;
	        // }while(i<=10);

	        while(i<=10){
	            System.out.println(i);
	            i++;
	        }
	    }
	    static int calc(int a, int b,int c, int d){
	        int e = a+b+c+d;
	        return e;
	    }
}
