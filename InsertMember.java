import java.sql.*;

public class InsertMember {

    public static void insert(Member member) {
        String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, member.getMemberID());
            ps.setString(2, member.getNationalID());
            ps.setString(3, member.getFirstName());
            ps.setString(4, member.getMiddleName());
            ps.setString(5, member.getLastName());
            ps.setString(6, member.getDateOfBirth());
            ps.setString(7, member.getGender());
            ps.setString(8, member.getAddress());
            ps.setString(9, member.getPhoneNumber());
            ps.setString(10, member.getEmail());
            ps.setInt(11, member.getBranchID());
            ps.setString(12, member.getSubscriptionID());
            ps.setString(13, member.getStartDate());
            ps.setString(14, member.getEndDate());
            ps.setString(15, member.getPlanID());

            ps.executeUpdate();
            System.out.println("Member inserted successfully.");

            ps.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
        }
    }
}
