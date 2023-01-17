package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto de notas: ");
		//hashset//
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.3, 9.4, 5d, 8d, 8d));
		System.out.println(notas.toString());
		
		System.out.println("confira se a nota 5.0 esta no conjunto: " + notas.contains(5d));
		
		System.out.println("exiba a menor e a maior nota: " + Collections.min(notas) + ", " + Collections.max(notas) );
	
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
			System.out.println("exiba a soma dos valores: " + soma);
			
			System.out.println("exiba a media dos valores: " + soma/notas.size());
			
			System.out.println("remova a nota 5.0: ");
			notas.remove(5d);
			System.out.println(notas);
			
			//linkedhashset//
			
			System.out.println("Exiba as notas na ordem em que foram informados: ");
			Set<Double> notas2 = new LinkedHashSet<Double>();
			notas2.add(7d);
			notas2.add(8.5);
			notas2.add(8d);
			notas2.add(3.4);
			
			System.out.println("exiba as notas em ordem crescente: ");
			Set<Double> notas3 = new TreeSet<>(notas2);
			System.out.println(notas3);
			
			System.out.println("apague todo o conjunto: ");
			notas.clear();
			System.out.println("confira se o conjunto esta vazio: " + notas.isEmpty());
		}
		
		
	}
}
