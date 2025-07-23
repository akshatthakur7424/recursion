public class print_linearly_1_to_n_backtracking {
    // recursive function
    static void print_linearly(int n) {
        // base condition
        if (n < 1) {
            return;
        }

        // backtracking - calling the function before printing ( value will be printed when the function returns )
        print_linearly(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        print_linearly(5);
    }
}
