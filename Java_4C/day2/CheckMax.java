

public class CheckMax {
    int a,b,c;
    CheckMax(int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }
    void findMax(){
        if (a>=b && a>=c){
            System.out.println("The number "+a+" is maximum");
        }
        else if (b>=a && b>=c){
            System.out.println("The number "+b+" is maximum");
        }
        else{
            System.out.println("The number "+c+" is maximum");
        }
    }
    public static void main(String[] args) {
        CheckMax obj1= new CheckMax(13, 29, 25);
        obj1.findMax();
        CheckMax obj2= new CheckMax(11, 30, 50);
        obj2.findMax();
    }
}
