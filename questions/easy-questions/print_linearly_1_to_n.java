public class print_linearly_1_to_n {
    static int counter = 1;

    static void print_linearly(int n) {
        if (counter == n) {
            System.out.println(counter);
            return;
        }

        System.out.println(counter);
        counter++;
        print_linearly(n);
    }

    public static void main(String[] args) {
        print_linearly(10);
    }
}
