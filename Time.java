public class Time {
	
	private int hour;
	private int min;
	
	public int getHour () {
		return hour;
	}
	
	public int getMin() {
		return min;
	}
	public Time (int h, int m) {
		hour = h;
		min = m;
	}
	
	public int minutesUntil (Time other) {
		return ((other.getHour()*60 + other.getMin())-(getHour()*60+getMin()));
	}
	
}
