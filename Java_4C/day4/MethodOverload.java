public class MethodOverload {
    void calcPeri(int side){
        System.out.println("Perimeter of square = "+ (4*side));
    }
    void calcPeri(int length, int width){
        System.out.println("Perimeter of rectangle = "+ (2*(length+width)));
    }
    void calcPeri(double radius){
        System.out.println("Perimeter of cicle = " + (2*3.14*radius));
    }
    public static void main(String[] args) {
        MethodOverload obj1= new MethodOverload();
        MethodOverload obj2= new MethodOverload();
        MethodOverload obj3= new MethodOverload();
        obj1.calcPeri(15);
        obj2.calcPeri(13, 29);
        obj3.calcPeri(17.5);
    }
}
