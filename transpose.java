    import java.util.Scanner;   
    public class transpose{  
    public static void main(String args[]){  
    Scanner in = new Scanner(System.in);
    int r,c;
    System.out.print("Enter the number of rows and columns : ");    
    r=in.nextInt();
    c=in.nextInt();
    int m1[][]=new int[r][c]; 
    int transpose[][]=new int[r][c];  //3 rows and 3 columns  
    
    System.out.print("Enter the elements : ");    
    for(int i=0;i<r;i++){    
    for(int j=0;j<c;j++){    
    m1[i][j]=in.nextInt();
    }    
    }    
    
    for(int i=0;i<r;i++){    
    for(int j=0;j<c;j++){    
    transpose[i][j]=m1[j][i];  
    }    
    }    
      
    System.out.println("Printing Matrix without transpose:");  
    for(int i=0;i<r;i++){    
    for(int j=0;j<c;j++){    
    System.out.print(m1[i][j]+" ");    
    }    
    System.out.println();//new line    
    }    
    System.out.println("Printing Matrix After Transpose:");  
    for(int i=0;i<r;i++){    
    for(int j=0;j<c;j++){    
    System.out.print(transpose[i][j]+" ");    
    }    
    System.out.println();//new line    
    }    
    }}  
