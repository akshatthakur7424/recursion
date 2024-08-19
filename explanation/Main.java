// Recursion is a type of function which calls itself again and again untill a specific condition is meet.

public class Main {

    // recursive(reetetive) function.
    static void print(int n,int stop) {

        if (n==stop){                  // setting the base condition of the recursive(repeteetive) function to stop it when a particular condition meets.
            System.out.println(n);     // actions when the base condition is hitted.
            return;
        }

        System.out.println(n);    // perfoming an action in the function.

        print(n+1,stop);         // calling the function again by the updated value in the parameter.
    }
    public static void main(String[] args) {
        System.out.println("Recursion");
        print(1,10);  // calling recursive function.
    }   
}


// The number of times the function is called each time it will be loaded in the stack with a different value.
// when the last called function is completed so it will remove that functon from the stack and come back to the previous funtion as it is also ompleted so it will come out from that and remove it also from the stack and come to the place from where it has been called that is the previous function and as it is also been completed so it will come out of it remove it from the stack ana the process goes on till the function comes to the place from where it has been caled for the first time that is from the main function, when all the processes of the main function is also executed so the main function so the control will come out from the main function also and it will also be removed from the stack.

// Main function is the first function to be loaded in the stack and it is the last thing to be removed from the stack. 