package com.gildedrose;

public class Item {
	
	protected int sellIn ;
	protected int quality ;
	public String nameItem;
	//public Date dateOfFabrication; 
	//public Date dateLimitConsommation;
	
	public Item(int theSellIn, int theQuality, String theNameItem) {
		this.sellIn=theSellIn;
		this.quality=theQuality;
		this.nameItem=theNameItem;
		//this.dateOfFabrication=theDateOfFabrication;
		//this.dateLimitConsommation=theDateLimitConsommation;
		
	}
	
	public int getSellIn() {
		return this.sellIn;
	}
	
	public int getQuality() {
		return this.quality;
	}
	public String getNameItem() {
		return this.nameItem;
	}
	
	/*public Date getDateOfFabrication() {
		return this.dateOfFabrication;
	}
	
	public Date getDateLimitOfConsomation() {
		return this.dateLimitConsommation;
	}*/
	
	public void setQuality(int a) {
		this.quality=quality+a;
	}
	
	public void upDateQuality(Item item) {
		
		if (((item.getNameItem() !="Backstage") && (item.getNameItem() !="Aged Brie"))&&(item.getSellIn() == 0)) {
			//item.quality=quality-2 ;
			item.setQuality(-2);
		}
		if (item.getNameItem()=="Sulfuras") {
			//item.quality=quality;
			item.setQuality(0);
		}
		
		if((item.getNameItem()=="Backstage") || (item.getNameItem()=="Aged Brie"))
		{
			int daysSillIn=item.getSellIn();
			
			if((daysSillIn <=10) && (daysSillIn >5 )){
				//item.quality=quality+2;
				item.setQuality(2);
			}
			if ((daysSillIn <=5) && (daysSillIn >0 )) {
				//item.quality=quality+3;
				item.setQuality(3);
			}
			if (daysSillIn == 0) {
				//item.quality=0;
				item.setQuality(-item.getQuality());
			}
		
		
		}
		if (item.getNameItem()=="Conjured")
				{item.setQuality(-2);
			
				}
}
}