package heranca_polimorfismo.loja_desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public  static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int listNumber = keyboard.nextInt();
        keyboard.nextLine();

        char opcao;
        for (int i = 0; i < listNumber; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            opcao = keyboard.next().charAt(0);
            keyboard.nextLine();

            if (opcao == 'c') {
                System.out.print("Name: ");
                String name = keyboard.nextLine();
                System.out.print("Price: ");
                double price = keyboard.nextDouble();
                keyboard.nextLine();

                productList.add(new Product(name, price));
            } else if (opcao == 'u') {
                System.out.print("Name: ");
                String name = keyboard.nextLine();
                System.out.print("Price: ");
                double price = keyboard.nextDouble();
                keyboard.nextLine();

                DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.print("Manufacturer date (DD/MM/YYYY): ");
                String date = keyboard.nextLine();
                LocalDate date1 = LocalDate.parse(date, fmt);

                productList.add(new UsedProduct(name, price, date1));
            } else {
                System.out.print("Name: ");
                String name = keyboard.nextLine();
                System.out.print("Price: ");
                double price = keyboard.nextDouble();
                System.out.print("Customs fee: ");
                double amount = keyboard.nextDouble();
                keyboard.nextLine();

                productList.add(new ImportedProduct(name, price, amount));
            }
        }

        System.out.println("Price Tags: ");
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}
