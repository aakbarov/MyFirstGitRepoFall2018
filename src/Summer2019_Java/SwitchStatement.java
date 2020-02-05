package Summer2019_Java;

public class SwitchStatement {

    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){
            case 'B':
                System.out.println("Passed with B");

            case 'C':
                System.out.println("Passed with C");

            default:
                System.out.println("Failed");
        }
    }
}
