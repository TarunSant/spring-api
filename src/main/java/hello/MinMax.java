package hello;

public class MinMax {

	int findMin(int x, int y) {
		int min = 0;
		min = (x < y)?x:y;
		return min;
	}
	
	int findMax(int x, int y) {
		int max = 0;
		max = (x >= y)?x:y;
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("This is a maven project");
	}

}
