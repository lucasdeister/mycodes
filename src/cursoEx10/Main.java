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

		System.out.println("Informe o número de funcionários:");
		int numFuncionarios = sc.nextInt();
		
		Funcionario[] vect = new Funcionario[numFuncionarios];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Informe o id:");
			int id = sc.nextInt();
			sc.nextLine();
			while (list.contains(id)) {
				System.out.println("Este id já existe, informe outro:");
				id = sc.nextInt();
				sc.nextLine();
			}
			list.add(id);
			System.out.println("Informe o nome:");
			String nome = sc.nextLine();
			System.out.println("Informe o salário:");
			double salario = sc.nextDouble();
			vect[i] = new Funcionario(id, nome, salario);
		}
		
		System.out.println("Informe o id do funcionário que terá um aumento:");
		idFuncionario = sc.nextInt();
		if(list.contains(idFuncionario)){
			indiceVetor = list.indexOf(idFuncionario);
			sc.nextLine();
			System.out.println("Informe a porcentagem de aumento do funcionário:");
			porcentagem = sc.nextInt();
		
			vect[indiceVetor].setAumento(porcentagem);
		}
		else
			System.out.println("O código deste funcionário não existe");

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i].getId());
			System.out.print(" - Nome: " + vect[i].getNome());
			System.out.print(", Salário: " + vect[i].getSalario());
			System.out.println();
		}
		
		sc.close();
	}
}