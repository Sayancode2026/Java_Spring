package Lesson2_Open_Closed_Principle.Example3.ProblematicCode;

public class ReportGenerator {

    public String generateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "Generating PDF report";
        } else if (reportType.equals("Word")) {
            return "Generating Doc Format";
        }
        return "Report type not supported ";
    }
}