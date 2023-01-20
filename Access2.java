
import java.util.Arrays;

public class Access2 {
	

		    public static int coin(int[] coins, int amount) {
		        if (amount < 0) {
		            return -1;
		        }
		        int[] dp = new int[amount + 1];
		        Arrays.fill(dp, amount + 1);
		        dp[0] = 0;
		        for (int i = 0; i <= amount; i++) {
		            for (int j = 0; j < coins.length; j++) {
		if (coins[j] <= i) {
		    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
		}
		}
		}
		return dp[amount] > amount ? -1 : dp[amount];
		}

		public static void main(String[] args) {
		int[] coins = {1, 2, 5};
		int amount = 11;
		int result = coin(coins, amount);
		System.out.println(result);
		}
		

	}

