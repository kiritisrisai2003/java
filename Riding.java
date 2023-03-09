class Kiriti
{
public void show(){
System.out.println("not overridden");
}
}
class Sujith extends Kiriti{
public void show(){
System.out.println("overridden");
}
}
class Main{
public static void main(String[] args)
{
Sujith s=new Sujith();
s.show();
}
}
