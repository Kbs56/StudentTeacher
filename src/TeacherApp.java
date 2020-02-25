import java.util.Scanner;
import java.util.ArrayList;
public class TeacherApp {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        char menuChar = ' ';
        String clrScnr;

        ArrayList<Student> list = new ArrayList<>();

        System.out.println("Welcome to the Teacher Application");

        while (menuChar != 'q') {
            System.out.println("MENU");
            System.out.println("a - add a student");
            System.out.println("d - display roster");
            System.out.println("g - display names and letter grades");
            System.out.println("i - display all information for students");
            System.out.println("r - remove a student");
            System.out.println("u - update student information");
            System.out.println("q - Quit");
            System.out.println(" ");

            while (menuChar != 'a' && menuChar != 'd' && menuChar != 'g' && menuChar != 'i' && menuChar != 'r' && menuChar != 'u' && menuChar != 'q') {
                System.out.println("Please enter a character form the menu");
                menuChar = scnr.next().charAt(0);
            }

            switch (menuChar) {
                case 'a':
                    scnr.nextLine();
                    list.add(addStudent(scnr));
                    menuChar = ' ';
                    break;
                case 'd':
                    System.out.println(" ");
                    System.out.println("STUDENT ROSTER");
                    System.out.println(" ");
                    int dCount = 0;
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).getName());
                        dCount++;
                    }
                    if (dCount == 0) {
                        System.out.println("No students in roster");
                    }
                    System.out.println(" ");
                    menuChar = ' ';
                    break;
                case 'g':
                    System.out.println(" ");
                    System.out.println("ROSTER W/ GRADES");
                    System.out.println(" ");
                    int gCount = 0;
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).getName() + " - " + list.get(i).getLetterGrade());
                        gCount++;
                    }
                    System.out.println(" ");
                    if (gCount == 0) {
                        System.out.println("No students in roster");
                    }
                    menuChar = ' ';
                    break;
                case 'i':
                    System.out.println(" ");
                    System.out.println("ROSTER W/ ALL INFO");
                    System.out.println(" ");
                    int iCount = 0;
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).getName() + " - " + list.get(i).getStuID() + " - " + list.get(i).getClassName() + " - " + list.get(i).getAverage() + " - " + list.get(i).getLetterGrade());
                        System.out.println(" ");
                        iCount++;
                    }
                    if (iCount == 0) {
                        System.out.println("No students in roster");
                    }
                    menuChar = ' ';
                    break;
                case 'r':
                    clrScnr = scnr.nextLine();
                    System.out.println(" ");
                    System.out.println("REMOVE STUDENT");
                    System.out.println(" ");
                    System.out.println("Please enter the name of the student you would like to remove.");
                    String student = scnr.nextLine();
                    int rCount = 0;
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getName().equalsIgnoreCase(student)) {
                            list.remove(i);
                        }
                        rCount++;
                    }
                    if (rCount == 0) {
                        System.out.println("Student not found.");
                    }
                    menuChar = ' ';
                    System.out.println(" ");
                    break;
                case 'u':
                    char uChar = ' ';
                        System.out.println("UPDATE");
                        System.out.println(" ");
                        System.out.println("n - update student name");
                        System.out.println("c - update class name");
                        System.out.println("a - recalculate average");
                        System.out.println("e - exit update menu");
                        System.out.println(" ");

                        while (uChar != 'n' && uChar != 'c' && uChar != 'a' && uChar != 'l' && uChar != 'e') {
                            System.out.println("Please enter what field you would like to update");
                            uChar = scnr.next().charAt(0);
                        }
                        switch (uChar) {
                            case 'n': clrScnr = scnr.nextLine();
                                if (list.size() == 0) {
                                System.out.println("No students in roster, please add a student to perform update actions");
                                System.out.println(" ");
                                menuChar = 'e';
                                break;
                            }
                                System.out.println("Enter the student's name you would like to change");
                                String nName = scnr.nextLine();
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(i).getName().equalsIgnoreCase(nName)) {
                                        System.out.println("What would you like to change " + list.get(i).getName() + "'s name to?");
                                        list.get(i).setName(scnr.nextLine());
                                    } else {
                                        System.out.println("Student not found, try again");
                                    }
                                }
                                menuChar = ' ';
                                break;
                            case 'c': clrScnr = scnr.nextLine();
                                if (list.size() == 0) {
                                    System.out.println("No students in roster, please add a student to perform update actions");
                                    System.out.println(" ");
                                    menuChar = 'e';
                                    break;
                                }
                                System.out.println("Enter the name of the student whose class you would like to change");
                                String cName = scnr.nextLine();
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(i).getName().equalsIgnoreCase(cName)) {
                                        System.out.println("What would you like to change the class of " + list.get(i).getClassName() + " to?");
                                        list.get(i).setClassName(scnr.nextLine());
                                    } else {
                                        System.out.println("Student not found, try again");
                                    }
                                }
                                menuChar = ' ';
                                break;
                            case 'a': clrScnr = scnr.nextLine();
                                if (list.size() == 0) {
                                    System.out.println("No students in roster, please add a student to perform update actions");
                                    System.out.println(" ");
                                    menuChar = 'e';
                                    break;
                                }
                                System.out.println("Enter the name of the student whose average you would like to recalculate");
                                String aName = scnr.nextLine();
                                for (int i = 0; i < list.size(); i++) {
                                    if (list.get(i).getName().equalsIgnoreCase(aName)) {
                                        double average = calcAverage(scnr);
                                        list.get(i).setAverage(average);
                                    } else {
                                        System.out.println("Student not found, try again");
                                    }
                                }
                                menuChar = ' ';
                                break;
                            case 'e':
                                menuChar = ' ';
                                break;
                        }
                        break;
                    }
            }
        }

    public static Student addStudent(Scanner scnr) {

        String name, className;
        int ID;
        double average;

        System.out.println("Enter the student's name: ");
        name = scnr.nextLine();

        System.out.println("Enter the student's ID number");
        ID = scnr.nextInt();

        System.out.println("Enter the student's Class Name");
        scnr.nextLine();
        className = scnr.nextLine();

        Student student = new Student(name, ID, className);

        average = calcAverage(scnr);
        student.setAverage(average);

        return student;
    }

    public static double calcAverage(Scanner scnr) {

        double grades[] = new double[10];
        double average, total = 0;

        System.out.println("Enter 10 Grades for this student");
        for (int i = 0; i < 10; i++) {
            grades[i] = scnr.nextDouble();
            total += grades[i];
        }
        average = total/grades.length;
        return average;
    }
}
