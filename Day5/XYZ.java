class ABC{
   public void myMethod(){
	System.out.println("Overridden Method");
   }
}
class XYZ extends ABC{

   public void myMethod(){
	System.out.println("Overriding Method");
   }
   public static void main(String args[]){
	ABC obj = new XYZ();
	obj.myMethod();
 	ABC obj1 = new ABC();
    obj.myMethod();
// This would call the myMethod() of parent class ABC

XYZ obj2 = new XYZ();
obj.myMethod();
// This would call the myMethod() of child class XYZ

ABC obj3 = new XYZ();
obj.myMethod();
// This would call the myMethod() of child class XYZ
   }
}