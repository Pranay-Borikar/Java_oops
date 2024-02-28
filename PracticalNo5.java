/* 

Create a class Emerging_Technologie forHierarchical inheritance, from a single parent
class (Emerging_Technologie),inheriting multiple child classes such as class AIML, class
AIDS, and class CSE.

Aim:- Practical No.5
Author:- Pranay Borikar
Version:- 5.0
Date:- 27 feb 2024 

*/
class Emerging_Technologie 
{
    private String prname;
    private String vprname;

    public Emerging_Technologie(String pr, String vpr ) 
    {
        this.prname = pr;
        this.vprname = vpr;
    }

    public void displayInfo() 
    {
        System.out.println("Emerging Techonologies: ");
        System.out.println("President: " + prname);
        System.out.println("Vice President: " + vprname);
    }
}


class AIML extends Emerging_Technologie 
{
    private String cr;

    public AIML(String name,String vname ,String crname) 
    {
        super(name,vname);
        this.cr = crname;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Class Representative: " + cr );
    }
}


class AIDS extends Emerging_Technologie 
{
    private String crn;

    public AIDS(String name,String vname ,String crname) 
    {
        super(name,vname);
        this.crn = crname;
    }

    @Override
    public void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Class Representation: " + crn);
    }
}

public class PracticalNo5 
{
    public static void main(String[] args) 
    {
        AIML aimlTech = new AIML("AIDS---->Pranay Borikar","Divyanshi Bokade","Sharayu");
        AIDS aidsTech = new AIDS("AIML---->Om Jadhav","Ayush Taywde","Harshita");
        
        Emerging_Technologie EM = new Emerging_Technologie("Pranay Borikar","Sarthak Bawankule");
        EM.displayInfo();
        System.out.println();
        aimlTech.displayInfo();
        System.out.println();
        aidsTech.displayInfo();
    }
}