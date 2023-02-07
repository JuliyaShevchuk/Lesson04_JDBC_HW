package ua.goit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MaxProjectCountClient> resultMaxProjectCountClient  = new DatabaseQueryService().findMaxProjectsClient();
        System.out.println("--MaxProjectCountClient--");
        for (MaxProjectCountClient element:resultMaxProjectCountClient) {
            System.out.println(element.getName() + "  "+ element.getProjectCount());
        }

        List<LongerProjectCount> resultLongerProjectCount  = new DatabaseQueryService().findLongerProject();
        System.out.println("--LongerProjectCount--");
        for (LongerProjectCount element:resultLongerProjectCount) {
            System.out.println(element.getName() + "  "+ element.getMonthCount());
        }

        List<MaxSalaryWorker> resultMaxSalaryWorker  = new DatabaseQueryService().maxSalaryWorker();
        System.out.println("--MaxSalaryWorker--");
        for (MaxSalaryWorker element:resultMaxSalaryWorker) {
            System.out.println(element.getName() + "  "+ element.getSalary());
        }

        List<YoungestOldestWorkers> resultYoungestOldestWorkers  = new DatabaseQueryService().youngestOldestWorkers();
        System.out.println("--YoungestOldestWorkers--");
        for (YoungestOldestWorkers element:resultYoungestOldestWorkers) {
            System.out.println(element.getName() + "  "+ element.getBirthday()+ "  "+ element.getType());
        }

        List<ProjectPrices> resultProjectPrices  = new DatabaseQueryService().projectPrices();
        System.out.println("--ProjectPrices--");
        for (ProjectPrices element:resultProjectPrices) {
            System.out.println(element.getName() + "  "+ element.getSuma());
        }
    }
}