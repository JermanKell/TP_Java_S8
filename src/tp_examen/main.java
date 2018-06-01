package tp_examen;

public class main {

	public static void main(String[] args) {
		TabIter<Integer> tab = new TabIter<Integer>();
		
		for (int i = 1; i < 10; i++)	{
			tab.AddElement(i);
		}
		
		System.out.println(tab.size());
		
		while (tab.hasNext()) {
			System.out.println("Valeur suivante:\t" + tab.value());
		}

	}

}
