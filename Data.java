public class Data {
    public static final int MAX = 200;
    private int[][] grid;

    public Data(int rows, int cols) {
        grid = new int[rows][cols];
    }

    public Data(int[][] toGrid) {
        grid = toGrid;
    }

    /** Fills all elements of grid with randomly generated values, as described in part (a)
     * Precondition: grid is not null.
     *  grid has at least one element.
     */
    public void repopulate() {
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                //System.out.println("Populating position "+i+", "+j);
                grid[i][j] = (int) (Math.random() * (MAX - 1) + 1);
                while (grid[i][j]%10!=0||grid[i][j]%100==0) {
                    //System.out.println("Trying: "+grid[i][j]);
                    grid[i][j] = (int) (Math.random() * (MAX - 1) + 1);
                }
                //System.out.println("Position "+i+", "+j+" populated");
            }
        }
    }

    /** Returns the number of columns in grid that are in increasing order, as described
     * in part (b)
     * Precondition: grid is not null.
     *  grid has at least one element.
     */
    public int countIncreasingCols() {
        int count = 0;
        for (int j=0; j<grid[0].length; j++) {
            boolean inc = true;
            for (int i=0; i<grid.length-1; i++) {
                if (grid[i][j]>grid[i+1][j]) inc = false;
            }
            if (inc) count++;
        }
        return count;
    }

    public String toString() {
        String rtn = "";
        for (int[] row : grid) {
            for (int pos : row) {
                rtn+=pos+" ";
            }
            rtn += "\n";
        }
        return rtn;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}