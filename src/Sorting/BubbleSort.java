package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {1,4,36,77,22,57,43,64,23,45};
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {		
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int ele: a) {
			System.out.print(ele+" ");
		}
	}

}
