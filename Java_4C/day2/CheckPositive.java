public class CheckPositive {
    int num;
    CheckPositive(int n){
        num=n;
    }
    void check(){
        if (num<0){
            System.out.println("The number "+num+" is negative");
        }
        else{
            System.out.println("The number "+ num + " is positive");
        }
    }
    public static void main(String[] args) {
        CheckPositive obj1= new CheckPositive(5);
        obj1.check();
        CheckPositive obj2= new CheckPositive(-8);
        obj2.check();
    }
}
