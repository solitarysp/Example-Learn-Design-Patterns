package com.higgsup.proxypattern.proxypattern;

public interface Staff {
    public boolean isOwner();
    public void setReportGenerator(ReportGeneratorProxy reportGenerator);
}
