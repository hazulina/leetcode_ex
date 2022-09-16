import java.util.*;

public class Task_1337_TheKWeakestRowsInMatrix {
public int[] kWeakestRows(int[][] mat, int k) {
        int[] outputArray = new int[k];
        ArrayList<Integer> rowsNumberList = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                mat[i][0] += mat[i][j];
            }
            rowsNumberList.add(mat[i][0]);
        }
        Collections.sort(rowsNumberList);
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (rowsNumberList.get(i) == mat[j][0]) {
                    outputArray[i] = j;
                    mat[j][0] = -1;
                    break;
                }
            }
        }
        return outputArray;
    }
}
