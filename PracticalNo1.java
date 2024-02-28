/* 	Aim:- Practical No.1
	Author:Pranay Borikar 
	Version:- 1.0
	Date:- 30 jan 2024
*/

class PracticalNo1
{

	public static void main(String []argv)
	{
		CompanyData pranay =new CompanyData("Pranay Borikar",18,"Male",21);
		pranay.Display();
	}
}

class CompanyData
{

	String Name;
	int Age;
	String Gender;
	int Empid;

	CompanyData()
	{

		System.out.println("Inside Default Constructor");
	}
	CompanyData(String nm,int ag,String gen,int id)
	{
		System.out.println("Inside Parameterized Constructor");

		this.Name=nm;
		this.Age=ag;
		this.Gender=gen;
		this.Empid=id;
	}

	void Display()
	{

	System.out.println("Name--_" + this.Name);
	System.out.println("Age--" + this.Age);
	System.out.println("Gender--" + this.Gender);
	System.out.println("Empid--" + this.Empid);

	}
}