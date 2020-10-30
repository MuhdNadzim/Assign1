package mypersonal;

public class main1 {
    
    public static void main(String[] args){
        Mypersonal p = new Mypersonal();
        cgpa1 q = new cgpa1();
        exam1 e = new exam1();
        WorkExperience f = new WorkExperience();
        PersonalSkills s = new PersonalSkills();
        language g = new language();
        p.printName1();
        q.printCGPA();
        e.printExam();
        q.printGPA();
        System.out.println("Final CGPA: "+q.calculateCGPA());
        f.printWork();
        s.printSkill();
        g.printlanguage();
 
        
    }
}

