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
		
		//Enter the input 
		System.out.print("Input: ");
		String[] distance_covered_with_kms = br.readLine().split(" ");
		
		//Taking only the kms in integer format
		int distance_covered = Integer.parseInt(distance_covered_with_kms[0]);
		
		//If distance covered by Taxi is valid
		if(distance_covered>0) {
		
		Mini mini = new Mini();
		Sedan sedan = new Sedan();
		SUV suv = new SUV();
		
		//Method to calculate charge of Mini taxi
		mini.fareChargesforMini(distance_covered);
		
		//Method to calculate charge of Mini taxi
		sedan.fareChargesforSedan(distance_covered);
		
		//Method to calculate charge of Mini taxi
		suv.fareChargesforSUV(distance_covered);
		}
		
		//If distance covered is not valid, showing an error message
		else {
			System.out.println("Please enter valid input");
		}
		
	}

	

}
