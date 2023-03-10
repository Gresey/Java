abstract class telephone{
    abstract public void lift();
    abstract public void disconnected();

}
class SmartTelephone extends telephone{
    public void lift(){
        System.out.println("lift the telephone");
    }
    public void disconnected(){
        System.out.println("call gets disconnected...");
    }
    public static void main(String args[]){
        telephone s=new SmartTelephone();
        s.lift();
        s.disconnected();
    }
}