package chapter3;

/*Amanda Kaufman
Chapter 3
Programming Challenge 1
Employee Class
This class contains basic attributes of an employee, and has mutator and accessor methods to modify and get values stored in each attribute.
*/

public class Employee {
	
	//Attribute declarations
	private String name;		//Employee's name
	private int idNumber;		//Employee ID Number
	private String department;	//Department where the employee works
	private String position;	//Employee's job title
	
	//***************************************************************************************
	//setName method accepts an argument and stores it in the name attribute.        		*
	//***************************************************************************************
	
	public void setName(String nm)
	{
		name = nm;
	}
	
	//***************************************************************************************
	//setIdNumber method accepts an argument and stores it in the idNumber attribute.  		*
	//***************************************************************************************
	
	public void setIdNumber(int number)
	{
		idNumber = number;
	}
	
	//***************************************************************************************
	//setDepartment method accepts an argument and stores it in the department attribute.	*
	//***************************************************************************************
	
	public void setDepartment(String dept)
	{
		department = dept;
	}

	//***************************************************************************************
	//setPosition method accepts an argument and stores it in the position attribute.		*
	//***************************************************************************************
	
	public void setPosition(String pos)
	{
		position = pos;
	}
	
	//***************************************************************************************
	//getName method retrieves the value stored in the name attribute.						*
	//***************************************************************************************
	
	public String getName()
	{
		return name;
	}
	
	//***************************************************************************************
	//getIdNumber method retrieves the value stored in the idNumber attribute.				*
	//***************************************************************************************

	public int getIdNumber()
	{
		return idNumber;
	}
	
	//***************************************************************************************
	//getDepartment method retrieves the value stored in the department attribute.			*
	//***************************************************************************************
	
	public String getDepartment()
	{
		return department;
	}
	
	//***************************************************************************************
	//getPosition method retrieves the value stored in the position attribute.				*
	//***************************************************************************************
	
	public String getPosition()
	{
		return position;
	}
}
