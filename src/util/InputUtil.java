package util;

import studentManagementApp.Student;

import java.util.Scanner;

public class InputUtil {
    public static int enterInteger(String title){
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        return operation;
    }

    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    public static Student fill(){
        String name = InputUtil.enterString("Enter student name:");
        String surname = InputUtil.enterString("Enter surname:");
        int age = InputUtil.enterInteger("Enter student age:");
        String className = InputUtil.enterString("Enter student classname:");
        Student student = new Student(name,surname,age,className);
        return student;
    }

}
