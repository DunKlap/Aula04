import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		
		Scanner leitor = new Scanner(System.in);
		int idade = 0;
		int i=0;
		int soma = 0, media;
		int quantidade;
		
		System.out.println("Insira a quantidade de alunos.");
		quantidade = leitor.nextInt();
		
		while(i<quantidade) {
			System.out.println("Digite a idade do " + (i+1) + " aluno");
			idade = leitor.nextInt();
			soma = soma + idade;
			i = i+1;
		}
		media = soma / quantidade;
		System.out.println("A m�dia de idade �: " + media);
		leitor.close();
	}

}
