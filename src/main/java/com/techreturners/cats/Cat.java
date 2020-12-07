package com.techreturners.cats;

interface Cat {
	public String eat();
	
	public boolean isAsleep();
	
	public void goToSleep();
	
	public String getSetting();
	
	public void wakeUp();
	
	public float getAverageHeight();
}

/* Abstract class for Cat */
abstract class CatImp implements Cat {
	private boolean isAsleep = false;
	private float avgHeight;
	private String setting;

	public float getAverageHeight() {
		return avgHeight;
	}

	public void setAverageHeight(float avgHeight) {
		this.avgHeight = avgHeight;
	}
	
	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public boolean isAsleep() {
		return isAsleep;
	}
	
	public void wakeUp() {
		isAsleep = false;
	}

	public void goToSleep() {
		isAsleep = true;
	}

	public abstract String eat();
}

/* Domestic Cat */
class DomesticCat extends CatImp {
	private static final String noise = "Purrrrrrr";

	DomesticCat(){
		this.setAverageHeight((float) 23);
		this.setSetting("domestic");
	}
	
	public String eat() {
		return noise;
	}
}

/* LionCat Cat */
class LionCat extends CatImp {
	private static final String noise = "Roar!!!!";

	LionCat(){
		this.setAverageHeight((float) 1100);
		this.setSetting("wild");
	}
	
	public String eat() {
		return noise;
	}
}

/* Cheetah Cat */
class CheetahCat extends CatImp {
	private static final String noise = "Zzzzzzz";

	CheetahCat(){
		this.setAverageHeight((float) 200);
		this.setSetting("wild");
	}
	public String eat() {
		return noise;
	}
}