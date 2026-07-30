
public class ResumeTemplateImp implements ResumeTemplate{

    String name;
    String collegename;
    String department;
    String company;
    String role;
    int yearOfExperience;

    public ResumeTemplateImp(String name, String collegename, String department, String company, String role,
            int yearOfExperience) {
        this.name = name;
        this.collegename = collegename;
        this.department = department;
        this.company = company;
        this.role = role;
        this.yearOfExperience = yearOfExperience;
    }


    public void printResume(ResumeTemplateImp object) {
            System.out.println(object.name+" "+object.collegename+" "+object.department+" "+object.company+" "+object.role+" "+object.yearOfExperience);
        
        
    }

    @Override
    public ResumeTemplateImp clone() {
        return new ResumeTemplateImp(name,collegename, department,  company, role,
             yearOfExperience);
       
    }
    
}