package JogoVelha;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		System.out.println("--- JOGO DA VELHA ---");
		Estrutura jogo = new Estrutura();
		Scanner scanner = new Scanner(System.in);
		jogo.imprimirMatriz();
		System.out.println();
		
		// Loop do jogo
		boolean continuarJogo = true;
		String vencedor = null;
		while (continuarJogo) {
			
			// Jogador X
			System.out.print("Em qual posição quer colocar o 'X' ? ");
			int linhaX = scanner.nextInt();
			int colunaX = scanner.nextInt();
			jogo.setMatriz(linhaX, colunaX, "X"); // Definir a posição de "X"
			jogo.imprimirMatriz(); // Mostrar novamente após a atualização 
			System.out.println();
			if(jogo.verificarVencedor("X")) {
				vencedor = "X";
				continuarJogo = false;
				break;
			}
		
		
			// Jogador O
			System.out.print("Em qual posição quer colocar o 'O' ? ");
			int linhaO = scanner.nextInt();
			int colunaO = scanner.nextInt();
			jogo.setMatriz(linhaO, colunaO, "O"); // Definir a posição de "O"
			jogo.imprimirMatriz(); // Mostrar novamente após a atualização 
			System.out.println();
			if(jogo.verificarVencedor("O")) {
				vencedor = "O";
				continuarJogo = false;
				break;
			}
		
		}
		if(vencedor != null) {
			System.out.println("O jogador " + vencedor + " venceu!");
		} else {
			System.out.println("Empate!");
		}
		scanner.close();
	}
}
