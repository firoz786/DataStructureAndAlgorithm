package generalDSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student{
	private int a;

	public Student(int a) {
		this.a = a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public int hashCode() {
		System.out.println("executed hashcode...");
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("executed equals...");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return a == other.a;
	}
}

public class Demo {

public static void main(String[] args) {
//	Integer a= new Integer(1);
//	Integer b= new Integer(1);
//	Map<Integer,String> hashMap = new HashMap<>();
//	hashMap.put(a,"one");
//	hashMap.put(b,"one");
//	System.out.println(hashMap.size());
	
	Student student1 = new Student(786);
	Student student2 = new Student(786);
	Map<Student,String> hashMap1 = new HashMap<>();
	hashMap1.put(student1,"student1");
	hashMap1.put(student2,"student1");
	
	System.out.println("size=="+hashMap1.size());
	
	
}
}
