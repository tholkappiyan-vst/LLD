

public class User {

    public static void main(String[] args){

    

    ResumeTemplateImp initialResume=new ResumeTemplateImp("tholkappiyan","St.Joseph's Institute of Technology",
        "Information Technolgy","Google", "SDE",2);
    
        Template template=new Template(initialResume);
       
    ResumeTemplateImp resume1=template.getAnotherObj();
    resume1.printResume(resume1);

    ResumeTemplateImp resume2=template.getAnotherObj();
    resume1.printResume(resume2);
    }

    
    
}

/*output will be like 
tholkappiyan St.Joseph's Institute of Technology Information Technolgy Google SDE 2
tholkappiyan St.Joseph's Institute of Technology Information Technolgy Google SDE 2
 */