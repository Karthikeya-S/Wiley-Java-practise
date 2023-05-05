package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) throws InterruptedException {
		int size = 1000000;
		long start = System.currentTimeMillis();
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<size;i++) {
			al.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList "+al.size());
		System.out.println("Arraylist "+(end-start));
		List<Integer> vl = new Vector<>();
		long st = System.currentTimeMillis();
		for(int i=0;i<size;i++) {
			vl.add(i);
		}
		long en = System.currentTimeMillis();
//		System.out.println(vl.size());
		System.out.println("Vector List "+vl.size());
		System.out.println("Vector List "+(en-st));
		
		//MultiThread Approach
		
		List<Integer> mtal = new ArrayList<>();
		st = System.currentTimeMillis();
		Thread t1 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				mtal.add(i);
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				mtal.add(i);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		en = System.currentTimeMillis();
		System.out.println("Multithread Array "+mtal.size());
		System.out.println("Multithread Array "+(en-st));
		
		List<Integer> mtvl = new Vector<>();
		st = System.currentTimeMillis();
		Thread t3 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				mtvl.add(i);
			}
		});
		Thread t4 = new Thread(() -> {
			for(int i=0;i<size;i++) {
				mtvl.add(i);
			}
		});
		t3.start();
		t4.start();
		t3.join();
		t4.join();
		
		en = System.currentTimeMillis();
		System.out.println("Multithread Vector"+mtvl.size());
		System.out.println("Multithread Vector"+(en-st));
	}
}
