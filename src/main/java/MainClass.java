public class MainClass {
    public static void main(String[] args) {
        Student luis = new Student(44, "Denmark", 92.4f);
       luis.rno = 3;
        luis.name = "luis";
        luis.marks = 33.2f;

        luis.changeName("Julieta");
        /*System.out.println(luis.rno);
        System.out.println(luis.name);
        System.out.println(luis.marks);
        */
        Student random = new Student(luis);
        System.out.println(random.marks);

    }


}
     class Student{
        int rno;
        String name;
        float marks = 90.9f;
        Student(){
            this.rno = 4;
            this.name = "Luis";
            this.marks = 3.9f;
        }

        void changeName(String name){
            this.name = name;
        }

        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
        Student(int rno, String name, float marks){
             this.rno = rno;
             this.name = name;
             this.marks = marks;
        }
    }