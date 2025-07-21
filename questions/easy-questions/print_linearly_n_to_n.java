public class print_linearly_n_to_n {
    static void print_linearly(int x, int y) {
        if (x > y) {
            return;
        }

        System.out.print(x + " ");
        print_linearly(x + 1, y);
    }

    public static void main(String[] args) {
        print_linearly(1, 10);
    }
}
