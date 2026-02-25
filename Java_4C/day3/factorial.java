public class factorial {
    int n;
    factorial(int num){
        n=num;
    }
    int find_fact(){
        int fact=1;
        for (int i=2; i<=n; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        factorial obj=new factorial(10);
        int fct= obj.find_fact();
        System.out.println("The factorial value is: "+fct);
    }
}
