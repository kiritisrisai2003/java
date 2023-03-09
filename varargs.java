import java.io.*;
class Vargas
{
public int add(int... n)
{
int sum=0;
for(int i:n)
{
sum=sum+i;
}
return sum;
}
}
public class Demo{
public static void main(String[] args)
{
Vargas v=new Vargas();
System.out.println(v.add(2,3,4,45));
}
}
