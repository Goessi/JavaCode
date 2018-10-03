import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stu implements Serializable {
	private String name;
	private int age;
	private int grade;
	
	public Stu(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String toSring() {
		return name+" "+age+" "+grade;
	}
	
}
public class Student {

	public static void main(String[] args) {
		try {
			Stu s1 = new Stu("John",18,5);
			System.out.println(s1);
			ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("obj.dat"));
			out.writeObject(s1);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
