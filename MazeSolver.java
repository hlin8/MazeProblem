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
		if (inprogress.explorerIsOnA() == 1) {
			return false; 
		}
		else {
			for (int direction = 0; direction < 4; direction++) {
				//System.out.println("Maze before changes" + 
												//System.lineSeparator() +
												//inprogress); 
				inprogress.dropA(1); 
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
				// if (direction == 0) {
					// inprogress.dropA(1);
					// System.out.println("Break");
					// System.out.println(inprogress); 
					// inprogress.go(1);
					// if (inprogress.explorerIsOnA() == 2) {
						// solveMaze(inprogress);
						// }
					// else {
						// inprogress = new Maze(snapshot);
					// }
				// }
				// else if (direction == 1) {
					// inprogress.dropA(1);
					// System.out.println("Break1");
					// System.out.println(inprogress); 
					// inprogress.go(2);
					// if (inprogress.explorerIsOnA() == 2) {
						// solveMaze(inprogress);
						// }
					// else {
						// inprogress = new Maze(snapshot);
					// }
				// }
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