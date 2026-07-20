public class Main {

    public static void main(String[] args) {

        // Loops
        System.out.println("Numbers from 1 to 5");

        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Arrays
        int[] marks = {75, 82, 90, 88, 95};

        System.out.println("\nStudent Marks");

        for(int mark : marks) {
            System.out.println(mark);
        }

        // Conditions

        int average = 86;

        if(average >= 90) {
            System.out.println("\nGrade : A");
        }
        else if(average >= 75) {
            System.out.println("\nGrade : B");
        }
        else {
            System.out.println("\nGrade : C");
        }

        // Object Creation

        GraduateStudent student =
                new GraduateStudent(
                        101,
                        "Shiva Kalpana",
                        92,
                        "Computer Science"
                );

        System.out.println("\nStudent Details");

        student.displayDetails();
    }
}