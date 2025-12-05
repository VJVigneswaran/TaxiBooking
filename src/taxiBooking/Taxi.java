package taxiBooking;


public class Taxi implements Cloneable{
		private char currtLoc = 'A';
		private int customerId;
		private int taxiId;
		private int earnings;
		private char dropLoc;
		private char pickupLoc;
		private int pickupTime;
		private int dropTime;
		 
		
		public int getcustomerId() {
		        return this.customerId;
		    }

		void setcustomerId(int customerId) {
		        this.customerId = customerId;
		    }
		
		public int getTaxiId() {
	        return this.taxiId;
	    }

		void setTaxiId(int taxiId) {
	        this.taxiId = taxiId;
	    }
		
		public char getcurrLoc(){
			return this.currtLoc;
		}
		
		void setcurrLoc(char dropLoc) {
			this.currtLoc = dropLoc;
		}
		
		public char getdropLoc(){
			return this.dropLoc;
		}
		void setdropLoc(char dropLoc) {
			this.dropLoc = dropLoc;
		}
		
		public int getEarnings(){
			return this.earnings;
		}
		
		void setEarnings(int earnings) {
			this.earnings = earnings;
		}
		
		public char getpickupLoc(){
			return this.pickupLoc;
		}
		void setpickupLoc(char pickupLoc) {
			this.pickupLoc = pickupLoc;
		}
		
		public int getpickupTime() {
			return this.pickupTime;
		}
		
		public void setpickupTime(int pickupTime) {
			 this.pickupTime = pickupTime;
		}
		 
		public int getdropTime() {
			return this.dropTime;
		}
		
		void setdropTime(int dropTime) {
			this.dropTime = dropTime;
		}
		
		 public String toString() {
		        return  "TaxiId: " + taxiId +
		                ", currentLocation: " + currtLoc +
		                ", customerId: " + customerId +
		                ", pickupLocation: " + pickupLoc +
		                ", dropLocation: " + dropLoc +
		                ", pickupTime: " + pickupTime +
		                ", dropTime: " + dropTime + 
		                ", earnings: " + earnings;
		 };
		
		 @Override
		 public Object clone() throws CloneNotSupportedException {
		     return super.clone();
		 }

}
