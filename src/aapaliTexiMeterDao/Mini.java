package aapaliTexiMeterDao;

public class Mini {
	
	public void fareChargesforMini(int distance_covered) {
		int base_kms = 3;
		int base_fare = 50;
		int first_15_kms =15;
		
		//For base charges
		if(distance_covered<=3) {
			System.out.print("Mini - Rs. "+ base_fare+",");
		}
		
		//Estimated Cost for distance less than or equal to (base kilometers + next 15 kilometers)
		else if(distance_covered<=18) {
			int after_base_kms = distance_covered-base_kms;
			int fare_for_next_15 = base_fare + after_base_kms*10;
			System.out.print("Mini - Rs. "+ fare_for_next_15+",");
		}
		
		//Estimated Cost for distance more than (base kilometers + next 15 kilometers) and less than or equal to 75 Kilometers
		
		else if(distance_covered>18 && distance_covered<=75) {
//			int after_15 = distance_covered-18;					
			int after_15_in_kms = distance_covered - (base_kms + first_15_kms);
			int fare_after_15_in_kms = base_fare + first_15_kms*10 + after_15_in_kms*8;
			System.out.print("Mini - Rs. "+ fare_after_15_in_kms+",");
		}
		
		//Estimated Cost for distance more than 75 Kilometers
		else if(distance_covered>75) {
			int no_base_charges = distance_covered*8;
			System.out.print("Mini - Rs. "+ no_base_charges+",");
		}
		
	}

}
