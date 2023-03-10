public class trappedrainwater {
    public static void rainwater(int numbers[]){
    if(numbers.length==1||numbers.length==2){
    System.out.println("no rainwater can be trapped");
    }
    else{

    
    int leftmax[]=new int[numbers.length];
    
    leftmax[0]=numbers[0];
    for(int i=1;i<numbers.length;i++){
        leftmax[i]=Math.max(numbers[i],leftmax[i-1]);

        

    }
    int rightmax[]=new int[numbers.length];
   
   rightmax[numbers.length-1]=numbers[numbers.length-1];
    for(int i=numbers.length-2;i>=0;i--){
        rightmax[i]= Math.max(numbers[i],rightmax[i+1]);

      
    }
    int tw;
    int totalw=0;
    for(int i=0;i<numbers.length;i++){
        int wl=Math.min((leftmax[i]),rightmax[i]);
         tw=(wl-numbers[i])*1;
        if(tw<0){
            tw=0;            
        }
        totalw+=tw;
    }
    System.out.println("trapped water is"+totalw);

        
    


    }
}
    public static void main(String arg[]){
        int numbers[]={1,0,2,1,0,1,3,2,1,2,1};
        rainwater(numbers);

    }
    
}
