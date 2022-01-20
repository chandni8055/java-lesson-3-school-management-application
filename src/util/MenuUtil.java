package util;

import studentManagementApp.Configuration;
import studentManagementApp.Student;

public class MenuUtil {
    public static void printAllStudent(){
        if(Configuration.students==null){
            System.out.println("you don't have any students ");
            return;
        }
        System.out.println("student that you have registered:");

        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            System.out.println((1+i) + "Student\n" + st.getinfo());
        }
    }

    public static void registerStudent(){
        int count = InputUtil.enterInteger("How many student will you registered?");
        Configuration.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "Registration");
            Student st = InputUtil.fill();
            Configuration.students[i] = st;

        }
    }

    public static void findStudent(){
        String find = InputUtil.enterString("Enter name and surname that you want to find:");
        for (int i = 0; i < Configuration.students.length; i++) {
            Student st = Configuration.students[i];
            if(st.getName().equalsIgnoreCase(find) || st.getSurname().equalsIgnoreCase(find)){
                System.out.println(st.getinfo());
            }

        }
    }

    public static void updateStudent(){
        int student_place = InputUtil.enterInteger("In which student you want to do update?");
        System.out.println("enter new information:");
        Student st = InputUtil.fill();
        Configuration.students[student_place-1] = st;
        System.out.println(st.getinfo());

    }
}
