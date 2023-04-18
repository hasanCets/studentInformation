package Classes.OgrenciBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int teacherNote;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int teacherNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Öğretmen ve Ders Bölümleri uyuşmuyor.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }
}
