public class MazeSolver {
	Maze inprogress;
	boolean solutionExists;

	public boolean solveMaze(Maze maze) {
		if (inprogress.explorerIsOnA() == 0) {
			return true;
		}
		else {
			Maze snapshot = new Maze(inprogress);
			for (int direction = 1; direction < 5; direction++) {
				switch(direction) {
					case 0:
						inprogress.dropA(1); 
						inprogress.go(1);
						if (inprogress.explorerIsOnA() == 2) {
							solveMaze(inprogress);
							break;
						}
					case 1:
						inprogress.dropA(1); 
						inprogress.go(2);
						if (inprogress.explorerIsOnA() == 2) {
							solveMaze(inprogress);
							break;
						}
					case 2:
						inprogress.dropA(1); 
						inprogress.go(3);
						if (inprogress.explorerIsOnA() == 2) {
							solveMaze(inprogress);
							break;
						}
					case 3:
						inprogress.dropA(1); 
						inprogress.go(4);
						if (inprogress.explorerIsOnA() == 2) {
							solveMaze(inprogress);
							break;
						}
					default:
						solveMaze(snapshot);
				}
			}
			return false;
		}
	}
}