package TV;

public class TV {
	
	private int volumeLevel;
	private int channel;
	private boolean on;
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void volumeLevelUp(int vol) {
		if (volumeLevel + vol >=8)
			this.volumeLevel = 8;
		else 
			volumeLevel = volumeLevel + vol;
	}
	
	public void volumeLevelDown(int vol) {
		if (volumeLevel - vol <= 0)
			this.volumeLevel = 0;
		else 
			volumeLevel = volumeLevel - vol;
	}
	
	
	public void channelUp (int ch) {
		if (ch > 0 && ch <=99) {
			if (channel + ch >99)
				channel = channel + ch - 100;
			else 
				channel = channel + ch;
		}
	}
	
	public void channelDown(int ch) {
		if (ch > 0 && ch <=99) {
			if (channel - ch < 0)
				channel = channel - ch + 100;
			else 
				channel = channel + ch;
		}
	}
	
	public String toString() {
		if (on == true)
			return "TV is On and current channel is " 
				+ channel + " and current volume is " + volumeLevel;
		else 
			return "TV is Off";
	}
}
