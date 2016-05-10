package com.rbc.bo;

import com.rbc.basket.FruitsBasket;
import com.rbc.fruits.Fruit;

/**
 * @author shrikanth
 * 
 * This class calculates the cost for given fruits bucket.
 */
public class FruitsBasketCostCalculator {
	
	public static double getBasketCost(FruitsBasket basket) {
		double cost = 0;
				
		for (Fruit fruit : basket.getItems()) {
			cost += fruit.getPrice();
		}
		
		return cost;
	}
	
}
