class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] counter = new int[amount+1];

        counter[0] = 0;

        for (int i = 1; i <= amount; i++) {
            counter[i] = amount + 1; 
        }

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                counter[i] = Math.min(counter[i], counter[i - coin] + 1);
            }
        }

        return counter[amount] > amount ? -1 : counter[amount];
    }
}


