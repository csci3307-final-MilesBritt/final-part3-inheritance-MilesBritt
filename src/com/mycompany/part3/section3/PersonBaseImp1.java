/**
 * 
 */
package com.mycompany.part3.section3;

/**
 * @author Miles
 *
 */
public abstract class PersonBaseImp1 implements Person 
{
	
	protected String name;
	PersonBaseImp1(String _name)
	{
		name = _name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.part3.section3.Person#getName()
	 */
	@Override
	public String getName() 
	{
		return name;
	}
}
