abstract class User{
    
    String name,designation,college_id,email;
    User(String name, String college_id, String email)
    {
        this.name=name;
        this.designation=designation;
        this.college_id=college_id;
        this.email=email;
    }
	public void selectDesignation()
	{
	    this.designation=designation;
	}
    	
}

class Teacher extends User{
    String subject,_class;
    public void selectSubject(String subject,String _class)
    {
        this.subject=subject;
    }
    public void selectClass()
    {
        this._class=_class;
    }
    
}

class SubjectCoordinator extends User{
    String subject;
     public void selectSubject()
    {
        this.subject=subject;
    }
    
}

class HoD extends User{
    
}


public class TargetAttainment{

     public ArrayList<Double> target_attainment;


    public void displayTargetAttainment(){
        //display level1, level2, level3 target attainment
    }
    public void updateTargetAttainment(){
        //input level1, level2, level3 target attainment
        //store new attainment in database
    }
}




public class COPO{
    String co,po;
    public ArrayList<Integer> mapping;
    
    public void DisplayCOPO(){
        //fetch mapping from database
        //print mapping
    }
    
    public void DisplayCO(){
        //fetch subject
        //fetch CO for subject from database
        //print Course Outcomes
    }
    
    public void DisplayPO(){
        //fetch PO from database
        //print Program Outcomes
    }
    
    public void UpdateCO(){
        //input CO from user
        //store the Course Outcome for the subject
    }
    
    public void UpdateMapping(){
        //input mapping from user
        //store mapping in database
    }
 
}



public class Test{
    private String test_id;
    private int no_of_que,no_of_subque;
    private ArrayList<Integer> co_per_que,maxmarks_per_que;
    
    public void DisplayTest(){
        //display test details
    }
    
    public void UpdateTest(){
        //input test details from user
        //store updated details in database
    }
    
    public Test getTestDetails(){
        //fetch details of test from database
        //return object
    }
}



public class Marks{
    private ArrayList<Integer>marks;
    
    public void DisplayMarks(){
        //fetch marks from database
        //print marks for particular subject,class and test
    }
    public void EnterMarks(){
        //store user input in database
    }
    public void ImportMarks(){
        //store user input in database
    }
    public void UpdateMarks(){
        //store user input in database
    }
}


public class Report{
    
    public void GenerateDeptReport(){
        //call to GenerateClassReport()
        //call to GenerateSubjectReport()
    }
    
    public void GenerateClassReport(){
        //fetch marks of all classes according to subject
        //Calculate attainament for each subject and class
    }
    public void GenerateTeacherReport(){
        //fetch marks of students for a particular teacher
        //Calculate attainment
    }
    public void GenerateSubjectReport(){
        //fetch marks of students for a particular subject
        //Calculate attainment
    }
    public void GenerateStudentReport(){
        //fetch subject wise marks of a particular student
        //Calculate attainment
    }
}
