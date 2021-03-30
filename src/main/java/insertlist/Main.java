package insertlist;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		// TODO Auto-generated method stub
		List<String> valores = new ArrayList<String>();
		for(int i=0;i<5;i++) {			
			valores.add(i, obterDados());
			if(valores.get(i).equals("INVALIDO") || valores.get(i).equals(null)) {
				valores.remove(i);
			}
		}
		for(int i=0;i<valores.size();i++) {
			System.out.println("Item "+i+" é: "+valores.get(i));
		}
		
		
		valores.add("item adicionado automaticamente 01");
		valores.add("item adicionado automaticamente 02");
		valores.remove(1);
		valores.remove(1);

		for(int i=0;i<valores.size();i++) {
			System.out.println("Item "+i+" é: "+valores.get(i));
		}
	}
	
	private String obterDados() {
		Scanner ler = new Scanner(System.in);
		String leitura;
		try {
			System.out.println("Digite uma frase: ");
			leitura = ler.nextLine();
		}
		catch(Exception e) {			
			leitura = "INVALIDO"; 
		}
		
		return leitura;
	}

}
