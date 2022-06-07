package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable extends SingleTables {
	int seats;
	double viewQuality;

	public CombinedTable(SingleTable a, SingleTable b) {
		seats = a.getNumSeats() + b.getNumSeats() - 2;
		if (a.getHeight() == b.getHeight()) {
			viewQuality = (a.getViewQuality() + b.getViewQuality()) / 2;
		}
		else {
			viewQuality = (a.getViewQuality() + b.getViewQuality()) / 2 - 10;
		}
		
	}
	
	public boolean canSeat(int a) {
		if (a > seats) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void setViewQuality(double a) {
		double b;
		b = super(get.ViewQuality());
		viewQuality = viewQuality - (b - a) / 2;
		super(setViewQuality(a));
	}
	
	public double getDesirability() {
		return viewQuality;
	}

}

