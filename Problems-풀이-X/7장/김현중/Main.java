
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 2 },
                { 4, 2, 2, 1 },
                { 2, 5, 6, 2 },
                { 7, 2, 2, 8 }
        };
        int target = 2;
        List<int[]> occurrences = findAllOccurrences(matrix, target);
        for (int[] occurrence : occurrences)
            System.out.println(
                    "Target " + target + " found at position: [" + occurrence[0] + ", " + occurrence[1] + "]");

    }

    private static List<int[]> findAllOccurrences(int[][] matrix, int target) {
        List<int[]> occurrences = new ArrayList<>();

        return occurrences;
    }
}
