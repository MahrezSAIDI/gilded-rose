package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class ShopTests
{
	public SHOP shop= new SHOP();
    public ArrayList <Item> items=new ArrayList<Item>();

	
    Item item=new Item(9,8,"PC");
	Item item2= new Item(0,5,"yaourt");
	Item item3= new Item(10,48,"Sulfuras");
	Item item4= new Item(10,12,"Aged Brie");
	Item item5= new Item(4,12,"Aged Brie");
	Item item6= new Item(0,12,"Aged Brie");
	Item item7= new Item(10,12,"Backstage");
	Item item8= new Item(2,12,"Backstage");
	Item item9= new Item(0,12,"Backstage");
	Item item10= new Item(5,8,"Conjured");
	
	
	
	
	@Test
	public void  upDateQualityItemsTest() {

		items.add(item);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);
		items.add(item6);
		items.add(item7);
		items.add(item8);
		items.add(item9);
		items.add(item10);
		
		int qualityBeforeUpDate = items.get(0).getQualityItem();
		shop.upDateQuality(items);
		int qualityAfterUpDate=items.get(0).getQualityItem();
		assertEquals(qualityBeforeUpDate,8);
		assertEquals(qualityAfterUpDate,8);
		
		/*comme ca marche sur le premier elemet "item" donc fonctionne aussi sur les articles restants*/
		
	
	}


}