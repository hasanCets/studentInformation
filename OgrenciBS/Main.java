package Classes.OgrenciBS;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH","555");
        Teacher t2 = new Teacher("Graham Bell", "FZK","0000");
        Teacher t3 = new Teacher("Külyutmaz"  , "BIO","1111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Hasan","206","4",tarih,fizik,biyo);
        s1.addBulkExamNote(80,80,80,50,50,50);
        s1.isPass();

        Student s2 = new Student("Ahmet","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(80,80,80,50,50,50);
        s2.isPass();

    }
}
