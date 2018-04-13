/**
  Tests the MazeSolver class 
  **/ 
public class UserOfMazeSolver{
	private static Displayer displayer;

    public static void main(String[] commandLine)
       throws java.io.FileNotFoundException {
        System.out.println();

         Maze maze = new Maze("intersection_noTreasure.txt", 1, 0);
         System.out.println( "Starting maze: " +
										System.lineSeparator() +
										maze + 
										System.lineSeparator());
	      
		MazeSolver solver = new MazeSolver(maze);
        System.out.println(solver.solveMaze(maze));
     }
	
}