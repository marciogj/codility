package codility;

public class FrogJmp {
	
	public int solution(int X, int Y, int D) {
		int v = (Y-X)/D;
		v += (Y-X)%D == 0 ? 0 : 1;
		return v;
	}

}
