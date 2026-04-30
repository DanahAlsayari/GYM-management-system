import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        while (true) {
            System.out.println("1) Insert Member");
            System.out.println("2) Display Members");
            System.out.println("3) Exit");
            System.out.print("Choose an operation: ");

            int choice = input.nextInt();
            input.nextLine();  

            if (choice == 1) {     
                System.out.println("Enter member details:");
                
                System.out.print("Member ID: ");
                int memberId = input.nextInt();
                
                input.nextLine(); 
                System.out.print("National ID: ");
                String nationalId = input.nextLine();
                
                System.out.print("First Name: ");
                String firstName = input.nextLine();
                
                System.out.print("Middle Name: ");
                String middleName = input.nextLine();
                
                System.out.print("Last Name: ");
                String lastName = input.nextLine();
                
                System.out.print("Date of Birth (yyyy-mm-dd): ");
                String dateOfBirth = input.nextLine();
                
                System.out.print("Gender (M/F): ");
                String gender = input.nextLine();
                
                System.out.print("Address: ");
                String address = input.nextLine();
                
                System.out.print("Phone Number: ");
                String phoneNumber = input.nextLine();
                
                System.out.print("Email: ");
                String email = input.nextLine();


                Member newMember = new Member(memberId, nationalId, firstName, middleName, lastName, 
                                            dateOfBirth, gender, address, phoneNumber, email);
                

                InsertMember.insert(newMember);
                
                System.out.println("Member added successfully!");
            } else if (choice == 2) {
                System.out.println("Displaying all members:");
                DisplayMembers.showAll();
            } else if (choice == 3) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        input.close();
    }

}