
public class Board {

    public int mineField[][];
    public int size;
    public int mineCount;

    // creating the board
    public Board(int size, int mineCount) {
        this.mineCount = mineCount;
        this.size = size;
        this.mineField = new int[size][size];
    }

    public void readField() { // to read the mine, it is a cheat method so it is for debug
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.err.println(mineField[i][j]);
            }
        }
    }

    public void placeMine() {
        // turn the operations to double so it keeps the floating precision
        double chance = (double) mineCount / (size * size);
        // System.out.println(chance); // debug
    }

}
