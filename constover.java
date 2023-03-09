class Human{
Human(int x){
System.out.println("i have done the homework");
}
Human(int x, int y){
System.out.println(" i have not done the homewor");
}
Human()
{
System.out.println("i never do homework");
}
}
class Teacher{
public static void main(String[] args){
Human h=new Human(2);
//Human hi=new Human(2,3); //here the constructors are called based on the paremeters passed.
//Human hii=new Human();
}
}