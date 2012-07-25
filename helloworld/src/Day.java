
public class Day {
		private String oneday;
		protected String nextDay;
		private String previousDay;
		
		public Day(){
		}
		
	    public Day(String oneday){
	    	this.oneday=oneday;
	    }
	    public Day(String nextDay,String previousDay){
	    	this.nextDay=nextDay;
	    	this.previousDay=previousDay;
	    }

		public String getOneday() {
			return oneday;
		}

		public void setOneday(String oneday) {
			this.oneday = oneday;
		}
		
		public String getNextDay() {
			return nextDay;
		}


		public void setNextDay(String nextDay) {
			this.nextDay = nextDay;
		}


		public String getPreviousDay() {
			return previousDay;
		}


		public void setPreviousDay(String previousDay) {
			this.previousDay = previousDay;
		}
		
	public void calculateDay(){
			
			
			
			if(getOneday()=="Sunday"){
				
				this.nextDay="Saturday";
				setPreviousDay(nextDay);
				setNextDay(nextDay);
			}
			else if(getOneday()=="Monday"){
				setPreviousDay("Sunday");
				setNextDay("Tuesday");
				
			}
			else if(getOneday()=="Tuesday"){
				setPreviousDay("Monday");
				setNextDay("Wednesday");
				
			}
			else if(getOneday()=="Wednesday"){
				setPreviousDay("Tuesday");
				setNextDay("Thursday");
				
			}
			else if(getOneday()=="Thursday"){
				setPreviousDay("Wednesday");
				setNextDay("Friday");
				
			}
			else if(getOneday()=="Friday"){
				setPreviousDay("Thursday");
				setNextDay("Saturday");
				
			}
			else if(getOneday()=="Saturday"){
				setPreviousDay("Friday");
				setNextDay("Sunday");
				
			}
			
		}
		
		
		}


