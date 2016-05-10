package com.rbc.test;

import static org.junit.Assert.assertTrue;

import java.text.DecimalFormat;

import org.junit.Test;

import com.rbc.basket.FruitsBasket;
import com.rbc.bo.FruitsBasketCostCalculator;
import com.rbc.fruits.Apple;
import com.rbc.fruits.Banana;
import com.rbc.fruits.Lemon;
import com.rbc.fruits.Orange;
import com.rbc.fruits.Peache;

public class FruitsBucketCostTest {

	@Test
	public void testFruitsBucketCostForSingleFruit() {
		FruitsBasket basket = new FruitsBasket();
		basket.add(new Orange());
		
		assertTrue(0.5 == FruitsBasketCostCalculator.getBasketCost(basket));		
	}

	@Test
	public void testFruitsBucketCostForMultipleFruits() {
		FruitsBasket basket = new FruitsBasket();
		basket.add(new Orange());
		basket.add(new Orange());		
		assertTrue(1 == FruitsBasketCostCalculator.getBasketCost(basket));
	}

	@Test
	public void testFruitsBucketCost() {
		FruitsBasket basket = new FruitsBasket();
		basket.add(new Orange());
		basket.add(new Orange());
		basket.add(new Apple());
		basket.add(new Apple());		
		basket.add(new Banana());
		basket.add(new Banana());
		basket.add(new Lemon());
		basket.add(new Lemon());
		basket.add(new Peache());
		basket.add(new Peache());
		
		assertTrue(3.4 == Double.parseDouble(new DecimalFormat("#.##").format(FruitsBasketCostCalculator.getBasketCost(basket))));
	}
	
}
