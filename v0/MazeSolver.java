/** 
  Determines whether there exists a path through a maze starting at a designated beginning and ending at the treasure
  **/ 
public class MazeSolver{
	Maze inProgress;
	boolean solutionExists; 
	
	public boolean solveMaze() {
		if (inProgress.explorerIsOnA() == 0) 
			return true;
		else if (inProgress.explorerIsOnA() == 1)
			return false;
		return solutionExists;
  }
}

