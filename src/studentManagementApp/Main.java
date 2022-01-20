package studentManagementApp;

import util.InputUtil;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the school operation center");
        while(true){
            int operation = InputUtil.enterInteger("what do you want to do?" +
                    "\n1: Register Student" +
                    "\n2: Show all student" +
                    "\n3: Find student" +
                    "\n4:Update student" +
                    "\n0: Quit");
            if(operation==1){
                MenuUtil.registerStudent();
            }
            else if(operation==2){
                MenuUtil.printAllStudent();
            }
            else if (operation == 3) {
                MenuUtil.findStudent();
            }
            else if (operation == 4) {
                MenuUtil.updateStudent();
            }
            else if (operation == 0) {
                System.out.println("Quiting from operation");
            }
            else
            {
                System.out.println("Invalid operation");
            }
        }

    }
}
