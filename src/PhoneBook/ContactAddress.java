package PhoneBook;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ContactAddress {
    private String name;
    private String address;
    private int telephone;
    private String email;

    Scanner userInput = new Scanner(System.in);

    public ContactAddress(String userName, String userAddress, int userNumber, String userEmail) {
        this.name = userName;
        this.address = userAddress;
        this.telephone = userNumber;
        this.email = userEmail;
    }

    public String toString(){
        return name + "\t" + address + "\t" + telephone + "\t" + email;
    }

    public void setName(String name){ this.name = name; }
    public void setAddress(String address){ this.address = address;}
    public void setTelephone(int telephone){ this.telephone = telephone;}
    public void setEmail(String email){ this.email = email;}

    public String getName(){ return name;}
    public String getAddress(){return address;}
    public int getTelephone(){return telephone;}
    public String getEmail(){return  email;}

    public void createAddressField() throws InputMismatchException {

        ArrayList<ContactAddress> addressBook = new ArrayList<>();
        ContactAddress contactAddress = new ContactAddress(null, null , 0, null);
        System.out.println("SAVE YOUR CONTACTS");
        String names = "yes";

        while(Objects.equals(names, "yes")){

            System.out.println("Enter your name");
            String userName = userInput.nextLine();
            contactAddress.setName(userName);

            System.out.println("Enter your Address");
            String userAddress = userInput.nextLine();
            contactAddress.setAddress(userAddress);

            System.out.println("Enter your PhoneNumber");
            int userNumber = userInput.nextInt();
            contactAddress.setTelephone(userNumber);

            System.out.println("Enter your Email");
            String userEmail = userInput.nextLine();
            userInput.nextLine();
            contactAddress.setEmail(userEmail);

            addressBook.add(new ContactAddress(userName,userAddress,userNumber,userEmail));

            System.out.println();
            System.out.println("Keep storing contacts? yes/no: ");
            names = userInput.nextLine();
        }

        for (ContactAddress address : addressBook) {
            System.out.println(address);
        }
    }

    public static void main(String[] args) {
        ContactAddress contactAddress = new ContactAddress(null, null , 0, null);
        try {
            contactAddress.createAddressField();
        }catch (InputMismatchException ime){
            ime.printStackTrace();
            System.out.println("This field accepts only a number, Kindly enter your Phone number");
        }
    }
}
