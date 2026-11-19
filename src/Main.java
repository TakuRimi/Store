import java.util.Scanner;

public class Main {
    public Main() {}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mouse = 20;
        double Keyboard = 40;
        double Headphones = 50;
        double LaptopStand = 30;
        double finalTotal;
        double all = 0;
        finalTotal = all;

        int num;

        do{
        System.out.println("Store");
        System.out.println("1. Mouse      -   20 ");
        System.out.println("2. Keyboard   -   40");
        System.out.println("3. Headphones -   50");
        System.out.println("4. laptop stand - 30");
        System.out.println("5. checkout");

        System.out.println("choose a product: ");
        num = scanner.nextInt();
                if(num > 5 || num <=0){
                    System.out.println("This option doesn't exist");
                }
                else
                switch(num) {
                    case 1:
                        System.out.println("You selected: Mouse");
                        System.out.println("Price: 20");
                        System.out.println("Enter quantity: ");
                        double n1 = scanner.nextDouble();
                        if(n1 <= 0){
                            System.out.println("Quantity must be greater than 0!");
                        }
                        else {
                            double q1 = n1 * 20;
                            System.out.println(n1 + " * 20 = " + q1);
                            all = all + q1;
                            System.out.println("current total " + all);
                        }break;
                    case 2:
                        System.out.println("You selected: Keyboard");
                        System.out.println("Price: 40");
                        System.out.println("Enter quantity: ");
                        double n2 = new Scanner(System.in).nextDouble();
                        if(n2 <= 0){
                            System.out.println("Quantity must be greater than 0!");
                        }
                            else {
                            double q2 = n2 * 40;
                            System.out.println(n2 + " * 40 = " + q2);
                            all = all + q2;
                            System.out.println("current total " + all);
                        }break;
                    case 3:
                        System.out.println("You selected: Headphones");
                        System.out.println("Price: 50");
                        System.out.println("Enter quantity: ");
                        double n3 = new Scanner(System.in).nextDouble();
                        if(n3 <= 0){
                            System.out.println("Quantity must be greater than 0!");
                        }
                        else {
                            double q3 = n3 * 50;
                            System.out.println(n3 + " * 50 = " + q3);
                            all = all + q3;
                            System.out.println("current total " + all);
                        }break;
                    case 4:
                        System.out.println("You selected: Laptop stand");
                        System.out.println("Price: 30");
                        System.out.println("Enter quantity: ");
                        double n4 = new Scanner(System.in).nextDouble();
                        if(n4 <= 0){
                            System.out.println("Quantity must be greater than 0!");
                        }
                        else {
                            double q4 = n4 * 30;
                            System.out.println(n4 + " * 30 = " + q4);
                            all = all + q4;
                            System.out.println("current total " + all);
                        }break;
                }
            }
            while(num != 5);
                if(all >= 100){
                    finalTotal = all - (all * 0.1);
                    System.out.println("Your total:" + finalTotal);
                }
                else{
                    finalTotal = all;
                    System.out.println("Your total:" + finalTotal);}
        Scanner sc = new Scanner(System.in);

        System.out.println("make a payment" + finalTotal);
        double pay = scanner.nextDouble();

        if(pay == finalTotal){
            System.out.println("Payment completed. No change");
        }
        else if(pay > finalTotal){
            double change = pay - finalTotal;
            System.out.println("change: " + change );
        }
        else if(pay < finalTotal){
            double payment = finalTotal - pay;
                System.out.println("You still need to pay: "+ payment);
        }

        }

    }
