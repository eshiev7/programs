package Ex_9;

public class App
{

    public static void main( String[] args ){
        if (args.length == 2) {
            DataBaseWriter dbw = new DataBaseWriter();
            dbw.saveStudent(args[1]);
        }
        if (args.length == 1) {
            DataBaseReader dbr = new DataBaseReader();
            dbr.dataBaseReader();
        }
    }
}
