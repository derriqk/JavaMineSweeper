
public class Game {

    public static void main(String[] args) {

        Board game = new Board(10, 35);
        game.placeMine();
        game.readField();

    }

}
