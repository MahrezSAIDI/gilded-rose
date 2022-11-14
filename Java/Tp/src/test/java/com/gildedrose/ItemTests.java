package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ItemTests 
{
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
	public void testGetSellIn() {
		assertEquals(9,item.getSellIn());
	}
	
	@Test
	public void testGetQuality() {
		assertEquals(8,item.getQuality());
	}
	
	@Test
	public void testGetNameItem() {
		assertEquals("PC",item.getNameItem());
	}
	
	@Test
	public void setQualityTest() {
		item.setQuality(-2);
		int  qualityAfterSet=item.getQuality();
		assertEquals(6,qualityAfterSet);
	}
	
	@Test
	public void testUpDateQuality() {
		item.upDateQuality(item);
		int itemSellinAfterUpDate=item.getQuality();
		
		item2.upDateQuality(item2);
		int itemSellinAfterUpDate2=item2.getQuality();
		
		item3.upDateQuality(item3);
		int itemSellinAfterUpDate3=item3.getQuality();
		
		item4.upDateQuality(item4);
		int itemSellinAfterUpDate4=item4.getQuality();
		
		item5.upDateQuality(item5);
		int itemSellinAfterUpDate5=item5.getQuality();
		
		item6.upDateQuality(item6);
		int itemSellinAfterUpDate6=item6.getQuality();
		
		
		item7.upDateQuality(item7);
		int itemSellinAfterUpDate7=item7.getQuality();
	
		
		item8.upDateQuality(item8);
		int itemSellinAfterUpDate8=item8.getQuality();
		
		item9.upDateQuality(item9);
		int itemSellinAfterUpDate9=item9.getQuality();
		
		item9.upDateQuality(item10);
		int itemSellinAfterUpDate10=item10.getQuality();
		
		
		assertEquals(8,itemSellinAfterUpDate);
		assertEquals(3,itemSellinAfterUpDate2);
		assertEquals(48,itemSellinAfterUpDate3);
		assertEquals(14,itemSellinAfterUpDate4);
		assertEquals(15,itemSellinAfterUpDate5);
		assertEquals(0,itemSellinAfterUpDate6);
		assertEquals(14,itemSellinAfterUpDate7);
		assertEquals(15,itemSellinAfterUpDate8);
		assertEquals(0,itemSellinAfterUpDate9);
		assertEquals(6,itemSellinAfterUpDate10);
	}
	
	
}