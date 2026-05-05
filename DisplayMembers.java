import java.sql.*;

public class DisplayMembers{
	
	
	public static void showAll() {
		
		String SQL="SELECT * FROM MEMBER"; //SQL query to RETRIVE ALL INFO FROM TABEL MEMBER
		
		try(
			Connection CONNECTION=DBConnection.getConnection(); // asking DBConnection class for Connection to the db
				Statement STATEMENT=CONNECTION.createStatement(); //statement to execute SQL queries
				ResultSet RESULT=STATEMENT.executeQuery(SQL); //execute the select query and store the result
				) {
			
		
				ResultSetMetaData meta=RESULT.getMetaData();// col info
				int colNum=meta.getColumnCount();//col num for the loop
		
				System.out.println("MEMBER RECORDS:");
				boolean rec=false;//is there some data?
				
				while(RESULT.next())//moving between rows 
					{
					rec=true;//we found
					for(int i=1;i<=colNum;i++) // check the att in rows
					{
						String colName=meta.getColumnName(i);//col name
						String x=RESULT.getString(i);//att value
						System.out.println(colName+" : "+x);
						
					}//for
					System.out.println();
				}//while 
				
				//if table empty
				if(!rec) {
					System.out.println("No Records Found");
				}//if
		}catch(SQLException e) {
			System.out.println("Error Displating"+ e.getMessage());
		}//catch
		
		
		
		
		
		
		
		
	}
}