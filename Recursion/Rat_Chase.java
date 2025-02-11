import java.util.*;
public class Rat_Chase {
	static boolean val = false;
    public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		char[][] arr = new char[row][col];
		for(int i=0;i<row;i++){
			String s = scan.next();
			for(int j=0;j<col;j++){
				arr[i][j] = s.charAt(j);
			}
		}
		int[][] ans = new int[row][col];
		Print(arr,0,0,ans);
		if(!val){
			System.out.println("NO PATH FOUND");
		}
    }

	public static void Print(char[][] maze,int cr, int cc, int[][] ans){
		if(cr < 0 || cc < 0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc] == 'X'){
			return;
		}
		if(cr == maze.length -1 && cc == maze[0].length -1){
			ans[cr][cc] = 1;
			val = true;
			display(ans);
			
		}

		maze[cr][cc] = 'X';
		ans[cr][cc] = 1;
		int[] r = {-1,0,1,0};
		int[] c = {0,-1,0,1};
		for(int i=0;i<c.length;i++){
			Print(maze,cr+r[i],cc+c[i],ans);
		}
		maze[cr][cc] = 'O';
		ans[cr][cc] = 0;
	}

	public static void display(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}