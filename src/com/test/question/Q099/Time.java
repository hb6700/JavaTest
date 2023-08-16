package com.test.question.Q099;

public class Time {

		private int hour, minute, second;
		
		public Time() {
			this.hour = 0;
			this.minute = 0;
			this.second = 0;
		}
		public Time(int hour, int minute, int second) {
			this.hour = hour;
			this.minute = minute;
			this.second = second;
			this.upper();			
		}
		
		public Time(int minute, int second) {
			this.hour = 0;
			this.minute = minute;
			this.second = second;
			this.upper();
		}

		public Time(int second) {
			this.hour = 0;
			this.minute = 0;
			this.second = second;
			this.upper();
		}

		public String info() {
			return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
		}
		
		private void upper() {
			if(this.second >= 60) {
				this.minute += this.second/60;
				this.second = this.second%60;
			}
			
			if(this.minute >= 60) {
				this.hour += this.minute/60;
				this.minute = this.minute%60;
			}
		}
}
