/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Miles
 *
 */
public class TeacherImp1 extends PersonBaseImp1 implements Teacher 
{
	protected String thoughtCourseTitle;
	TeacherImp1(String _name, String _thoughtCourseTitle) 
	{
		super(_name);
		thoughtCourseTitle = _thoughtCourseTitle;
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
	 * @see com.mycompany.part3.section3.Teacher#teachesFor()
	 */
	@Override
	public String teachesFor() 
	{
		return thoughtCourseTitle;
	}
	
	@Override
	public String getName()
	{
		return name;
	}

}
