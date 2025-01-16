class Comp{
    static int a = 10;
    int c = 10;
    void fun(){
        int b = 10;
        System.out.println(a+" "+b+" "+c);
        a++; b++; c++;
    }
    public static void main(String[]args){
        Comp r1 = new Comp();
        Comp r2 = new Comp();
    
    
        r1.fun();     
        r1.fun();
        r2.fun();

    }
}