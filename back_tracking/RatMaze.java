public class RatMaze{
	// assumption is square maze
	boolean solveMaze(int maze[][],int x, int y, int sol[][]) { 
		if 

        return false;
  }
	public static void main (String args[]) { 
        RatMaze rat = new RatMaze(); 
        int maze[][] = {
        	{1, 0, 0, 0}, 
            {1, 1, 0, 1}, 
            {0, 1, 0, 0}, 
            {1, 1, 1, 1} 
        }; 
        int sol[][] = {
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 0, 0}, 
            {0, 0, 0, 0} 
        }; 
        int x =0;
        int y=0;
        rat.solveMaze(maze,x,y,sol); 
    } 
}