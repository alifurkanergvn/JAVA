public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name= "Ali";
        Student student2 = new Student();
        student2.name="Furkan";
        Instructor instructor= new Instructor();
        instructor.name="Engin";

        UserManager userManager = new UserManager();
//        userManager.count(student1);
//        userManager.count(student2);
//        userManager.count(instructor);
        userManager.countInstructor(instructor);
        userManager.request(new Student());

        User[] users = {student1,student2,instructor};
        userManager.countToAllClass(users);



    }
}
