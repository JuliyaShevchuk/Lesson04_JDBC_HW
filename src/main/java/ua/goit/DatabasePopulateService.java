package ua.goit;

public class DatabasePopulateService {
    public static void main(String[] args) {
        String fileName = "./sql/populate_db.sql";
        ReadFile readFile = new ReadFile();
        String contents = readFile.readUsingFiles(fileName);

        Database database = Database.getInstance();
        database.executeUpdate(contents);

    }
}
