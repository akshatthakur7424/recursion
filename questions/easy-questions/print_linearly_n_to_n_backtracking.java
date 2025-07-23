public class print_linearly_n_to_n_backtracking {

    static void printLinearly(int i, int n) {
        // base condition
        if (i > n) return;

        // recursive call
        printLinearly(i + 1, n);

        // backtracking step
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        printLinearly(5, 15);
    }
}