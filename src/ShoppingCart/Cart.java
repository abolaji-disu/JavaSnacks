package ShoppingCart;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

    public class Cart {
        Scanner userInput;
        String doubleLine;
        String singleLine;
        private String item;
        private int quantity;
        private int price;
        private int total;
        private String moreItems;
        private int subTotal;
        private int discount;
        private int discountPrice;
        private double vat;
        private double vatPrice;

        public Cart(String item, int quantity, int price, int total) {
            this.userInput = new Scanner(System.in);
            this.doubleLine = "===========================================================";
            this.singleLine = "----------------------------------------------------------";
            this.subTotal = 0;
            this.discountPrice = 2;
            this.vatPrice = 17.5;
            this.item = item;
            this.quantity = quantity;
            this.price = price;
            this.total = total;
        }

        public String toString() {
            return "\t\t\t\t" + this.item + "\t\t" + this.quantity + "\t\t" + this.price + "\t\t\t" + this.total;
        }

        private void setItem(String item) {
            this.item = item;
        }

        private String getItem() {
            return this.item;
        }

        private void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        private int getQuantity() {
            return this.quantity;
        }

        private void setPrice(int price) {
            this.price = price;
        }

        private int getPrice() {
            return this.price;
        }

        private int setTotal() {
            this.total = this.quantity * this.price;
            return this.total = this.total;
        }

        public void receiptBody() {
            Cart myCart = new Cart("milk", 1, 10, 10);
            ArrayList<Cart> saveCart = new ArrayList();

            String storeName = "SEMICOLON STORES";
            String branch = "MAIN BRANCH";
            String location = "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS";
            String telephone = "TEL: 03293828343";
            String todayDate = myDate();
            String cashier = cashierName();
            String customer = customerName();

            do {
                System.out.print("What did the user buy: ");
                String item = userInput.nextLine();
                myCart.setItem(item);

                System.out.print("How many pieces: ");
                int quantity = userInput.nextInt();
                myCart.setQuantity(quantity);

                System.out.print("How much per unit: ");
                int price = userInput.nextInt();
                myCart.setPrice(price);

                int finalTotal = myCart.setTotal();
                saveCart.add(new Cart(item, quantity, price, finalTotal));
                subTotal += myCart.total;

                System.out.print("Add more items (enter yes or no): ");
                userInput.nextLine();
                moreItems = this.userInput.nextLine();
            } while(Objects.equals(this.moreItems, "yes"));

            System.out.println(" ");
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s\n%s\n", storeName, branch, location, telephone, todayDate, cashier, customer);
            System.out.println(this.doubleLine);
            System.out.printf("%20s %10s %10s %15s %n ", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
            System.out.println(this.singleLine);

            for (Cart num : saveCart) {
                System.out.println(num);
            }

            System.out.println(singleLine);
            System.out.printf("%42s%10s%n", "Sub Total:", subTotal);

            discount = this.subTotal * discountPrice / 100;
            System.out.printf("%42s%10s%n", "Discount:", discount);

            vat = (double)this.subTotal * this.vatPrice / 100.0;
            System.out.printf("%42s%10s%n", "VAT @ 17.50:", vat);
            System.out.println(doubleLine);

            double billTotal = subTotal + discount + vat;
            System.out.printf("%42s%10s%n", "Bill Total:", billTotal);
            System.out.println(doubleLine);

            System.out.printf("%S%.2f%n", "this is not a receipt kindly pay: ", billTotal);
            System.out.println(doubleLine);

            System.out.println("How much did the customer give to you?: ");
            double amountPaid = userInput.nextInt();
            double balance = amountPaid - billTotal;
            if (amountPaid < billTotal) {
                System.out.print("Please pay your bills in full to avoid unnecessary embarrassment");
            } else {
                System.out.println();
                System.out.printf("%s\n%s\n%s\n", todayDate, cashier, customer);
                System.out.println(doubleLine);
                System.out.printf("%20s %10s %10s %15s %n ", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
                System.out.println(singleLine);

                for (Cart num : saveCart) {
                    System.out.println(num);
                }

                System.out.println(singleLine);
                System.out.printf("%42s%10s%n", "Sub Total:", subTotal);
                System.out.printf("%42s%10s%n", "Discount:", discount);
                System.out.printf("%42s%10s%n", "VAT @ 17.50:", vat);

                System.out.println(doubleLine);
                System.out.printf("%42s%10s%n", "Bill Total:", billTotal);
                System.out.printf("%42s%10s%n", "Amount Paid:", amountPaid);
                System.out.printf("%42s%.2f%n", "Balance:", balance);

                System.out.println(doubleLine);
                System.out.print("\t\t THANKS FOR YOUR PATRONAGE \n ");
                System.out.print(doubleLine);
            }

        }

        public String myDate() {
            LocalDateTime newDate = LocalDateTime.now();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyy HH-mm-ss");
            String var10000 = newDate.format(formatDate);
            return "Date: " + var10000;
        }

        public String cashierName() {
            System.out.print("What is your name: ");
            String userName = this.userInput.nextLine();
            return "Cashier: " + userName;
        }

        public String customerName() {
            System.out.print("What is the customer's name: ");
            String userName = this.userInput.nextLine();
            return "Customer Name: " + userName;
        }

        public static void main(String[] args) {
            Cart myCart = new Cart("milk", 1, 10, 10);
            myCart.receiptBody();
        }
    }




