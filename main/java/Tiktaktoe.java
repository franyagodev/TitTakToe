
public class Tiktaktoe {
	

	public static void main(String[] args)
    {
        System.out.println("Hola mundo");
        board mainBoard = new board();
        
        Gamer gamerOne= new Gamer('x', mainBoard);
        
        gamerOne.move();
        
        
        Gamer gamerTwo= new Gamer('o', mainBoard);
        gamerTwo.move();
        
        
        gamerOne.move();
        gamerTwo.move();
    }
	
}
