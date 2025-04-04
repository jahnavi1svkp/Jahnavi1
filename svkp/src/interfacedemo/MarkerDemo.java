package interfacedemo;

public class MarkerDemo {
public static void main(String[] args) {
		
		Registrable s=new Student(0, null, 0, null);
		Registrable s1=new Student(0, null, 0, null);
		Object obj=new Object();//the class Object is a built-in class in java that is part of java.lang.package
			if (s1 instanceof Registrable)
				System.out.println("Student is registered for course");
			else
				System.out.println("Student is not registered for course");
	}

}
