public class SudokuSolver {
    public static void main(String[] args) {
        int grid[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        sudokuSolver(grid, 0, 0);

    }

    public static void sudokuSolver(int grid[][], int i, int j) {
        if (i == grid.length) {
            display(grid);
            return;
        }
        int ni = 0;
        int nj = 0;
        if (j == grid[0].length - 1) {
            ni = i + 1;
            nj = 0;
        } else {
            ni = i ;
            nj = j+1;
        }
        if (grid[i][j] != 0) {
            sudokuSolver(grid, ni, nj);
        } else {
            for (int po = 1; po <= 9; po++) {
                if (isValid(grid, i, j, po)) {
                    grid[i][j] = po;
                    sudokuSolver(grid, ni, nj);
                    grid[i][j] = 0;
                }
            }
        }
    }

public static boolean isValid(int grid[][],int x,int y,int val)
{
    for (int i = 0; i < grid[0].length; i++) {
        if(grid[x][i]==val)
        {
            return false;
        }
    }
    for (int i = 0; i < grid.length; i++) {
        if(grid[i][y]==val)
        {
            return false;
        }
    }
    int submti=(x/3)*3;
    int submtj=(y/3)*3;
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            if(grid[submti+i][submtj+j]==val)
            {
                return false;
            }
        }
    
    }
    return true;
}

    public static void display(int grid[][]) {
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
