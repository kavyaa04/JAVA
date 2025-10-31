import java.util.Scanner;

class Student {
    String name;
    int[] marks;
    int total;
    double avg;

    void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.next();
        marks = new int[3];
        total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        avg = total / 3.0;
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("All the marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[3];
        int count = 0;
        int choice;

        while (true) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count < s.length) {
                        s[count] = new Student();
                        s[count].inputDetails(sc);
                        count++;
                    } else {
                        System.out.println("Cannot add more students!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students added yet!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            s[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program ending. Bye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
