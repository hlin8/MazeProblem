/**
  Tests the MazeSolver class 
  **/ 
public class UserOfMazeSolver{
	private static Displayer displayer;

    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

         Maze maze = new Maze("4cell_treasureWest.txt", 0, 2)
                            ;
        System.out.println( maze + System.lineSeparator());
	      
        MazeSolver solver;
        solver = new MazeSolver(maze);
        solver.solveMaze(maze);
     }
	
}