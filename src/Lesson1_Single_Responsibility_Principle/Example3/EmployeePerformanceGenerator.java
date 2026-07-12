package Lesson1_Single_Responsibility_Principle.Example3;

import Lesson1_Single_Responsibility_Principle.Example2.BetterCode.Employee;

public class EmployeePerformanceGenerator {
    //If only considered srp then it is follow srp principle but if ocp(open and closed principle then a very bad code)
    public String generateReport(String reportType, Employee employee) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report.";
        } else if (reportType.equals("Word")) {
            return "Generating Word report.";
        }
        return "Report type not supported.";
    }
}
