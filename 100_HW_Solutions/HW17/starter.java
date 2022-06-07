import pkg.*;

class starter {
	public static void main(String args[]) {
		
	}
	
	private boolean forwardMoveBlocked() {
		if(((pos == 0) && (facingRight == false)) || ((pos == 3) && (facingRight == true))) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void move() {
		if (hall[pos] >= 1) {
			hall[pos]--;
		}
		
		if (hall[pos] == 0) {
			if (forwardMoveBlocked()) {
				facingRight = !facingRight;
			}
			else {
				if(facingRight) {
					pos++;
				}
				else {
					pos--;
				}
			}
		}
	}
	
	public int clearHall() {
		while(true) {
			if(hallIsClear) {
				break;
			}
			else {
				PR2004.move();
			}
		}
	}
}
