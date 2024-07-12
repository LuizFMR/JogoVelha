package JogoVelha;

public class Estrutura {
	private final String [][] matriz;
	
	public Estrutura() {
		matriz = new String [3][3];
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = "( )";
			}
		}
	}
	
	public void imprimirMatriz() {
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
	public void setMatriz(int linha, int coluna, String ponto) {
		this.matriz[linha][coluna] = "(" + ponto + ")";
	}
	public boolean verificarVencedor(String ponto) {
		String simbolo = "(" + ponto + ")";
		// Verificar linha
		for(int linha =  0; linha < 3; linha++) {
			if (matriz[linha][0].equals(simbolo) && matriz[linha][1].equals(simbolo) && matriz[linha][2].equals(simbolo)) {
				return true;
			}
		}
		// Verificar coluna
		for(int coluna =  0; coluna < 3; coluna++) {
			if (matriz[0][coluna].equals(simbolo) && matriz[1][coluna].equals(simbolo) && matriz[2][coluna].equals(simbolo)) {
				return true;
			}
		}
		// Verificar diagonal
		if (matriz[0][0].equals(simbolo) && matriz[1][1].equals(simbolo) && matriz[2][2].equals(simbolo)) {
			return true;
		}
		if (matriz[0][2].equals(simbolo) && matriz[1][1].equals(simbolo) && matriz[2][0].equals(simbolo)) {
			return true;
		}
		return false;
			
	}
	
	public boolean posicaoValida(int linha, int coluna) {
        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || !matriz[linha][coluna].equals("( )")) {
            return false;
        }
        return true;
    }
	
}

