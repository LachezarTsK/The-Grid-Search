import java.util.Arrays;
import java.util.Scanner;

public class Solution_2DArray {

	static String gridSearch(String[][] grid, String[][] pattern) {
		String firstDigit = pattern[0][0];

		for (int row = 0; row < grid.length; row++) {
			for (int column = 0; column < grid[row].length; column++) {
				if (grid[row][column].equals(firstDigit)) {
					if (compare(grid, pattern, row, column)) {
						return "YES";
					}
				}
			}
		}
		return "NO";
	}

	public static boolean compare(String[][] grid, String[][] pattern, int row, int column) {

		if (column + pattern[0].length > grid[0].length || row + pattern.length > grid.length) {
			return false;
		}

		for (int i = 0; i < pattern.length; i++) {
			String[] copyOfRow = Arrays.copyOfRange(grid[row + i], column, column + pattern[i].length);
			if (!Arrays.equals(copyOfRow, pattern[i])) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int numberOfTestCases = reader.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {

			int rows = reader.nextInt();
			int columns = reader.nextInt();
			String[][] grid = new String[rows][columns];

			for (int grid_i = 0; grid_i < rows; grid_i++) {
				grid[grid_i] = reader.next().split("");
			}

			rows = reader.nextInt();
			columns = reader.nextInt();
			String[][] pattern = new String[rows][columns];

			for (int pattern_i = 0; pattern_i < rows; pattern_i++) {
				pattern[pattern_i] = reader.next().split("");
			}

			String result = gridSearch(grid, pattern);
			System.out.println(result);
		}
		reader.close();
	}
}
