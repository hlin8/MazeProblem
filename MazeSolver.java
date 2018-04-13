public class MazeSolver {
	Maze inprogress;
	boolean solutionExists;

	public MazeSolver(Maze file) {
		inprogress = file;
	}
	
	public boolean solveMaze(Maze maze) {
		if (inprogress.explorerIsOnA() == Maze.TREASURE) {
			return true;
		}
		if (inprogress.explorerIsOnA() == Maze.WALL) {
			return false; 
		}
		else {
			for (int direction = 0; direction < 4; direction++) {
				Maze snapshot = new Maze(inprogress);
				inprogress.dropA(Maze.WALL); 
				System.out.println("Maze after dropping wall" + 
												System.lineSeparator() +
												inprogress); 
				int heading = (int) Math.pow(2, direction); 
				System.out.println("Now heading is " + heading); 
				inprogress.go(heading);
				System.out.println("Maze after moving" + 
												System.lineSeparator() + 
												inprogress);
				if (solveMaze(inprogress)) //recursive abstraction 
					return true; 
				else {
					System.out.println("------------Hit a wall; now backtracking------------");
					System.out.println("Current maze" + 
												System.lineSeparator() +
												inprogress); 
					inprogress = new Maze(snapshot); 
					System.out.println("Retrieved snapshot" + 
												System.lineSeparator() +
												inprogress); 
					}
			}
			return false;
		}
	}
}