package aapaliTexiMeterDao;

public class SUV {
	public void fareChargesforSUV(int distance_covered) {
		int base_kms = 5;
		int base_fare = 100;
		int first_15_kms =15;
		if(distance_covered<=3) {
			System.out.println(" Sedan - Rs. "+ base_fare);
		}
		else if(distance_covered<=18) {
			int after_base_kms = distance_covered-base_kms;
			int fare_for_next_15 = base_fare + after_base_kms*15;
			System.out.println(" Sedan - Rs. "+ fare_for_next_15);
		}
		else if(distance_covered>18) {
//			int after_15 = distance_covered-18;					
			int after_15_in_kms = distance_covered - (base_kms + first_15_kms);
			int fare_after_15_in_kms = base_fare + first_15_kms*15 + after_15_in_kms*12;
			System.out.println(" Sedan - Rs. "+ fare_after_15_in_kms);
		}
		
	}

}
