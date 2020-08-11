public class Application {

    public static void main(String[] args) {

        System.out.println("Solving the fibonacci test result");

    }

    public int fibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 2) + fibonacci(number - 1);
    }

}
