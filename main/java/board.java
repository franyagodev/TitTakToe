import java.util.Random;

public class board {

	private static final int MAX_SIZE_BOARD = 3;
	char [][] board = new char [MAX_SIZE_BOARD][MAX_SIZE_BOARD];
	


public void printBoard() {
	for	(int i=0; i<=board.length-1; i++) {
		for	(int j=0; j<=board.length-1; j++) {
		System.out.print("["+i+","  +  j + "] " + "("+ board[i][j] + ")  ");
		}
		System.out.println("\n");
	}
}

board () {
	for	(int i=0; i<=board.length-1; i++) {
		for	(int j=0; j<=board.length-1; j++) {
		board[i][j]=' ';
		}
	}
	this.printBoard();
}


public void putPiece(int x, int y, char piece) {
	if (this.board[x][y]==' ') {
		this.board[x][y] = piece;
		System.out.println("Doing movement...");
		this.printBoard();
		}
	
}


public void putPiece( char piece) {
	
		int [] coordenates= this.generateRandom();
		if (this.board[coordenates[0]][coordenates[1]]==' ') {
			this.board[coordenates[0]][coordenates[1]] =piece;
			System.out.println("Doing movement...");
			this.printBoard();
		}
	
}


public int[] generateRandom() {
	int min_val = 0;
	Random ran = new Random();
	int [] randomCoordenate = new int[2];
	randomCoordenate[0] = ran.nextInt(MAX_SIZE_BOARD) ;
	randomCoordenate[1] = ran.nextInt(MAX_SIZE_BOARD) ;
	return randomCoordenate;
	
	
}



}