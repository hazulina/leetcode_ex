import java.util.Arrays;

public class Task_1672_RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int[] sumWealth = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int current = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                current = current + accounts[i][j];
            }
            sumWealth[i] = current;
        }
        Arrays.sort(sumWealth);
        return sumWealth[sumWealth.length - 1];
    }
}
