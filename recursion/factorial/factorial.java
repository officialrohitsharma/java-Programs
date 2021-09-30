class Factorial{

    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        long fact = factorial(12);
       System.out.println(fact);
    }
}