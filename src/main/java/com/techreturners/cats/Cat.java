package com.techreturners.cats;

interface Cat {
	public String eat();
	public boolean isAsleep();
	public void wakeUp();
	public void goToSleep();

}


/*Domestic*/
class DomesticCat implements Cat {

	private boolean isAsleep = false;
	private float avgHeight;
	private String setting = "domestic";

	public DomesticCat(float avgHeight, String setting) {
		this.avgHeight = avgHeight;
		this.setting = setting;
	}

	public boolean isAsleep() {
	    return isAsleep;
	}

	public void goToSleep() {
		isAsleep = true;
	}

	public String eat() {        
	    return "Purrrrrrr";
	}

	public void wakeUp() {
	    isAsleep = false; 
	}

	public String getSetting() {
		return setting;
	}

}
