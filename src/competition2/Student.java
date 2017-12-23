package competition2;

import java.util.Scanner;
/**
 * @author Shaokang Jiang
 */
public class Student {
	
	private String ID,first,last;
	private double Math, Science, History, Physics;
	public static final double DEFAULT_GRADE = 0;
	public static final String DEFAULT_ID = "A00000000";
	public static final String DEFAULT_NAME = "A";
    /**
     * 
     * 
     * @return the ID number of this student
     */
	public String getID() {
	    return ID ;
	}
    /**
     * 
     * 
     * @return first name of this student
     */
	public String getfirst() {
	    return first ;
	}
    /**
     * 
     * 
     * @return last name of this student
     */
	public String getlast() {
	    return last ;
	}
    /**
     * 
     * 
     * @return Math grade of this student
     */
	public double getMath() {
	    return Math ;
	}
    /**
     * 
     * 
     * @return Science grade of this student
     */
	public double getScience() {
	    return Science ;
	}
    /**
     * 
     * 
     * @return History grade of this student
     */
	public double getHistory() {
	    return History ;
	}
    /**
     * 
     * 
     * @return Physics grade of this student
     */
	public double getPhysics() {
	    return Physics ;
	}
    /**
     * 
     * 
     * @param setID
     *            set student's ID
     */
	public void setID(String setID) {
	    ID = setID ;
	}
    /**
     * 
     * 
     * @param setfirst
     *            set student's first name
     */
	public void setfirst(String setfirst) {
	    first = setfirst;
	}
    /**
     * 
     * 
     * @param setlast
     *            set student's last name
     */
	public void setlast(String setlast) {
	    last = setlast ;
	}
    /**
     * 
     * 
     * @param setMath
     *            set student's Math grade
     */
	public void setMath(double setMath) {
		Math = setMath ;
	}
    /**
     * 
     * 
     * @param setScience
     *            set student's Math grade
     */
	public void setScience(double setScience) {
		Science = setScience;
	}
    /**
     * 
     * 
     * @param setHistory
     *            set student's History grade
     */
	public void setHistory(double setHistory) {
		History = setHistory ;
	}
    /**
     * 
     * 
     * @param setPhysics
     *            set student's Physics grade
     */
	public void setPhysics(double setPhysics) {
		Physics = setPhysics;
	}

    /**
     * This is the model 1 of calculate grade use weighted average. 
     * About this average:<br>
     *   Math--30%
     *   Physics--30%
     *   Science--30%
     *   History--10%<br>
     * If the result seems impossible, please make sure you have set grade for this student.  
     * @return the weighted average about this student
     * 
     */
	public double Weight1() {
		double ave =  0.3*Math + 0.3*Physics + 0.1*History + 0.3*Science;
		return ave;
		
	}
	 /**
     * This is the model 2 of calculate grade use weighted average. 
     * About this average:<br>
     *   Math--20%
     *   Physics--20%
     *   Science--20%
     *   History--40%<br>
     * If the result seems impossible, please make sure you have set grade for this student.  
     * @return the weighted average about this student
     * 
     */
	public double Weight2() {
		double ave = 0.2*Math + 0.2*Physics + 0.4*History + 0.2*Science;
		return ave;
		
	}
	 /**
     * This is a way to get the average grade. <br>
     * If the result seems impossible, please make sure you have set grade for this student.  
     * @return the average about this student
     * 
     */
	public double Average() {
		double ave = ( Math + Physics + History + Science )/(4.0);
		return ave;
		
	}
    /**
     * 
     * If you use this method, Student grade will be set to default value.<br>
     * All grade will be set to 0<br>
     * Please change them later use set function.
     * 
     * @param id
     *            set student's ID
     * @param first1
     *            set student's first name
     * @param last1
     *            set student's last name
     */
	public Student(String id,String first1,String last1) {
		ID = id;
		first = first1;
		last = last1;
		Math = DEFAULT_GRADE;
		Science = DEFAULT_GRADE;
		History = DEFAULT_GRADE;
		Physics = DEFAULT_GRADE;
	}
	/**
     * If you use this method, Student personal information will be set to default value.<br>
     * About the default value:<br>
     * &nbsp;&nbsp;ID=A00000000<br>
     * &nbsp;&nbsp;Name(first and last)=A<br>
     * Please change them later use set function.
     * 
     * @param math
     *            set student's math grade
     * @param science
     *            set student's science grade
     * @param history
     *            set student's history grade
     * @param physics
     *            set student's physics grade
     */
	public Student(double math,double science,double history,double physics) {
		Math = math;
		Science = science;
		History = history;
		Physics = physics;
		ID = DEFAULT_ID;
		first = DEFAULT_NAME;
		last = DEFAULT_NAME;
	}
	/**
     * 
     * 
     * @param id
     *            set student's ID
     * @param first1
     *            set student's first name
     * @param last1
     *            set student's last name
     * @param math
     *            set student's math grade
     * @param science
     *            set student's science grade
     * @param history
     *            set student's history grade
     * @param physics
     *            set student's physics grade
     */
	public Student(String id,String first1,String last1,double math,double science,double history,double physics) {
		Math = math;
		Science = science;
		History = history;
		Physics = physics;
		ID = id;
		first = first1;
		last = last1;
	}
	/**
     * If you use this method, All thing will be set to default value.<br>
     * About the default value:<br>
     * &nbsp;&nbsp;grade=0<br>
     * &nbsp;&nbsp;ID=A00000000<br>
     * &nbsp;&nbsp;Name(first and last)=A<br>
     * Please change them later use set function.
     */
	public Student() {
		Math = DEFAULT_GRADE;
		Science = DEFAULT_GRADE;
		History = DEFAULT_GRADE;
		Physics = DEFAULT_GRADE;
		ID = DEFAULT_ID;
		first = DEFAULT_NAME;
		last = DEFAULT_NAME;
	}
	/**
     * If you use this method, All thing will be asked by system.<br>
     * You will have instruction.
     */
	public Student(String id) {
		ID = id;
		Scanner ss = new Scanner(System.in);
		System.out.println("Please input the first name: ");
		first = ss.next();
		System.out.println("Please input the last name: ");
		last = ss.next();
		ss.nextLine();
		System.out.println("Please input the math grade for " + ID + ":");
		while(ss.hasNextDouble()==false) {
			    ss.nextLine();
				System.out.println("Please re-input the math grade(make sure your input is grade): ");
			}
		Math = ss.nextDouble();
		ss.nextLine();
		System.out.println("Please input the science grade for " + ID + ":");
		while(ss.hasNextDouble()==false) {
		    ss.nextLine();
			System.out.println("Please re-input the science grade(make sure your input is grade): ");
		}
		Science = ss.nextDouble();
		ss.nextLine();
		System.out.println("Please input the history grade for " + ID + ":");
		while(ss.hasNextDouble()==false) {
		    ss.nextLine();
			System.out.println("Please re-input the history grade(make sure your input is grade): ");
		}
		History = ss.nextDouble();
		ss.nextLine();
		System.out.println("Please input the physics grade for " + ID + ":");
		while(ss.hasNextDouble()==false) {
		    ss.nextLine();
			System.out.println("Please re-input the physics grade(make sure your input is grade): ");
		}
		Physics = ss.nextDouble();
		ss.nextLine();
		

	}

}
