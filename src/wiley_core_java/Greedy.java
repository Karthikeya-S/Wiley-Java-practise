package wiley_core_java;

public class Greedy {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,5};
		int sum = 20;
		int coin = 0;
		while(sum!=0) {
			for(int i=arr.length-1;i>=0;i--) {
				coin += (sum / arr[i]);
				sum = sum % arr[i];
			}
		}
		System.out.println(coin);		
	}
}
