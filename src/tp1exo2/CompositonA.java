package tp1exo2;

import java.util.function.Function;

public class CompositonA {
	
	public static void main(String[] args) {
		Function<Integer, Integer> fx= (x)->x+1;
		Function<Integer, Integer> gx = (x)->2*x;
		
		System.out.println( (gx.andThen(fx)).apply(3) ) ;
	}
}
