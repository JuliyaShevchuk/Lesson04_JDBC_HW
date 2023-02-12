package ua.goit;

import ua.goit.database.Database;
import ua.goit.database.databaseServices.DatabaseQueryService;
import ua.goit.model.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Connection connect = Database.getInstance().getConnection();

        List<MaxProjectCountClient> resultMaxProjectCountClient  = new DatabaseQueryService().findMaxProjectsClient(connect);
        System.out.println("--MaxProjectCountClient--");
        for (MaxProjectCountClient element:resultMaxProjectCountClient) {
            System.out.println(element.getName() + "  "+ element.getProjectCount());
        }

        List<LongerProjectCount> resultLongerProjectCount  = new DatabaseQueryService().findLongerProject(connect);
        System.out.println("--LongerProjectCount--");
        for (LongerProjectCount element:resultLongerProjectCount) {
            System.out.println(element.getName() + "  "+ element.getMonthCount());
        }

        List<MaxSalaryWorker> resultMaxSalaryWorker  = new DatabaseQueryService().maxSalaryWorker(connect);
        System.out.println("--MaxSalaryWorker--");
        for (MaxSalaryWorker element:resultMaxSalaryWorker) {
            System.out.println(element.getName() + "  "+ element.getSalary());
        }

        List<YoungestOldestWorkers> resultYoungestOldestWorkers  = new DatabaseQueryService().youngestOldestWorkers(connect);
        System.out.println("--YoungestOldestWorkers--");
        for (YoungestOldestWorkers element:resultYoungestOldestWorkers) {
            System.out.println(element.getName() + "  "+ element.getBirthday()+ "  "+ element.getType());
        }

        List<ProjectPrices> resultProjectPrices  = new DatabaseQueryService().projectPrices(connect);
        System.out.println("--ProjectPrices--");
        for (ProjectPrices element:resultProjectPrices) {
            System.out.println(element.getName() + "  "+ element.getSuma());
        }


        try {
            connect.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
