package testedevmedia;

import java.util.Scanner;

public class TesteDevMedia {

	public static void main(String[] args) {

		int codigoUsuario = 1234;
		int codigoSenha = 9999;

		Scanner in = new Scanner(System.in);
		System.out.println("USUÁRIO: ");

		var usuario = in.nextInt();

		if (usuario != codigoUsuario) {
			System.out.println("Usuário Inválido!");
			System.out.println("Sistema Encerrado!");
			System.exit(1);
		}

		var autenticado = false;

		while (!autenticado) {
			System.out.println("SENHA: ");
			var senha = in.nextInt();

			if (senha == codigoSenha) {
				autenticado = true;

				System.out.println("Usuário autenticado");
				break;
			}
			System.out.println("Senha Inválida!");
			System.out.println("Para tentar novamente: Aperte 1");
			System.out.println("Para encerrar sistema: Aperte 0");
			var opcao = in.nextInt();

			if (opcao == 1)
				continue;
			else {
				System.out.println("Sistema Encerrado");
				break;
			}
		}
	}
}
