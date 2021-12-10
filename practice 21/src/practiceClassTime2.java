
public class practiceClassTime2 {

	private int hour = 1;
	private int minutes = 35;
	private int seconds = 30;
	
/*	public void setTime(int hh, int mm, int ss) {
		
		   hour = (hour>=0 && hour <=24 ? hh : 0);
		minutes = (minutes>=0 && minutes <=60 ? mm : 0);
		seconds = (seconds>=0 && seconds <=60 ? ss : 0);
	}
*/	
	public void setTime(int hour, int minutes, int seconds) {
		 this.hour = 20;
		 this.minutes = 20;
		 this.seconds = 40;
	}
	public String fullTime() {
		
		return String.format("%02d:%02d:%02d", hour, minutes, seconds);
	}
	
//	public String regularTime() {
//		
//		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour%12), minutes, seconds, (hour < 12) ? "AM" : "PM");
//	}
}
