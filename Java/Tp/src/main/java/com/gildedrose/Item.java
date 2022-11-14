package com.gildedrose;

public class Item {
	
	protected int sellInItem ;
	protected int qualityItem ;
	public String nameItem;
	//public Date dateOfFabrication; 
	//public Date dateLimitConsommation;
	
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
	
	public void upDateQualityItem(Item item) {
		
		if (((item.getNameItem() !="Backstage") && (item.getNameItem() !="Aged Brie"))&&(item.getSellInItem() == 0)) {
			//item.quality=quality-2 ;
			item.setQualityItem(-2);
		}
		if (item.getNameItem()=="Sulfuras") {
			//item.quality=quality;
			item.setQualityItem(0);
		}
		
		if((item.getNameItem()=="Backstage") || (item.getNameItem()=="Aged Brie"))
		{
			int remainingDaysSellInItem=item.getSellInItem();
			
			if((remainingDaysSellInItem <=10) && (remainingDaysSellInItem >5 )){
				//item.quality=quality+2;
				item.setQualityItem(2);
			}
			if ((remainingDaysSellInItem <=5) && (remainingDaysSellInItem >0 )) {
				//item.quality=quality+3;
				item.setQualityItem(3);
			}
			if (remainingDaysSellInItem == 0) {
				//item.quality=0;
				item.setQualityItem(-item.getQualityItem());
			}
		
		
		}
		if (item.getNameItem()=="Conjured")
				{item.setQualityItem(-2);
			
				}
}
}