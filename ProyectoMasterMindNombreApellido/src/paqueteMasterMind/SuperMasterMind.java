package paqueteMasterMind;

public class SuperMasterMind {

	int [][] resultado;
	char [][] tablero;

	public SuperMasterMind() {
		super();
	}

	protected void inicializarTablero() {
		int i,j;
		for (i=0; i<15; i++)
			for (j=0; j<4; j++)
				tablero[i][j] = '-';
	}

	protected void inicializarResultado() {
		int i,j;
		for (i=0; i<15; i++)
			for (j=0; j<2; j++)
				resultado[i][j] = 0;		
	}

}