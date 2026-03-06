public class ConOverload {
    int length;
    int width;
    ConOverload(){
        length=25;
        width=10;
    }
    ConOverload(int ln){
        length=ln;
        width=20;
    }
    ConOverload(int ln,int wd){
        length=ln;
        width=wd;
    }
    void disp_area(){
        System.out.println("Area of rectangle = "+ (length*width));
    }
    public static void main(String[] args) {
        ConOverload obj1= new ConOverload();
        ConOverload obj2= new ConOverload(20);
        ConOverload obj3= new ConOverload(17,29);
        obj1.disp_area();
        obj2.disp_area();
        obj3.disp_area();
    }
}
