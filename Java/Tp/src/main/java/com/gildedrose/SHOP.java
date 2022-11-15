package com.gildedrose;

import java.util.ArrayList;

public class SHOP {
	
	private ArrayList <Item> items ;
	
	public SHOP() {
		items=new ArrayList<Item>();
	}
	
	public void addItemToShop(Item item){
		items.add(item);
	}
	public void upDateQuality(ArrayList <Item> items) {
		
		for( int i=0; i < items.size();i++ ) {
			Item item=items.get(i);
			item.upDateQualityItem(item);
			
		}
	}
	
}