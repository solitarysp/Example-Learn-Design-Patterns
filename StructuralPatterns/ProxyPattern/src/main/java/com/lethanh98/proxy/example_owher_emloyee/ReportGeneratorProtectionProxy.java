package com.lethanh98.proxy.example_owher_emloyee;


import com.lethanh98.proxy.remoteproxy.ReportGenerator;

import java.rmi.Naming;

public class ReportGeneratorProtectionProxy implements ReportGeneratorProxy {
    ReportGenerator reportGenerator;
    Staff staff;

    public ReportGeneratorProtectionProxy(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String generateDailyReport() {
        if (staff.isOwner()) {
            ReportGenerator reportGenerator = null;
            try {
                reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1:1089/PizzaCoRemoteGenerator");
                return reportGenerator.generateDailyReport();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "";
        } else {
            return "Not Authorized to view report.";
        }
    }
}
