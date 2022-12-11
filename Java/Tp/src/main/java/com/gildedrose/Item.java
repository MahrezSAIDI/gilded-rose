package com.gildedrose;

public class Item {
	
	protected int sellInItem ;
	protected int qualityItem ;
	public String nameItem;
	//public Date dateOfFabrication; 
	//public Date dateLimitConsommation;
	

	/**
	* Returns an Item object with its quality , its sellin and its name
	* @param  theSellin the price
	* @param  theQuality the amount of quality
	* @param  theNameItem the name of the item
	* @return      the image at the specified URL
	*/
	public Item(int theSellIn, int theQuality, String theNameItem) {
		this.sellInItem=theSellIn;
		this.qualityItem=theQuality;
		this.nameItem=theNameItem;
		//this.dateOfFabrication=theDateOfFabrication;
		//this.dateLimitConsommation=theDateLimitConsommation;
		
	}
	
	public int getSellInItem() {
		return this.sellInItem;
	}
	
	public int getQualityItem() {
		return this.qualityItem;
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
	
	public void setQualityItem(int number) {
		this.qualityItem=qualityItem+number;
	}
	
	
	public void upDateItemWhenSellInIsZero(Item item) {
		int sellInItem = item.getSellInItem();
		String nameItem =item.getNameItem();
		if (((nameItem !="Backstage") && (nameItem !="Aged Brie"))&&(sellInItem == 0)) {
			//item.quality=quality-2 ;
			item.setQualityItem(-2);
		}
		
	}
	
	public void upDateItemWhenIsSulfuras(Item item) {
		String nameItem =item.getNameItem();
		if (nameItem=="Sulfuras") {
			//item.quality=quality;
			item.setQualityItem(0);
		}
		
	}
	
	public void upDateWhenBackstageOrAgedBrie(Item item) {
		
		int sellInItem = item.getSellInItem();
		String nameItem =item.getNameItem();
		
		if((nameItem=="Backstage") || (nameItem=="Aged Brie"))
		{
				if((sellInItem <=10) && (sellInItem >5 )){
				//item.quality=quality+2;
				item.setQualityItem(2);
			}
			if ((sellInItem <=5) && (sellInItem >0 )) {
				//item.quality=quality+3;
				item.setQualityItem(3);
			}
			if (sellInItem == 0) {
				//item.quality=0;
				item.setQualityItem(-item.getQualityItem());
			}
		
		
		}
	}
	
	public void upDateItemWhenIsConjured(Item item) {
		String nameItem =item.getNameItem();
		
		if (nameItem=="Conjured") {
			
			item.setQualityItem(-2);
	
		}
		
	}
	
	
	
	
	public void upDateQualityItem(Item item) {
		
		upDateItemWhenSellInIsZero(item) ;
		upDateItemWhenIsSulfuras(item);
		upDateWhenBackstageOrAgedBrie(item);
		upDateItemWhenIsConjured(item); 
		
		
		}
}
