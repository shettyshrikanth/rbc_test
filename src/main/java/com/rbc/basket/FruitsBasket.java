/**
 * 
 */
package com.rbc.basket;

import java.util.ArrayList;
import java.util.List;

import com.rbc.fruits.Fruit;

/**
 * @author shrikanth
 *
 */
public class FruitsBasket {
	private List<Fruit> items;
	
	public FruitsBasket(){
		items = new ArrayList<Fruit>();
	}
	
	public void add (Fruit fruit) {
		items.add(fruit);
	}
	
	@SuppressWarnings("serial")
	public List<Fruit>  getItems (){
		return new ArrayList<Fruit>(){{ addAll(items);}};		 
	}
}
