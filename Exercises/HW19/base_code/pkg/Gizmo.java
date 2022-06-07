package pkg;

public class Gizmo
{ 
   String maker;
   boolean isE;
   double cost;
   
   public Gizmo (String maker, boolean isE, double cost) {
      this.maker = maker;
      this.isE = isE;
      this.cost = cost;
   }
   
    public Gizmo (String maker, boolean isE) {
      this.maker = maker;
      this.isE = isE;
      cost = 0.0;
   }
   
   public String toString()
   {
   	return ("" + maker + " " + isE + " " + cost);
   }
   
   public boolean equals(Gizmo other) {
		if (!(other instanceof Gizmo)) {
			return false;
		}
		else {
			if ((this.maker == other.getMaker()) && (this.isE == other.isElectronic()) && (this.cost == other.getCost())) {
			   return true;
			}
			else {
			   return false;
			}
		}
	}
   
   public String getMaker() {
      return maker;
   }
   
   public boolean isElectronic() {
      return isE;
   }
   
   public double getCost() {
      return cost;
   }
   
}
