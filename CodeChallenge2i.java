public class CodeChallenge2i {

	public static void main(String[] args) {

		/*
		 * ASSUMPTIONS:
		 * 
		 * A>0
		 * 
		 * X>=0
		 * 
		 * Iteration starts at 0 but does not perform any function until the first valid
		 * multiple of A is reached
		 * 
		 * Iterates until the next iteration would exceed the bounds specified but does
		 * but not pass them
		 * 
		 * Once each multiple of X is reached, iteration is continued from the last
		 * value incremented to up until the next multiple of X. Instead of continuing
		 * from the previous multiple of X.
		 */
		int A = 20;
		int X = 40;
		int index = 0;
		for (int currentX = 1; currentX <= 3; currentX++) {
			int incA = A + (currentX - 1);
			while (index + incA <= currentX * X) {
				index += incA;
				// Perform function here
				System.out.println(index);
			}
		}
	}
}
