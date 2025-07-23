public class print_linearly_n_to_1_backtracking {
    // counter variable
    static int counter = 1;

    // recursive function with backtracking
    static void print_linearly(int n) {
        // base condition
        if (counter > n) {
            return;
        }

        // recursive function call with backtrancking
        counter++;
        print_linearly(n);
        counter--;
        System.out.print(counter + " ");
    }

    public static void main(String[] args) {
        print_linearly(5);
    }
}
