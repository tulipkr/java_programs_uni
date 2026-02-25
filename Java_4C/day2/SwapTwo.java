public class SwapTwo {
    int a,b;
    SwapTwo(int x, int y){
        a=x;
        b=y;
    }
    void swap(){
        System.out.println("Before Swapping");
        System.out.println("a= " +a + " and b= "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping");
        System.out.println("a= " +a + " and b= "+b);
    }
    public static void main(String[] args) {
        SwapTwo obj1= new SwapTwo(13, 25);
        obj1.swap();
        SwapTwo obj2= new SwapTwo(29,12);
        obj2.swap();
    }
}
