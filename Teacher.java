package class18;

public class Teacher {
    /* Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher .
    Test all 4 classes
     */

    String name;
    int yearOfExperience;

    void allTeachers(){
        System.out.println("My teachers are: "+name);
    }
    void firstTeacher(){
        System.out.println(name+" is a very good teacher with "+yearOfExperience+" years of teaching experience");
    }
    void printTeacher(){
        System.out.println("My favorite teacher is "+name+" with "+yearOfExperience+" years of teaching experience");

    }
    void secondTeacher(){
        System.out.println(name+ " is a good teacher with "+yearOfExperience+" years of teaching experience");
    }

}
class MathTeacher extends Teacher{

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}

class TeacherTester {
    public static void main(String[] args) {

        Teacher teacher=new Teacher();
        teacher.name="Teacher Kelly, Teacher Ryan, Teacher Carla";
        teacher.allTeachers();

        MathTeacher math = new MathTeacher();
        math.name="Teacher Kelly";
        math.yearOfExperience=5;
        math.firstTeacher();

        ChemistryTeacher chem=new ChemistryTeacher();
        chem.name="Teacher Ryan";
        chem.yearOfExperience=8;
        chem.printTeacher();

        PianoTeacher piano=new PianoTeacher();
        piano.name="Teacher Carla";
        piano.yearOfExperience=10;
        piano.secondTeacher();

    }
}
