
   public class binarysearch {

    public static int bSearch(int arra[],int key){
        int start=0;
        int end=arra.length-1;

        
        while(start<=end){
            int mid=(start+end)/2;
        if(arra[mid]==key){
            //System.out.println("the key is at the index"+mid);
            return mid;
        }
        
     if(arra[mid]>key){
                end=mid-1;
            }
        else{
                start=mid+1;
            }
        
       
     }
    return -1;
    }
    

    public static void main(String args[]){
        int arra[]={2,4,6,8,10,12,14,16};
        int key=10;
        System.out.println("the key is at the index"+bSearch(arra,key));

    }

}
