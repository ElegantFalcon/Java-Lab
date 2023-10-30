import java.util.Scanner; 
public class matrixmul {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int r1,r2,c1,c2,i,j,k;
		System.out.println("Enter the number of rows and columns in first matrix : ");
		r1=in.nextInt();
		c1=in.nextInt();
		System.out.println("Enter the number of rows and columns in second matrix : ");
		r2=in.nextInt();
		c2=in.nextInt();
		if(c1 != r2)
		System.out.println("Matrix multiplication is not possible");
		else {
			int a[][] = new int[r1][c1];
	    		int b[][] = new int[r2][c2];
	  		int c[][] = new int[r1][c2];
			System.out.println("\nEnter values for matrix A : ");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c1; j++) a[i][j] = in.nextInt();
			}
		        System.out.println("\nEnter values for matrix B : ");
			for (i = 0; i < r2; i++) {
				for (j = 0; j < c2; j++) b[i][j] = in.nextInt();
			}
			
			
			System.out.println("\nMatrix multiplication is : ");
			for (i = 0; i < r1; i++) {
				for (j = 0; j < c2; j++) {
					c[i][j] = 0;
					for (k = 0; k < c1; k++) {
				  		c[i][j] += a[i][k] * b[k][j];
				}
				
				System.out.print(c[i][j] + " ");
			      }
			      System.out.println();
			    }
			  }
			}
			}
	  		
		
		
