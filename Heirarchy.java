class A
{
    int a=10;
    int b=20;
    int c=30;
}
class B extends A{
    int d=40;
    void main1(){
        System.out.println(a+b);
    }
}
class C extends D{
    int e=50;
    void disp()
    {
        System.out.println(b+e);
    }
}
class D extends A{
    int f=60;
    void demo(){
        System.out.println(f+c);
    }
}
public class main{
    public static void main(String args[]){
        new B().main1();
        new C().disp();
        new D().demo();
    }
}