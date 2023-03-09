import java.io.*;
class First{
public First(){
System.out.println("in normal a");
}
public First(int i){
System.out.println("in parameterized a");
}
}
class Second extends First{
public Second()
{
//super(1);//calls normal of b and parameterized of b
System.out.println("in normal b");
}
public Second(int x){
//super(1);// calls parameterized const of a and b
System.out.println("in parameterized b");
}
}
class Main{
public static void main(String[] args)
{
Second s=new Second();//calls normal constructoer of a and parameterized of b.
}
}

//here we have 4 types normal of and b.para of a and b. para b  and  norm a.and  norm a and  para b.