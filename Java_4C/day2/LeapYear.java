public class LeapYear {
    int yr;
    LeapYear(int num){
        yr=num;
    }
    void yearcheck(){
        if ((yr%4==0)||(yr%100==0)){
            System.out.println("The year "+yr+" is a leap year");
        }
        else{
            System.out.println("The year "+yr+" is not a leap year");
        }
    }
    public static void main(String[] args) {
        LeapYear obj1=new LeapYear(2005);
        obj1.yearcheck();
        LeapYear obj2= new LeapYear(2024);
        obj2.yearcheck();
    }
}
