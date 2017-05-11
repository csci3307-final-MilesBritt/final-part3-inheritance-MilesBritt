/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Miles
 *
 */
public class MainEntry 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImp1("Thomas Conticchio", "Java");
		Student s = new StudentImp1("Miles Britt", "java");
		
		p1 = t;
		p2 = s;
		
		System.out.println("This is the name of person 1: " + p1.getName());
		System.out.println("This is the name of person 2: " + p2.getName());

	}

}
