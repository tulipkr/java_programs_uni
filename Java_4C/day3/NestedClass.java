public class NestedClass {
    String nm= "Tulip";
    int rn= 4031;
    class InnerClass{
        int m1=95;
        int m2=99;
        void calc(){
            int sm=m1+m2;
            System.out.println("Name: "+ nm);
            System.out.println("Roll no: "+rn);
            System.out.println("Marks: "+sm);
        }
    }
    public static void main(String[] args) {
        NestedClass obj=new NestedClass();
        NestedClass.InnerClass mk= obj.new InnerClass();
        mk.calc();
    }
}
