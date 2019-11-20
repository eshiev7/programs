package Ex_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DataBaseReader {

    public void dataBaseReader(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://remotemysql.com:3306/gUBlqXSXbE";
            String username = "gUBlqXSXbE";
            String password = "DlJkj6jFbl";
            Connection con = DriverManager.getConnection(url, username, password);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs1 = stmt.executeQuery("SELECT * FROM `GroupStudent`");
                Map<Integer,String> groups = new HashMap<>();
                while(rs1.next()){
                    groups.put(rs1.getInt("id"), rs1.getString("groupName"));
                }
                rs1.close();
                int size = groups.size();

                for(int i = 1; i < size + 1; i++){
                    ResultSet rs = stmt.executeQuery("SELECT * FROM `Student` WHERE groupId = '"
                            + i + "'");
                    System.out.println("Группа: " + groups.get(i));
                    while (rs.next()) {
                        Student student = new Student(groups.get(i), rs.getString("lastName"), rs.getString("firstName"), rs.getString("secondName"),
                                rs.getString("birthdayDate"));
                        System.out.println(student);
                    }
                    rs.close();
                }
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
