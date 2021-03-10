package testedevmedia;

import java.util.Scanner;

public class TesteDevMedia {

	public static void main(String[] args) {
		
		int codigoUsuario = 1234;
		int codigoSenha = 9999;
		
		acesso log = new acesso();
		Scanner in = new Scanner(System.in);
		System.out.println("USUÁRIO: ");
		log.usuario = in.nextInt();
		
		if (log.usuario != codigoUsuario) {
				System.out.println("Usuário Invalido!");
				System.out.println("Sistema Encerrado!");
			
		} else {
			
				Scanner pas = new Scanner(System.in);
				System.out.println("SENHA: ");
				log.senha = in.nextInt();
				
				if (log.senha == codigoSenha) {
					System.out.println("Acesso Permitido!");
				}
				else {
				
					System.out.println("Senha Incorreta");
					Scanner opcao = new Scanner(System.in);
					System.out.println("Para tentar novamente: Aperte 1");
					System.out.println("Para encerrar sistema: Aperte 0");
					int escolha = in.nextInt();
					
						while (escolha == 1);{
														
						}
					 	
				  	if( escolha == 0){
						System.out.println("Sistema Encerrado");
					}
				
				else {
					
				}
			}
		}
	}
}			
			
								
					
						
					
						
		
