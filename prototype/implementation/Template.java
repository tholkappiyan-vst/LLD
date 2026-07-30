

public class Template{

    ResumeTemplateImp resumeTemplateImp;

    public Template(ResumeTemplateImp resumeTemplateImp) {
        this.resumeTemplateImp = resumeTemplateImp;
    }

    public ResumeTemplateImp getAnotherObj(){
        return resumeTemplateImp.clone();
    }

    


    
}