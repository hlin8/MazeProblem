# MazeProblem
Henry Lin, Michelle Yang

## v1
Find the shortest path to the treasure, granted one exists.

## Statement of the Problem:
Returns the smallet integer value of all possible paths
through a maze
starting at a designated beginning
and ending at the treasure"

### Recursive Abstraction:
When I am asked to find the shortest path through a maze
, the recursive abstraction can find the shortest path of n - 1 tiles.

Definition of Legal:
- Each "tile" or position is crossed only once by the "explorer".
- The path doesn't contain smaller paths to dead-ends.
- Path doesn't cross barriers/walls.
- Each movement is a cardinal direction, i.e North, South, West, East

## Base Case
 If explorer on the wall, return false
 If explorer on the treasure, return true
 
## English or Pseudocode description of algorithm 
English description: 
```
if explorer is on a wall 
 return "Error"
if explorer is on treasure
 return 0 
else
 for each direction
 check for legal directions (i.e. if only north and south is legal, then record those directions somewhere in memory)
  create a snapshot of the maze //updates current instance of the maze 
  move the explorer one tile towards directions listed above
  if explorer is on a stepping stone
  shortestpathlength += 1;
  invoke recursive abstraction
  else 
   retrieve/use snapshot //as new maze 
   drop a wall
return shortestpathlength;
```
Pseudocode: 
```
int direction = 1;

if explorerisonA() = 0

   return true;
 
else
   
   create a snapshot of the maze
   
   go(direction) <!--Updates the current instance of the maze -->
   
   if explorerisonA() == 2
   
   invoke recursive abstraction
   
   else
   
   retrieve/use snapshot <!--as new maze -->
   
   dropA(1) 
   
   direction += 1;

return false <!-- If on treasure, return true. Anything else should return false after invoking the MazeSolver method. -->
```
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
- xcor / ycor 
- treasure

Methods: 
- BuildMaze(int row, int col) 

## Version *n* wish list  
  - return all solutions
  - shortest path to a solution 
  
### Known Bugs
As of yet, we have not encountered any bugs nor have we tested larger cases due to time constraints.
