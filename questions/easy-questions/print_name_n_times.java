public class print_name_n_times {
    static int counter = 0;

    // recursive function - print name n times
    static void print_name(int n, String name) {
        // base condition
        if (counter == n) {
            return;
        }

        // priting name, incrementing counter and calling function again
        System.out.println(counter + ". " + name);
        counter++;
        print_name(n, name);
    }

    public static void main(String[] args) {
        print_name(5, "Akshat Singh Thakur");
    }
}
