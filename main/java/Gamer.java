
public class Gamer {
private char[] piece;
private board boardGame;

public Gamer(char piece, board boardGame) {
	this.piece=new char[1];
	this.piece[0] = piece;
	this.boardGame=boardGame;
	
}

public void move() {
	this.boardGame.putPiece( this.piece[0]);
}


public void move(int x, int y) {
	this.boardGame.putPiece(x, y, this.piece[0]);
}

}

