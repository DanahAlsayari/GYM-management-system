import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mainMenu=1;
        do{
            try{
            System.out.println("Welcome to GYM management system!");
            System.out.println("Table MEMBER:");
            System.out.println("1) Insert new record");
            System.out.println("2) Display all the records");
            System.out.println("3) Exit");
            System.out.print("Choose an operation:) ");

            int choice = input.nextInt();
            input.nextLine();  

            switch (choice) {
            case 1: 
                boolean EnterNewRecord=true;
                do{   
                System.out.println("MEMBER-INSERTION:");
                try{
                System.out.print("\nMember ID: ");
                int memberId = input.nextInt();
                
                input.nextLine(); 
                System.out.print("\nNational ID: ");
                String nationalId = input.nextLine();
                
                System.out.print("\nFirst Name: ");
                String firstName = input.nextLine();
                
                System.out.print("\nMiddle Name: ");
                String middleName = input.nextLine();
                
                System.out.print("\nLast Name: ");
                String lastName = input.nextLine();
                
                System.out.print("\nDate of Birth (yyyy-mm-dd): ");
                String dateOfBirth = input.nextLine();
                
                System.out.print("\nGender (M/F): ");
                String gender = input.nextLine();
                
                System.out.print("\nAddress: ");
                String address = input.nextLine();
                
                System.out.print("\nPhone Number: ");
                String phoneNumber = input.nextLine();
                
                System.out.print("\nEmail: ");
                String email = input.nextLine();

                System.out.print("\nBranch ID: ");
                int branchID = input.nextInt();

                
                Member newMember = new Member(memberId, nationalId, firstName, middleName, lastName, 
                                            dateOfBirth, gender, address, phoneNumber, email, branchID);

                InsertMember.insertMember(newMember);
                }catch(Exception e){
                    System.out.println("Invalid input. Please try again.");
                    EnterNewRecord=true; 
                    input.nextLine(); 
                    break;}
  
                boolean yesNo=true;
                do{
                try{
                System.out.println("Insert a new record (Y/N)?");
                String userChoice = input.next();
                if (userChoice.equalsIgnoreCase("Y")) 
                    EnterNewRecord = true;
                 else {
                    if (userChoice.equalsIgnoreCase("N")) 
                    EnterNewRecord = false;
                    else{
                        yesNo=false;
                    System.out.println("Invalid input write Y or N");}
                }
                }catch(Exception e){
                    System.out.println("Invalid input write Y or N");
                    yesNo=false;}
                }while(!yesNo);
            
                }while(EnterNewRecord); 
                break;

            case 2:
                System.out.println("Displaying all members:");
                DisplayMembers.showAll();
                break;
            case 3:
                System.out.println("Exiting program...");
                mainMenu=0;
                break;
            default:
                System.out.println("Invalid choice, please try again.");
            }
            
        }catch(Exception e){
            System.out.println("Error occurred!");
            System.out.println(e.getMessage());
            input.nextLine(); }
        }while(mainMenu==1);
        input.close();

}
}
