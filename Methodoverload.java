class Addition{
static int add(int x,int y){
return x+y;
}
static int add(int x,int y,int z)
{
return x+y+z;
}
}
class Mainaddition{
public static void main(String[] args){
System.out.println(Addition.add(2,4));  //as the method is static without creating an object we can access the method by using the class name.
System.out.println(Addition.add(2,3,4));
}
}

//we can overload a main class.but jvm calls main method which receives string array as an argurements.
//public static void main(String[] args)//here the statements in this main method is only called.
//public static void main()
//public staic void main(String args)