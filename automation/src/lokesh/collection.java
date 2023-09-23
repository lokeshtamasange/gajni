package lokesh;

import java.util.LinkedList;

import net.bytebuddy.dynamic.scaffold.MethodGraph.Linked;

public class collection {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add("lokesh");
		l.add("amaresh");
		l.add(10);
		l.add(12.4);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.contains(l);
		System.out.println(l)
	}

}
