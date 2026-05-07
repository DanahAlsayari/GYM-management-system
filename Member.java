public class Member {

    
    private int memberID;
    private String nationalID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String dateOfBirth;   
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private int branchID;
    private String SubscriptionID;
    private String StartDate;  
    private String EndDate;
    private String PlanID;
    

    public Member() {
        this.memberID = 0;
        this.nationalID = "";
        this.firstName = "";
        this.middleName = "";
        this.lastName = "";
        this.dateOfBirth = "";
        this.gender = "";
        this.address = "";
        this.phoneNumber = "";
        this.email = "";
        this.branchID = 0;
        this.SubscriptionID = "";
        this.StartDate = "";
        this.EndDate = "";
        this.PlanID = "";
    }
    

    public Member(int memberID, String nationalID, String firstName, String middleName,
                  String lastName, String dateOfBirth, String gender, String address,
                  String phoneNumber, String email, int branchID , String SubscriptionID, String StartDate, String EndDate, String PlanID) {

        this.memberID = memberID;
        this.nationalID = nationalID;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.branchID = branchID;
        this.SubscriptionID = SubscriptionID;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.PlanID = PlanID;
    }


    public int getMemberID() {
        return memberID;
    }

    public String getNationalID() {
        return nationalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getBranchID() {
        return branchID;
    }


    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public int setBranchID() {
        return branchID;
    }

    public String getSubscriptionID() {
        return SubscriptionID;
    }
    public void setSubscriptionID(String subscriptionID) {
        SubscriptionID = subscriptionID;
    }
    public String getStartDate() {
        return StartDate;
    }
    public void setStartDate(String startDate) {
        StartDate = startDate;
    }
    public String getEndDate() {
        return EndDate;
    }
    public void setEndDate(String endDate) {
        EndDate = endDate;
    }
    public String getPlanID() {
        return PlanID;
    }
    public void setPlanID(String planID) {
        PlanID = planID;
    }
    

}
