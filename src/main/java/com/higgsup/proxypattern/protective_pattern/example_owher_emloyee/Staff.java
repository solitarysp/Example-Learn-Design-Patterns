package com.higgsup.proxypattern.protective_pattern.example_owher_emloyee;

public interface Staff {
    public boolean isOwner();
    public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
