public class CodeChallenge2i {

	public static void main(String[] args) {

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