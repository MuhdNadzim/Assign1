package mypersonal;

public class cgpa1 {
    double cgpa1=3.74;
    double gpa[]={3.4,3.5,3.6,3.2};
    double sum=0;
    double finalcgpa=0;

    public void printCGPA(){
        System.out.println("CGPA: "+cgpa1);
    }
public void printGPA(){
    System.out.println("Sem 1: "+gpa[0]);
    System.out.println("Sem 2: "+gpa[1]);
    System.out.println("Sem 3: "+gpa[2]);
    System.out.println("Sem 4: "+gpa[3]);
    }
    public double calculateCGPA(){
        for (int i=0; i<gpa.length; i++){
            sum+=gpa[i];
    }
     if (gpa.length != 0) { //!=not equal
      cgpa1 = sum / gpa.length;
    } else {
      cgpa1 = 0.0;
    }
        finalcgpa = sum/gpa.length;
        return finalcgpa;
        
}
}
