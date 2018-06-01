package tp_examen;

import java.util.ArrayList;
import java.util.Iterator;

public class TabIter<E> implements Iterator<E> {
	private ArrayList<E> list = null;
	private int index = 0;
	private E value = null;
	
	public TabIter() {
		list = new ArrayList<E>();
	}
	
	public boolean AddElement(E e) {
		boolean val;
		val = list.add(e);
		
		return val;
	}
	
	public boolean RemoveElement(E e) {
		boolean val; 
		val = list.remove(e);
		
		return val;
	}
	
	public int size() {
		return list.size();
	}
	
	@Override
	public boolean hasNext() {
		E e = null;
		boolean val = false;
		
		e = next();
		if (e != null)	{
			val = true;
			setVal(e);
		}
		if (index == list.size())	index = 0;
		return val;
	}

	@Override
	public E next() {
		E e = null;
			
		index++;
		
		if (index < list.size())
				e = list.get(index);
				
		return e;
	}
	
	public void setVal(E e) {
		value = e;
	}
	
	public E value() {
		return value;
	}
	
	public void remove() {
		throw new UnsupportedOperationException("message");
	}
}
