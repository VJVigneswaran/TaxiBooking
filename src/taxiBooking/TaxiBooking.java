package taxiBooking;
import java.util.ArrayList;

public class TaxiBooking {
	private static ArrayList<Taxi> taxiList = new ArrayList<Taxi>();
	private static int taxiLimit = 4, idGenerator = 1;
	private static ArrayList<Taxi> taxiBookedHistory = new ArrayList<Taxi>() ;
	
	public static String bookTaxi(char pickupLoc, char dropLoc, int pickupTime) throws CloneNotSupportedException{
		if(taxiList.size() < taxiLimit) {
			taxiList.add(new Taxi());
		}
		
		int minDistance = Integer.MAX_VALUE;
		int minEarnings = Integer.MAX_VALUE;
		Taxi taxiReady = null;

		
		for (Taxi t : taxiList) {
		    int distance = Math.abs(t.getcurrLoc() - pickupLoc);

		    if (t.getdropTime() <= pickupTime) {

		    	if (distance < minDistance) {
		    	    minDistance = distance;
		    	    minEarnings = t.getEarnings();
		    	    taxiReady = t;
		    	}
		    	else if (distance == minDistance && t.getEarnings() < minEarnings) { 
		    		minEarnings = t.getEarnings(); 
		    		taxiReady = t; 
		    	}
		    	}
		}
		
		if(taxiReady != null) {
			taxiReady.setcustomerId(idGenerator++);
			taxiReady.setpickupTime(pickupTime);
			taxiReady.setpickupLoc(pickupLoc);
			taxiReady.setdropLoc(dropLoc);
			taxiReady.setcurrLoc(dropLoc);
			taxiReady.setdropTime(pickupTime + Math.abs(pickupLoc - dropLoc));
			taxiReady.setEarnings(taxiReady.getEarnings() + Math.abs(pickupLoc - dropLoc) * (100+10*10));
			taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1);
			taxiBookedHistory.add((Taxi) taxiReady.clone());
		}
		
		
		return taxiReady!=null ? "Taxi number " + taxiReady.getTaxiId() + " is booked!": "Taxi not available";
	}
		public static void displayDetails(){
			if(!taxiBookedHistory.isEmpty()) {
				for(Taxi t : taxiBookedHistory) {
					System.out.println(t.toString()); 
			}
			}else {
				System.out.print("No Taxi Details available");
			}
		}
		
		public static boolean isValidLocation(char c){
			return c >= 'A' && c <= 'F';
		}

}		
