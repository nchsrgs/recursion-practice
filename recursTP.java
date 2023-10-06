import java.util.Scanner;

public class recursTP{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
       System.out.println("Welcome!!!!!");
       System.out.println("Choose one to do the following operations: ");
       System.out.println("1.)Factorial");
       System.out.println("2.)Find the greatest common divisor of two (2) no-zero integers");
       System.out.println("3.)Fibonacci");
       System.out.println("4.)Determine whether an integer is even or odd. ");
       System.out.print("Choose an option:");
       int choice = sc.nextInt();

       sc.nextLine();
        
       switch(choice){

        case 1:
        System.out.println("Enter a number to compute the factorial: ");
        int number = sc.nextInt();
        
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        break;

        case 2:
        System.out.println("Enter first number: ");
        int x = sc.nextInt();

        System.out.println("Enter second number: ");
        int y = sc.nextInt();

        int gcd = findGCD(x, y);
        System.out.println("The GCD of " + x +" and " + y + " is " + gcd + ".");
        break;

        case 3:
        System.out.println("Enter a number higher than 0: ");
        int xy = sc.nextInt();

        if(xy <= 0){
            System.out.println("Please enter a number higher than 0.");
        }else{
            for(int i = 0; i<=xy; i++){
                System.out.println("Fibonacci(" + i + ") = " + fib(i)) ;
            }
        }
        break;

        case 4:

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (is_even(num)){
            System.out.println(num + " is an even number.");
        }else if(is_odd(num)){
            System.out.println(num + " is an odd number.");
        }
        break;
       }
        }
        
    }

    public static int factorial(int y){
        if(y == 0 || y == 1){
            return 1;
        }
        else{
            return y * factorial(y-1);
        }

    }

    public static int findGCD(int x,int y){
        if(x % y == 0){
            return y;
        }
        return findGCD(y,x % y);

    }

    public static int fib(int x){
        if(x <= 1){
            return x;
        }
        return fib(x - 1) + fib(x- 2);
    }

    public static boolean is_even(int num){
        if(num == 0){
            return true;
        }else{
            return is_odd(num - 1);
        }
    }

    public static boolean is_odd(int num){
        if(num == 0 ){
            return false;
        }else{
            return is_even(num - 1);
        }
    }

    
}