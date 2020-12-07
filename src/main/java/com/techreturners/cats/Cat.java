package com.techreturners.cats;

interface Cat {
	public String eat();

	public boolean isAsleep();

	public void wakeUp();

	public void goToSleep();

	public String getSetting();

	public float getAverageHeight();
}

class CatImp implements Cat {
	private boolean isAsleep = false;
	private float avgHeight;
	private String setting;

	public void setAvgHeight(float avgHeight) {
		this.avgHeight = avgHeight;
	}

	public boolean isAsleep() {
		return isAsleep;
	}

	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public void wakeUp() {
		this.isAsleep = false;
	}

	public void goToSleep() {
		this.isAsleep = true;

	}

	@Override
	public String eat() {
		return null;
	}

	@Override
	public float getAverageHeight() {
		return avgHeight;
	}
}


/*Domestic*/
class DomesticCat extends CatImp {
	DomesticCat() {
		super.setSetting("domestic");
		super.setAvgHeight(23);
	}

	@Override
	public String eat() {
		return "Purrrrrrr";
	}
}

class LionCat extends CatImp {
	LionCat() {
		super.setSetting("wild");
		super.setAvgHeight(1100);
	}

	@Override
	public String eat() {
		return "Roar!!!!";
	}
}

class CheetahCat extends CatImp {
	CheetahCat() {
		super.setSetting("wild");
		super.setAvgHeight(3000);
	}

	@Override
	public String eat() {
		return "Zzzzzzz";
	}
}
