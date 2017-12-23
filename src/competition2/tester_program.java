package competition2;
/**
 * @author Shaokang Jiang
 * 
 * This file is not for competition. Please see test1 or the exe. 
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class tester_program {

	public static void main(String[] args) throws IOException {
		Student ss = new Student("A00000000", "xx", "xx", 26.2, 28.2, 32.2, 52.2);
		Student ss1 = new Student("A00000001", "xx", "xx");
		Student ss2 = new Student(26.2, 28.2, 32.2, 52.2);
		ss1.setHistory(53.2);
		ss1.setMath(63.2);
		ss1.setPhysics(63.9);
		ss2.setfirst("gg");
		ss2.setID("A00000002");
		ss2.setlast("ji");
		try {
			FileOutputStream myfile1 = new FileOutputStream("Grade Standard output.txt");
			PrintWriter myPW=new PrintWriter(myfile1);
			for(int i=0;i<58;i++) myPW.print("- ");
			myPW.println();
			myPW.println("A number\t First name\t Last name\t Math\t Science\t History\t Physics\t Average\t");
			for(int i=0;i<58;i++) myPW.print("- ");
			myPW.println();
			myPW.print(ss.getID() + "\t" + " " + ss.getfirst() + "\t" + "\t" +" " +ss.getlast() + "\t" + "\t" + " " +ss.getMath() + "\t" + " " +ss.getScience() + "\t" + "\t" +" " +ss.getHistory() + "\t" + "\t" +" " +ss.getPhysics() + "\t" + "\t" +" ");
			myPW.printf("%.2f", ss.Average());
			myPW.println("");
			myPW.print(ss1.getID() + "\t" + " " + ss1.getfirst() + "\t" + "\t" +" " +ss1.getlast() + "\t" + "\t" + " " +ss1.getMath() + "\t" + " " +ss1.getScience() + "\t" + "\t" +" " +ss1.getHistory() + "\t" + "\t" +" " +ss1.getPhysics() + "\t" + "\t" +" ");
			myPW.printf("%.2f", ss1.Average());
			myPW.println("");
			myPW.print(ss2.getID() + "\t" + " " + ss2.getfirst() + "\t" + "\t" +" " +ss2.getlast() + "\t" + "\t" + " " +ss2.getMath() + "\t" + " " +ss2.getScience() + "\t" + "\t" +" " +ss2.getHistory() + "\t" + "\t" +" " +ss2.getPhysics() + "\t" + "\t" +" ");
			myPW.printf("%.2f", ss2.Average());
			myPW.println("");
			myPW.close();
			myfile1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
