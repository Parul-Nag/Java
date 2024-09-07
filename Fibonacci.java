class Fibonacci{
    public static void main(String[] args) {
        int a=-1;
        int b=1;
        int c;
        System.out.println("Fibonacci Series upto 10 terms:");
        for(int i=0;i<=10;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}