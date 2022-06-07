package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	
	private int[] rateTable;
	int startHour;
	int ChargeTime;

	private int getChargingCost(int startHour, int ChargeTime) {
		
		int chargingCost = 0;
		
		for (int c = 0; c < ChargeTime; c++) {
			
			if ((startHour + c) > 23) {
				
				chargingCost = chargingCost + rateTable[startHour + c - 24];
				
			}
			
			else {
				
				chargingCost = chargingCost + rateTable[startHour + c];
				
			}
			
		}
		
		return chargingCost;
		
	}
	
	public int getChargeStartTime(int chargeTime) {
		
		int optimalStartTime = 0;
		
		for (int c = 1; c <= 23; c++) {
			
			if (getChargingCost(c, chargeTime) < getChargingCost(optimalStartTime, chargeTime)) {
				
				optimalStartTime = c;
				
			}
			
		}
		
		return optimalStartTime;
		
	}

}

