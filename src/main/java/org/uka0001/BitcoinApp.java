package org.uka0001;
/*
Задача:
- користувач вводить курс Bitcoin до доллара
- користувач вводить суму доларів, що хоче поміняти на Bitcoin
- програма повертає кількість Bitcoin, що можна купити на вказану суму.
Приклад:
What is Bitcoin price today?
21000
How much $ do you have?
1000
You can buy 0.0476190 BTC
*/

import java.util.Scanner;

public class BitcoinApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        try {
            float price = scanner.nextFloat();
            System.out.println("How much $ do you have?");
            float moneyAmount = scanner.nextFloat();
            float sum = moneyAmount / price;
            System.out.println("You can buy " + sum + " BTC");
            scanner.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("Wrong arguments, enter only numbers pls");
        }
    }
}
