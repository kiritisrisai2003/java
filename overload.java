class Casio{
public void add(int i,int j)
{
System.out.println(i+j);
}
public void add(int i,int j,int k)
{
System.out.println(i+j+k);
}
public class MethodOverloading{
public static void main(String args[])
{
Casio cas=new Casio();
cas.add(4,5);
cas.add(4,5,6);
}
}
