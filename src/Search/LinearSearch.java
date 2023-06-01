package Search;

public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr = { 3, 4, 1, 7, 5 };
        int n = arr.length; 
        int x = 4;
        for(int i=0;i<n;i++) {
        	if(arr[i]==x) {
        		System.out.println("Array found at index: "+i);
        	}
        }
    }
}