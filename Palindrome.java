import java.util.*;
class Palindrome{ 
    public Boolean pl(int num){
        int r,sum=0,temp;    
     //It is the number variable to be checked for palindrome  
     
     temp=num;    
     while(num>0){    
      r=num%10;  //getting remainder  
      sum=(sum*10)+r;    
      num=num/10;    
     }    
     if(temp==sum) {
        return true;
     }  else{
        return false;public class Constructor{
            Constructor(){
                System.out.println("constructor called");
                
            }
            ~Constructor(){
                System.out.println("destructor called");
            }
         public static void main(String args[]){
             Constructor c=new Constructor();
         }
        }
           
     }
    } 
    public static void main(String args[]){  
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
     int num=s.nextInt();
     Palindrome p=new Palindrome();
    Boolean c=p.pl(num);
    System.out.println(c);
    } 
}