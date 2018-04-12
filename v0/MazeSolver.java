public class MazeSolver {
	Maze inprogress;
	boolean solutionExists;

	public MazeSolver(Maze file) {
		inprogress = file;
	}
	public boolean solveMaze(Maze maze) {
		Maze snapshot = new Maze(inprogress);
		if (inprogress.explorerIsOnA() == 0) {
			return true;
		}
		else {
			for (int direction = 0; direction < 4; direction++) {
				if (direction == 0) {
					inprogress.dropA(1);
					System.out.println("Break");
					System.out.println(inprogress); 
					inprogress.go(1);
					if (inprogress.explorerIsOnA() == 2) {
						solveMaze(inprogress);
						}
					else {
						inprogress = new Maze(snapshot);
					}
				}
				else if (direction == 1) {
					inprogress.dropA(1);
					System.out.println("Break1");
					System.out.println(inprogress); 
					inprogress.go(2);
					if (inprogress.explorerIsOnA() == 2) {
						solveMaze(inprogress);
						}
					else {
						inprogress = new Maze(snapshot);
					}
				}
				// else if (direction == 2) {
				// 	inprogress.dropA(1);
				// 	System.out.println("Break2");
				// 	System.out.println(inprogress); 
				// 	inprogress.go(4);
				// 	if (inprogress.explorerIsOnA() == 2) {
				// 		solveMaze(inprogress);
				// 		}
				// }
				// else if (direction == 3) {
				// 	inprogress.dropA(1);
				// 	System.out.println("Break");
				// 	System.out.println(inprogress); 
				// 	inprogress.go(8);
				// 	if (inprogress.explorerIsOnA() == 2) {
				// 		solveMaze(inprogress);
				// 		}
				// }
				// else {
				// 	solveMaze(snapshot);
				// }	
			}
			return false;
		}
	}
}