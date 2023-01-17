package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<Double> notas = new ArrayList<Double>();
		
		notas.add(8.5);
		notas.add(7.5);
		notas.add(4.5);
		notas.add(8.0);
		notas.add(9.5);
		notas.add(4.5);
		notas.add(3.5);
		System.out.println(notas.toString());
		System.out.println("exiba a nota da posicao 8.5: " + notas.indexOf(8.5d));
		System.out.println("adiciona a nota 6.0 da posicao 3");
	    notas.add(3, 6d);
	    System.out.println(notas);
	    System.out.println("substitua a nota 4.5 por 7.0: ");
	    notas.set(notas.indexOf(4.5d), 7.0);
	    System.out.println(notas);
		System.out.println("confira se a nota 8.5 esta na lisa: " + notas.contains(8.5d));
		System.out.println("exiba todas as notas na ordem em que forma informados: ");
		for(Double nota : notas) System.out.println(nota);
		
		System.out.println("exiba a terceira nota adicionada: " + notas.get(2));

		System.out.println("exiba a menor nota" + Collections.min(notas));
		
		System.out.println("exiba a maior nota" + Collections.max(notas));
		
		System.out.println("exiba a soma dos valores");
		
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
			System.out.println(soma);
			
			System.out.println("exiba a media das notas " + (soma/notas.size()));
			
			System.out.println("remova a nota da posicao 0");
			notas.remove(0d);
			System.out.println(notas);
			
			System.out.println("remova as notas menor que 7 ");
			Iterator<Double> iterator1 = notas.iterator();
			while(iterator1.hasNext()) {
			Double next1 = iterator1.next();
			if(next1 < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		}

	}
}
