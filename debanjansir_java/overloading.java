class A
{
int sum(int a, int b)
{
return(a+b);
}
double sum(double a, double b)
{
return(a+b);
}
public static void main(String args[])
{
A ob=new A();
System.out.println(ob.sum(2,3));
System.out.println(ob.sum(2.5,3.5));
}
}