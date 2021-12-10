
public class ClassTimeWithConstructor2 {
	
	private int hour;
	private int minutes;
	private int seconds;
	
		public ClassTimeWithConstructor2() {
			this (0, 0,0);
		}
		
		public ClassTimeWithConstructor2 (int h) {
			
			this(h,0,0);
		}
		
		public ClassTimeWithConstructor2(int h, int m) {
			this(h, m, 0);
		}
		
		public ClassTimeWithConstructor2(int h, int m, int s) {
			setTime(h, m, s);
		}
		
		public void setTime(int h, int m, int s) {
			setHour(h);
			setMinutes(m);
			setSeconds(s);
		}
		
		public void setHour(int h) {
			hour = ((h >= 0 && h < 24) ? h : 0);
		}
		
		public void setMinutes(int m) {
			minutes = ((m >= 0 && m < 60 )? m : 0);
		}
		
		public void setSeconds(int s) {
			seconds = ((s >=0 && s < 60) ? s : 0);
		}
		
		public int getHour() {
			return hour;
		}
		
		public int getMinutes() {
			return minutes;
		}
		
		public int getSeconds() {
			return seconds;
		}
		
		public String myTime() {
			return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSeconds());
		}
}
