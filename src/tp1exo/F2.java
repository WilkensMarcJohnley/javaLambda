package tp1exo;

import java.util.function.Function;

public class F2 {
 public static void main(String[] args) {
	T2 f2= (Function <Integer, Integer> f)-> f.apply(f.apply(0));
	
	System.out.println( f2.apply( (x)->x+1) );
}
}
