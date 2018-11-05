import java.util.*;

public class Solution_1DArray {
	public static String getResults(String[] grid, String[] pattern) {
		String results = "NO";
		int boundarySkippingThroughRows = grid.length - pattern.length;
		int boundarySkippingThroughColumns = grid[0].length() - pattern[0].length();
		int boundarySubstringToCheck = pattern[0].length();

		for (int i = 0; i <= boundarySkippingThroughRows; i++) {
			for (int j = 0; j <= boundarySkippingThroughColumns; j++) {

				if (grid[i].charAt(j) == pattern[0].charAt(0)) {

					int indexSubtring = 0;
					boolean everyComparisonSuccessful = true;

					for (int i_sub = i; i_sub < i + pattern.length; i_sub++) {
					
						if (!grid[i_sub].substring(j, j + boundarySubstringToCheck).equals(pattern[indexSubtring])) {
							everyComparisonSuccessful = false;
							break;
						}
						indexSubtring++;
					}
					if (everyComparisonSuccessful) {
						results = "YES";
						return results;
					}
				}

			}
		}
		return results;
	}

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int testCases = reader.nextInt();
		String[] totalResults = new String[testCases];

		for (int i = 0; i < testCases; i++) {
			int rowsGrid = reader.nextInt();
			int columnsGrid = reader.nextInt();
			String[] grid = new String[rowsGrid];
			for (int i_Grid = 0; i_Grid < rowsGrid; i_Grid++) {
				grid[i_Grid] = reader.next();
			}
			int rowsPattern = reader.nextInt();
			int columnsPattern = reader.nextInt();
			String[] pattern = new String[rowsPattern];
			for (int i_Pattern = 0; i_Pattern < rowsPattern; i_Pattern++) {
				pattern[i_Pattern] = reader.next();
			}
			String result = getResults(grid, pattern);
			totalResults[i] = result;
		}
		for (int i = 0; i < totalResults.length; i++) {
			System.out.println(totalResults[i]);
		}
	}
}
