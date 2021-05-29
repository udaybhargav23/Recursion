import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void towerOfHanoi(int n, char from_rod,
                    char to_rod, char aux_rod)
{
    if (n == 1)
    {
        System.out.println("1:"+
                           from_rod+"->"+to_rod);
        return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println(n + ":" +
                       from_rod +"->" + to_rod );
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
 
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int n = inp.nextInt();
					  towerOfHanoi(n, 'A', 'C', 'B');

	}
}
