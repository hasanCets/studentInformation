package Classes.OgrenciBS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }


    void addBulkExamNote(int mat, int fiz, int biyo, int teachNote1, int teachNote2, int teachNote3){
        if (mat >= 0 && mat <= 100){
            this.c1.note = mat;
        }
        if (fiz >= 0 && fiz <= 100){
            this.c2.note = fiz;
        }
        if (biyo >=0 && biyo <= 100){
            this.c3.note = biyo;
        }
        if (teachNote1 >=0 && teachNote1 <= 100){
            this.c1.teacherNote = teachNote1;
        }
        if (teachNote2 >=0 && teachNote2 <= 100){
            this.c2.teacherNote = teachNote2;
        }
        if (teachNote1 >=0 && teachNote1 <= 100){
            this.c3.teacherNote = teachNote3;
        }

    }

    void isPass(){
        System.out.println("=========================");
        this.avarage = (((this.c1.note + this.c2.note + this.c3.note) * 0.8) + ((this.c1.teacherNote + this.c2.teacherNote + this.c3.teacherNote) * 0.2)) / 3;

        if (this.avarage > 55){
            System.out.println("Sınıfı geçtiniz.");
            this.isPass = true;
        }else {
            System.out.println("Sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote(){
        System.out.println("Adı:" + this.name + " Öğrenci No :" + this.stuNo );
        System.out.println(c1.name + " Notu:" + this.c1.note);
        System.out.println(c2.name + " Notu:" + this.c2.note);
        System.out.println(c3.name + " Notu:" + this.c3.note);
        System.out.println(c1.name + " Sözlü Notu:" + this.c1.teacherNote);
        System.out.println(c2.name + " Sözlü Notu:" + this.c2.teacherNote);
        System.out.println(c3.name + " Sözlü Notu:" + this.c3.teacherNote);

        System.out.println("Ortalamanız :" + this.avarage);

    }

}
