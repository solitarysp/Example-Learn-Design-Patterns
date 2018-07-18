package com.higgsup.proxypattern.protective_pattern.example_owher_emloyee;

public class Employee implements Staff {
    private ReportGeneratorProxy reportGenerator;

    @Override
    public boolean isOwner() {
        return false;
    }

    @Override
    public void setReportGenerator(ReportGeneratorProxy reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public String generateDailyReport() {
        try {
            return reportGenerator.generateDailyReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
