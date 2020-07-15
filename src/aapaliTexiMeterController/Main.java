package aapaliTexiMeterController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import aapaliTexiMeterDao.Mini;
import aapaliTexiMeterDao.SUV;
import aapaliTexiMeterDao.Sedan;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input: ");
		String[] distance_covered_with_kms = br.readLine().split(" ");
		int distance_covered = Integer.parseInt(distance_covered_with_kms[0]);
		
		if(distance_covered>0) {
		
		Mini mini = new Mini();
		Sedan sedan = new Sedan();
		SUV suv = new SUV();
		mini.fareChargesforMini(distance_covered);
		sedan.fareChargesforSedan(distance_covered);
		suv.fareChargesforSUV(distance_covered);
		}
		else {
			System.out.println("Please enter valid input");
		}
		
	}

	

}
