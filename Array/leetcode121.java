

public class leetcode121{


    public int maxProfit(int[] prices){

        int Max =0;
        int minprice = prices[0];


        for(int price: prices){

            minprice = Math.min(minprice,price);
            Max = Math.max(Max, price- minprice);


        }

        return Max;
    }
}