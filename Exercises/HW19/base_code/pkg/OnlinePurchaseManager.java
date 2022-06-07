package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
//   private ArrayList<Gizmo> purchases;
   private ArrayList<Gizmo> purchases = new ArrayList<Gizmo>();
   
	public void add (String maker, boolean isE, double cost) {
		Gizmo a = new Gizmo(maker, isE, cost);
		purchases.add(a);
	}
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
		Gizmo b = new Gizmo("", true, 1000.0);
		for(int x = 0; x < purchases.size(); x++) {
			if(((purchases.get(x)).getMaker()).equals(mkr)) {
				if((purchases.get(x)).getCost() < b.getCost()) {
					b = (purchases.get(x));
				}
			}
		}
		return b;
   }
   
   
   public String toString()
   {
   	return ("" + purchases);
   }
   
   public int countElectronicsByMaker (String a) {
		int c = 0;
		for(int x = 0; x < purchases.size(); x++) {
		   if((purchases.get(x)).isElectronic()) {
		   	if(((purchases.get(x)).getMaker()).equals(a)) {
		   	   c++;
		   	}
		   }
		}
		return c;
	}
	
	public boolean hasAdjacentEqualPair () {
	   boolean d = false;
	   for(int x = 0; x < (purchases.size() - 1); x++) {
		   if((purchases.get(x)).equals((purchases.get(x + 1)))) {
		      d = true;
		   }
		}
	   return d;
	}
}
