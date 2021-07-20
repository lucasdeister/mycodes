package cursoEx10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		int porcentagem = 0;
		int idFuncionario = 0;
		int indiceVetor = 0;

		System.out.println("Informe o n�mero de funcion�rios:");
		int numFuncionarios = sc.nextInt();
		
		Funcionario[] vect = new Funcionario[numFuncionarios];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Informe o id:");
			int id = sc.nextInt();
			sc.nextLine();
			while (list.contains(id)) {
				System.out.println("Este id j� existe, informe outro:");
				id = sc.nextInt();
				sc.nextLine();
			}
			list.add(id);
			System.out.println("Informe o nome:");
			String nome = sc.nextLine();
			System.out.println("Informe o sal�rio:");
			double salario = sc.nextDouble();
			vect[i] = new Funcionario(id, nome, salario);
		}
		
		System.out.println("Informe o id do funcion�rio que ter� um aumento:");
		idFuncionario = sc.nextInt();
		if(list.contains(idFuncionario)){
			indiceVetor = list.indexOf(idFuncionario);
			sc.nextLine();
			System.out.println("Informe a porcentagem de aumento do funcion�rio:");
			porcentagem = sc.nextInt();
		
			vect[indiceVetor].setAumento(porcentagem);
		}
		else
			System.out.println("O c�digo deste funcion�rio n�o existe");

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i].getId());
			System.out.print(" - Nome: " + vect[i].getNome());
			System.out.print(", Sal�rio: " + vect[i].getSalario());
			System.out.println();
		}
		
		sc.close();
	}
}