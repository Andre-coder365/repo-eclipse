package repoeclipsepack;

//Código feito para testar integração entre a IDE Eclipse e o Github

import java.util.Scanner;

public class RepoEclipse {	
	public static void main(String[] args) {
//		int resultado;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número para saber sua raiz quadrada");
		int baseRaiz = entrada.nextInt();
		
		System.out.println(Math.pow(baseRaiz, 2));
		
		
		
		
		
		entrada.close();
	}

}
