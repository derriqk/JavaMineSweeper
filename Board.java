
public class Board {

    public int mineField[][]; // uses an impossible number to represent special tiles
    // if mine: -1
    // if uninitialized: -2
    public int size;
    public int mineCount;

    // creating the board
    public Board(int size, int mineCount) {
        this.mineCount = mineCount;
        this.size = size;
        this.mineField = new int[size][size];
    }

    public void readField() { // to read the mine, it is a cheat method so it is for debug
        int mineAmount = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("");
            for (int j = 0; j < size; j++) {
                System.out.print(mineField[i][j]);
                if (mineField[i][j] == -1) {
                    mineAmount++;
                }
            }
        }
        System.out.println("");
        System.out.println("Mine count is: " + mineAmount); // checks validity

    }

    public void placeMine() {
        // updated counters for the point of calculating placement
        int remainMine = mineCount;
        int remainTile = size * size;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // turn the operations to double so it keeps the floating precision
                double chance = (double) remainMine / (remainTile * remainTile) * 100;
                // System.out.println(chance); // debug

                // this checks if it can place mine based on the probability
                if (Math.random() < chance) {
                    this.mineField[i][j] = -1; // it is now a mine
                    remainMine--; // decrement remaining mines
                } else {
                    this.mineField[i][j] = -2; // it is now yet to be intitialized, will later be changed to reflect nearby bombs
                }
                remainTile--; // always subtract the remain tile;
            }
        }
    }

}
