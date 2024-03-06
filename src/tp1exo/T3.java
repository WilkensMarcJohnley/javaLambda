package tp1exo;

import java.util.function.Function;

@FunctionalInterface
public interface T3 <A> {
	public A t3 (Function<A,A> f1, A x);
}
