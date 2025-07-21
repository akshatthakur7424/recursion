public class print_linearly_n_to_1 {
    static void print_linearly(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        print_linearly(n - 1);
    }

    public static void main(String[] args) {
        print_linearly(10);
    }
}
