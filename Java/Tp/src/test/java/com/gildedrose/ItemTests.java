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
	public void getSellInItemTest() {
		assertEquals(9,item.getSellInItem());
	}
	
	@Test
	public void getQualityItemTest() {
		assertEquals(8,item.getQualityItem());
	}
	
	@Test
	public void getNameItemTest() {
		assertEquals("PC",item.getNameItem());
	}
	
	@Test
	public void setQualityItemTest() {
		item.setQualityItem(-2);
		int  qualityAfterSetItem=item.getQualityItem();
		assertEquals(6,qualityAfterSetItem);
	}
	
	@Test
	public void UpDateQualityItemTest() {
		item.upDateQualityItem(item);
		int itemSellinAfterUpDate=item.getQualityItem();
		
		item2.upDateQualityItem(item2);
		int itemSellinAfterUpDate2=item2.getQualityItem();
		
		item3.upDateQualityItem(item3);
		int itemSellinAfterUpDate3=item3.getQualityItem();
		
		item4.upDateQualityItem(item4);
		int itemSellinAfterUpDate4=item4.getQualityItem();
		
		item5.upDateQualityItem(item5);
		int itemSellinAfterUpDate5=item5.getQualityItem();
		
		item6.upDateQualityItem(item6);
		int itemSellinAfterUpDate6=item6.getQualityItem();
		
		
		item7.upDateQualityItem(item7);
		int itemSellinAfterUpDate7=item7.getQualityItem();
	
		
		item8.upDateQualityItem(item8);
		int itemSellinAfterUpDate8=item8.getQualityItem();
		
		item9.upDateQualityItem(item9);
		int itemSellinAfterUpDate9=item9.getQualityItem();
		
		item9.upDateQualityItem(item10);
		int itemSellinAfterUpDate10=item10.getQualityItem();
		
		
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