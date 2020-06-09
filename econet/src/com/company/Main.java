package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);

        System.out.println(" Dial 143 for econet bundles");

        x = input.nextInt();
        if (x == 143) {
            System.out.println("  econet bundles");

            System.out.println("  option 1 data bundles");
            System.out.println("  option 2 whatsapp bundles");
            System.out.println("  option 3 facebook bundles");


            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println(" choose the amount of  data bundle you want to purchase");

                    System.out.println(" option 1 $5=30mb");
                    System.out.println(" option 2 $100=unlimited");

                    x = input.nextInt();
                    if (x == 1) {
                        System.out.println(" confirm purchase");

                        System.out.println(" press 1 to confirm purchase");
                        System.out.println(" press any other number to cancel");
                        x = input.nextInt();

                        if (x == 1) {
                            System.out.println(" bundle purchased");
                        } else {
                            System.out.println(" bundle purchase failed");
                        }
                    } else {
                        System.out.println(" cancel");
                    }
                    break;
                case 2:
                    System.out.println(" choose the amount of whatsapp bundle you want to purchase");

                    System.out.println(" option 1 $7=30mb");
                    System.out.println(" option 2 $100=unlimited");

                    x = input.nextInt();
                    if (x == 1) {
                        System.out.println(" confirm purchase");

                        System.out.println(" press 1 to confirm purchase");
                        System.out.println(" press any other number to cancel");
                        x = input.nextInt();

                        if (x == 1) {
                            System.out.println(" bundle purchased");
                        } else {
                            System.out.println(" bundle purchase failed");
                        }
                    } else {
                        System.out.println(" cancel");
                    }
                    break;
                case 3:
                    System.out.println(" choose the amount of facebook bundle you want to purchase");

                    System.out.println(" option 1 $10=30mb");
                    System.out.println(" option 2 $1000=unlimited");

                    x = input.nextInt();
                    if (x == 1) {
                        System.out.println(" confirm purchase");

                        System.out.println(" press 1 to confirm purchase");
                        System.out.println(" press any other number to cancel");
                        x = input.nextInt();

                        if (x == 1) {
                            System.out.println(" bundle purchased");
                        } else {
                            System.out.println(" bundle purchase failed");
                        }
                    } else {
                        System.out.println(" cancel");
                    }
                    break;
            }
            {
                System.out.println(" confirmed");
            }
        }
    }
}