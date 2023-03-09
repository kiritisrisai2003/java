import java.io.*;
class First
{
public void show()
{
System.out.println("not overridden");
}
}
class Second extends First
{
public void show(){
System.out.println(" i am overridden");
//super.show();//you have to use this when you want to call base class method also.if not you can remove this statement.
}
}
class Main{

public static void main(String args[])
{
//Second sc=new Second();
//sc.show();
First f=new First();
f.show();
}
}



//after creating the two classes we create a main class as an another class bcoz two execute both the classes.if we dont create the main only one class will 
execute.and in 
//if we create the object of the first class and called the show method it will be overrided.
