package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
       public static void main(String[] arqs) {
		
    	   List<Gato> gatos = new ArrayList<>(){{
    		   add(new Gato("jonh", 18, "preto"));
    		   add(new Gato("dom", 12, "branco"));
    		   add(new Gato("nonossa", 15, "pardo"));
    	   }};
    	  
    	   System.out.println("Ordem de insercao: " );
    	   System.out.println(gatos);
    	   
    	   System.out.println("Ordem aleatorio: " );
    	   Collections.shuffle(gatos);
    	   System.out.println(gatos);

    	   System.out.println("Ordem natural(nome " );
    	   Collections.sort(gatos);
    	   System.out.println(gatos);
    	   
    	   System.out.println("ordem de idade: ");
    	   Collections.sort(gatos, new ComparatorIdade());
    	   System.out.println(gatos);
    	   
    	   System.out.println("ordem de cor: ");
    	   Collections.sort(gatos, new ComparatorCor());
    	   System.out.println(gatos);
    	   
    	   System.out.println("ordem nome/cor/idade: ");
    	   Collections.sort(gatos, new ComparatorNomeCorIdade());
    	   System.out.println(gatos);
	}
}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(),g2.getIdade() );
	}
	
}

class ComparatorCor implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
		
	}
	
}