import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Colecciones {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		//crear variables del padr
		List<String> lista1, lista2, lista3;
		
		 lista1 =   new ArrayList<String>();
		 lista2 = new LinkedList<String>();
		 lista3 = new Vector<String>();
		
		lista1.add("tomas");
		lista1.add("eva");
		lista1.add("santiago");
		 System.out.println(lista1.size());
		for (String ele: lista1)
			System.out.println(ele);

	}

}
