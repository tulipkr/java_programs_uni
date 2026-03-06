public class MethodOverloadArea {
    void calcArea(int side){
        System.out.println("Area of square = "+ (side*side));
    }
    void calcArea(int length, int width){
        System.out.println("Area of rectangle = "+ (length*width));
    }
    void calcArea(double radius){
        System.out.println("Area of circle = "+(3.14*radius*radius));
    }
    public static void main(String[] args) {
        MethodOverloadArea obj1= new MethodOverloadArea();
        MethodOverloadArea obj2= new MethodOverloadArea();
        MethodOverloadArea obj3= new MethodOverloadArea();
        obj1.calcArea(15);
        obj2.calcArea(13,29);
        obj3.calcArea(17.5);
    }
}
