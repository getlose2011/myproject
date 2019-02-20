package com.getlose;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report financeReport = new FinanceReport();
        Report healthReport = new HealthReport();

        List<Report> reportList = new ArrayList<Report>();
        reportList.add(financeReport);
        reportList.add(healthReport);
        for(Report i : reportList){
            i.load();
            i.print();
        }
    }
}
