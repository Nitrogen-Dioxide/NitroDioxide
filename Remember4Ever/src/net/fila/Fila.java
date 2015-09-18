package net.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<People> ppl = new LinkedList<People>();

	public void add(People e) {
		this.ppl.add(e);
	}

	public People remove() {
		return this.ppl.remove(0);
	}
	
	public boolean isEmpty() {
		return this.ppl.isEmpty();
	}
}
