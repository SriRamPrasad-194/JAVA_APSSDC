class Teacher {
   String designation = "Teacher";
   String collegeName = "JAVATEXTbook";
   void does(){
	System.out.println("Teaching");
   }
}

class PhysicsTeacher extends Teacher{
   String mainSubject = "Physics";
   public static void main(String args[]){
	PhysicsTeacher obj = new PhysicsTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}