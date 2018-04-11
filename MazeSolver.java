/** 
  Determines whether there exists a path through a maze starting at a designated beginning and ending at the treasure
  **/ 
public class MazeSolver{
  public boolean solveMaze(Maze m){
    if (explorerIsOnA() == 0) 
      return true;
    else if (explorerIsOnA() == 1) 
      return false; 
  } 
} 
