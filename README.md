# MazeProblem
Henry Lin, Michelle Yang

## Statement of the Problem:
Returns the boolean value of the statement:
"There exists one path through a maze
starting at a designated beginning
and ending at the treasure, provided that one exists."

### Recursive Abstraction:
When I am asked to find a legal path through a maze in which n tiles
have been visited, the recursive abstraction can find a legal path
through a maze in which n + 1 tiles have been visited. 
~~When I am asked to find a legal path of size n through a maze,
the recursive abstraction can find a legal path of size n + 1.~~

Definition of Legal:
- Each "tile" or position is crossed only once by the "explorer".
- The path doesn't contain smaller paths to dead-ends.
- Path doesn't cross barriers/walls.
- Each movement is a cardinal direction, i.e North, South, West, East

## Base Case
 If explorer on illegal tile,
 return error
 else
 The explorer has reached the treasure
 
## English or Pseudocode description of algorithm 

int direction = 1;
if explorerposition = 0

   return true;
 
else
   
   create a snapshot of the maze
   
   go(direction) <!-- Updates the current instance of the maze -->
   
   if explorerisonA() == 2
   
   invoke recursive abstraction
   
   else
   
   retrieve/use snapshot <!--as new maze -->
   
   dropA(0) <!--I'm a bit iffy about this statement. If the maze has a long dead-end, once the explorer reaches the dead-end,
   it will retreive the snapshot, (one step backwards) and drop a wall there. It won't drop a wall on the step that confirms the dead-end. Should we be worried about it? It's just a nit-picky thing.
   
   direction += 1;

  ~~for each unvisited and possibly legal tile, 
    move the explorer to the tile 
    if legal, 
      assign "true" to "visited" to the associated tile
      invoke the recursive abstraction 
    if not legal, //explorer backtracks until it finds a tile with 2 possible routes 
      assign "true" to "containsDeadEnd"
      move explorer back 1 tile 
  move explorer back 1 tile
return ~~

## Class(es) w/ fields and methods 

### MazeSolver:
Methods:
- MazeSolver(Maze snapshot)
Fields:
- direction <!-- To iterate each direction the explorer should go -->
- snapshot of the maze


### Maze Builder: 
Fields: 
- visited (boolean) 
~~- containsDeadEnd (boolean)~~ 
- xcor / ycor 
- treasure

Methods: 
- BuildMaze(int row, int col) 

~~### MazeSolver:
Fields:
- 2D Array that has visited and legal parameters 
- explorer 
- currentCardinalDirection ( N, E, S, W) 
Methods:
- solveMaze()
- setXCor
- setYCor ~~

## Version *n* wish list  
  - return all solutions
  - shortest path to a solution 
