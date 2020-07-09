public class Main {

    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.4;
        String firstName = "Barney";
        String middleName = "Thomas";
        char firstInit = firstName.charAt(0);
        char midInit = middleName.charAt(0);
        boolean hasPerf = true;
        String lastName = "Carney";
        String fullName = lastName + ", " + firstInit + ". " + midInit + ".";
        System.out.println("The student's age is " + studentAge + " and their Full Name is " + fullName);
    }
}
