import java.util.Scanner;

class Matrixx{
 int rows;
 int columns;
 int[][] c = new int[rows][columns];
 public Matrixx(int r,int c){
    rows=r;
    columns=c;
 }
 public void enterdata(){
     Scanner s=new Scanner(System.in);
    System.out.println("Enter elements of 2D array");
   
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++){
            c[i][j]=s.nextInt();

        }
    }
 }
 public void printdata(){
   
    for(int i1=0;i1<rows;i1++){
        for(int j1=0;j1<columns;j1++){
            System.out.print(c[i1][j1]);
        }
        System.out.println();
    }
}


 public static void main(String args[]){
 Matrixx m=new Matrixx(3,3);
 //Scanner s=new Scanner(System.in);
 m.enterdata();
 m.printdata();
  
 
}
