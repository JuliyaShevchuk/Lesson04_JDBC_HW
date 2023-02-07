package ua.goit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    Database database = Database.getInstance();

    public List<YoungestOldestWorkers> youngestOldestWorkers(){
        String fileName = "./sql/find_youngest_oldest_workers.sql";
        String contents = new ReadFile().readUsingFiles(fileName);

        List<YoungestOldestWorkers> result = new ArrayList<>();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(contents)) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    String birthday = rs.getString("birthday");
                    String type = rs.getString("type");
                    result.add(new YoungestOldestWorkers(name, birthday,type));
                }
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public List<ProjectPrices> projectPrices(){
        String fileName = "./sql/print_project_prices.sql";
        String contents = new ReadFile().readUsingFiles(fileName);

        List<ProjectPrices> result = new ArrayList<>();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(contents)) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    int suma = rs.getInt("suma");
                    result.add(new ProjectPrices(name, suma));
                }
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    public List<MaxSalaryWorker> maxSalaryWorker(){
        String fileName = "./sql/find_max_salary_worker.sql";
        String contents = new ReadFile().readUsingFiles(fileName);

        List<MaxSalaryWorker> result = new ArrayList<>();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(contents)) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    int salary = rs.getInt("salary");
                    result.add(new MaxSalaryWorker(name, salary));
                }
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<LongerProjectCount> findLongerProject() {
        String fileName = "./sql/find_longest_project.sql";
        String contents = new ReadFile().readUsingFiles(fileName);

        List<LongerProjectCount> result = new ArrayList<>();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(contents)) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    int monthCount = rs.getInt("month_count");
                    result.add(new LongerProjectCount(name, monthCount));
                }
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        String fileName = "./sql/find_max_projects_client.sql";
        String contents = new ReadFile().readUsingFiles(fileName);

        List<MaxProjectCountClient> result = new ArrayList<>();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(contents)) {
                while (rs.next()) {
                    //                   System.out.println(rs.getString("name")+"  "+rs.getInt("project_count"));
                    String name = rs.getString("name");
                    int projectCount = rs.getInt("project_count");
                    result.add(new MaxProjectCountClient(name, projectCount));
                }
                return result;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


}
