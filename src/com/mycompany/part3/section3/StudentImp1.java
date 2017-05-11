/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Miles
 *
 */
public class StudentImp1 extends PersonBaseImp1 implements Student 
{
	protected String takenCourseTitle;
	StudentImp1(String _name, String _takenCourseTitle) 
	{
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}

	
	/* (non-Javadoc)
	 * @see com.mycompany.part3.section3.Person#getDetails()
	 */
	@Override
	public String getDetails() 
	{
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.part3.section3.Student#studiesFor()
	 */
	@Override
	public String studiesFor() 
	{
		return takenCourseTitle;
	}
	
	@Override
	public String getName() 
	{ 
		return name;
	}

}
