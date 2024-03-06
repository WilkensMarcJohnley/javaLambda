package tp1exo;

import java.util.function.Function;

public class F3 {
	
	public static <A> T3<A> fun(){
		return (Function<A,A> f, A x)-> f.apply(f.apply(x));
	} 
	
	public static void main(String[] args) {
		T3<String> f3= fun();
		System.out.println(f3.t3( (y)-> y+"x" ,"a" ) );
	}
}
