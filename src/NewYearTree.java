import java.util.Scanner;

public class NewYearTree {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();

			int treeWidth = 2 * n - 1;
			int leftPadding = n - 1;
			int starsCount = 1;

			// paint tree
			for (int i = 0; i < n; i++) {

				for (int j = 0; j < treeWidth; j++) {
					if (j < leftPadding) {
						System.out.print(" ");
					} else if (j < leftPadding + starsCount) {
						System.out.print("*");
					}
				}

				leftPadding--;
				starsCount += 2;

				System.out.println();
			}

			// paint present
			int scopeToMid = (treeWidth - w) / 2;

			for (int i = 0; i < h; i++) {

				for (int j = 0; j < scopeToMid; j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < w; j++) {
					System.out.print("#");
				}

				System.out.println();
			}
		}
	}
}
