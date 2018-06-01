package tp_examen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TabSet<E> implements Set<E> {
	private int size = 0;
	private TabIter<E> iter = null;
	private ArrayList<E> tableau;

	public TabSet() {
		this.size = size;
		tableau = new ArrayList<E>();
		iter = new TabIter<E>();
	}
	
	@Override
	public int size() {
		return tableau.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = null;
		
		iterator = tableau.iterator();
		
		return iterator;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Classe TabIter devenu une classe interne à cette class
	 * @author Xavier Bouchenard
	 * @param <E>	Type de l'element
	 */
	class TabIter<E> implements Iterator<E> {
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
}
