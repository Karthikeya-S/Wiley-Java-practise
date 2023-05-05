package wiley_core_java;

public class Counter {
	private static int count = 0;
	private final String name;
	public Counter(String name) {
		this.name = name;
	}
	public synchronized void increment() {
		count++;
	}
	public int getcount() {
		return count;
	}
}
