// https://leetcode.com/problems/number-of-islands/
package core;

public class NumberOfIslands {
    int n; // NUMBER OF ROWS
    int m; // NUMBER OF COLUMNS

    public int numIslands(char[][] grid) {
        int count = 0; // INITIAL NUMBER OF ISLANDS
        n = grid.length; // LENGTH OF ROWS
        m = grid[0].length; // LENGTH OF COLUMNS

        if (n == 0) // IF THERE IS NO ROWS
            return 0; // RETURN 0
        for (int i = 0; i < n; i++) { // FOR EACH ROW
            for (int j = 0; j < m; j++) // FOR EACH COLUMN
                if (grid[i][j] == '1') { // IF THE CELL IS '1'
                    DFSMarking(grid, i, j); // MARK THE CELL AS '0'
                    ++count; // INCREMENT THE COUNT
                }
        }
        return count; // RETURN THE COUNT
    }

    // DFS MARKING FUNCTION TO MARK THE VISITED CELL AS '0' (RECURSIVE)
    private void DFSMarking(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1') // IF THE CELL IS '0' OR OUT OF BOUND OF THE GRID
            return; // RETURN
        grid[i][j] = '0'; // MARK THE VISITED CELL AS '0'
        DFSMarking(grid, i + 1, j); // UP (RECURSIVE)
        DFSMarking(grid, i - 1, j); // DOWN (RECURSIVE)
        DFSMarking(grid, i, j + 1); // LEFT (RECURSIVE)
        DFSMarking(grid, i, j - 1); // RIGHT (RECURSIVE)
    }

    public static void main(String[] args) { // MAIN

        char[][] grid = { // GRID WHERE 1 = LAND, 0 = WATER
                { '1', '1', '0', '1', '0' },
                { '1', '1', '0', '1', '0' },
                { '0', '0', '1', '0', '0' },
                { '1', '1', '0', '0', '0' },
                { '0', '0', '0', '0', '1' }
        };

        System.out.println();
        System.out.println(new NumberOfIslands().numIslands(grid)); // OUTPUT
        System.out.println();
    }
}
