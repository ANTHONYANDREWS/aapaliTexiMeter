package aapaliTexiMeterDao;

public class Sedan {
	public void fareChargesforSedan(int distance_covered) {
		int base_kms = 5;
		int base_fare = 80;
		int first_15_kms =15;
		if(distance_covered<=3) {
			System.out.print(" Sedan - Rs. "+ base_fare+",");
		}
		else if(distance_covered<=18) {
			int after_base_kms = distance_covered-base_kms;
			int fare_for_next_15 = base_fare + after_base_kms*12;
			System.out.print(" Sedan - Rs. "+ fare_for_next_15+",");
		}
		else if(distance_covered>18 && distance_covered<=100) {
//			int after_15 = distance_covered-18;					
			int after_15_in_kms = distance_covered - (base_kms + first_15_kms);
			int fare_after_15_in_kms = base_fare + first_15_kms*12 + after_15_in_kms*10;
			System.out.print(" Sedan - Rs. "+ fare_after_15_in_kms+",");
		}
		else if(distance_covered>100) {
			int no_base_charges = distance_covered*10;
			System.out.print(" Sedan - Rs. "+ no_base_charges+",");
		}
		
	}

}
