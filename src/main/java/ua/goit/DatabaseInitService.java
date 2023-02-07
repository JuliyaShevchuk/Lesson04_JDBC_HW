package ua.goit;

public class DatabaseInitService {
    public static void main(String[] args)  {
        String fileName = "./sql/init_db.sql";
        ReadFile readFile = new ReadFile();
        String contents = readFile.readUsingFiles(fileName);

        Database database = Database.getInstance();
        database.executeUpdate(contents);

    }

}
