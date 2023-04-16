import java.util.Scanner;

class operation {
  public static void main(String[] args) {

    char operator;
    Double a, b, c;

   
    Scanner sc = new Scanner(System.in);

    
    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    
    System.out.println("Enter first number");
    a = sc.nextDouble();

    System.out.println("Enter second number");
    b = sc.nextDouble();

    switch (operator) {

      case '+':
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        break;

      case '-':
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        break;

      case '*':
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        break;

      case '/':
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    sc.close();
  }
}