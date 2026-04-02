public class PracticeProblem {

	public static void main(String args[]) {
	}
	public static int towerOfHanoi(int num) {
		if (num < 3) {
			return -1;
		}
		return moves(num);
	}
	private static int moves(int num) {
		if (num == 1) {
			return 1;
		}
		return 2 * moves(num - 1) + 1;
	}
}