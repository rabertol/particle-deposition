package color;

public class RGBValues {
	int r;
	int g;
	int b;
	
	public RGBValues(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "r: "+r+" g: "+g+" b: "+b;
	}

}
