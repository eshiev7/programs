package Ex_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class DataBaseWriter{

    public void saveStudent(String directory){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://remotemysql.com:3306/gUBlqXSXbE";
            String username = "gUBlqXSXbE";
            String password = "DlJkj6jFbl";
            Connection con = DriverManager.getConnection(url, username, password);
            DirWorker data = new DirWorker(directory);
            List<Student> students = data.studentList();
                try {
                for(Student student: students){
                    Statement stmt = con.createStatement();

                    ResultSet rs2 = stmt.executeQuery("SELECT `id` FROM `GroupStudent` WHERE groupName = '"
                            + student.getGroupName() +"'");
                    if (!rs2.next()){
                        String rs = "INSERT INTO `GroupStudent`(`groupName`) VALUES('"
                                + student.getGroupName() + "')";
                        stmt.execute(rs);
                    }
                    ResultSet rs4 = stmt.executeQuery("SELECT `id` FROM `GroupStudent` WHERE groupName = '"
                            + student.getGroupName() +"'");
                    rs4.next();
                    int id = rs4.getInt(1);

                    ResultSet rs3 = stmt.executeQuery("SELECT * FROM `Student` WHERE lastName = '" + student.getLastName()
                            + "' AND firstName = '" + student.getFirstName() + "'");

                    if (!rs3.next()) {
                        String rs1 = "INSERT INTO `Student`(`groupId`, `lastName`, `firstName`, `secondName`, `birthdayDate`) VALUES("
                                + id
                                + ", '" + student.getLastName()
                                + "', '" + student.getFirstName()
                                + "', '" + student.getSecondName()
                                + "', '" + student.getBirthdayDate()
                                + "')";
                        stmt.execute(rs1);
                        stmt.close();
                    }
                }
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
