class TypeVar
{
    // instance variable
    int b= 20; 
    // static variable
    static int c= 30;  
    public static void main(String[]args)
    {
        // local variable
        int a= 10;
        TypeVar ref = new TypeVar();
        System.out.println("This is the value of local variable: "+a);
        System.out.println("This is the value of static variable: "+c);
        System.out.println("This is the value of instance variable: "+ref.b);
        

    }
}