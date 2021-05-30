import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int t = inp.nextInt();
					  for (int i=0;i<t;i++){
						  int n = inp.nextInt();
						  System.out.println(countWaysForSum(n));
					  }
	}
	public static long countWaysForSum(int n){
		if (n==0){
			return 0;
		}
		return count(n,1);
	}
	 public static long count(int n, int a){
		 if (n==0){
			 return 1;
		 }else if (n<1){
			 return 0;
		 }
		 long result=0;
		 for (int x=a;x<=n;x++){
			 int j = n-x;
			 long waysOfLesserNuumber = count(j,x+1);
			 result += waysOfLesserNuumber;
		 }
		 return result;
	 }
}
