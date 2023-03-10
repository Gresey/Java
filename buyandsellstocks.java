import java.util.*;
public class buyandsellstocks {
     public static int buyandsellstocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
            int Profit=prices[i]-buyPrice;     //profit=selling price-buying price
            maxProfit=Math.max(maxProfit,Profit);

            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;

    }
    public static void main(String arg[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyandsellstocks(prices));
        }
    }

