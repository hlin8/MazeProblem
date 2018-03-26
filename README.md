# MazeProblem

## Statement of the Problem:
Returns the boolean value of the statement:
"There exists one path through the maze
starting at a designated beginning
and ending at the treasure, provided that one exists.

### Recursive Abstraction:
When I am asked to find a path through the maze,
the recursive abstraction can find a legal path of size n - 1.

Definition of Legal:
  -Each "tile" or position is crossed only once by the "explorer".
 
  -The path doesn't contain smaller paths to dead-ends.
  
  -Path doesn't cross barriers/walls.
  
  -Each movement is a cardinal direction, i.e North, South, West, East
