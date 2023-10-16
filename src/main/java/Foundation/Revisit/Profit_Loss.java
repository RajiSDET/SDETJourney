package Foundation.Revisit;

import org.junit.Test;

import junit.framework.Assert;

public class Profit_Loss {
	@Test
	public void test1() {
		Assert.assertEquals(4, profitCalc(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(7, profitCalc(new int[] {1,2,8,4,5}));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(0, profitCalc(new int[] {4,2,1,1,0}));
		printMe(new String[] {"Raji","Praga","Guru"});
	}
	
	public void printMe(String[] names){
		System.out.println(names[0]);
		System.out.println(names[1]);
	}


	public int profitCalc(int[] prices) {
		int maxProfit = 0,curentProfit=0,buyPrice=Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if(prices[i]<buyPrice) {
				buyPrice=prices[i];
			}
			curentProfit=prices[i]-buyPrice;
			if(curentProfit>maxProfit){
				maxProfit=curentProfit;
			}
		}

		return maxProfit;
	}

}

/*Pseudo code
INPUTS - int[] prices 
OUTPUTS - int maxProfit 

@input - int[]
@output - int

Test-data 1  - [1,2,3,4,5] => 4
Test-data 2  - [1,2,8,4,5] => 7
Test-data 3  - [4,2,1,1,0] => 0
1. Declare buyPrice to Integer.MAX_VALUE, currentProfit as 0, maxProfit as 0
2. Iterate through the price array
3. if the currentPrice or prices[i]<buyPrice, reassign the currentPrice to buyPrice
4. calculate the currentProfit using prices[i]- buyPrice
4.1 if the currentProfit>maxProfit, reassign the currentProfit to maxProfit
5, return maxProfit


 */