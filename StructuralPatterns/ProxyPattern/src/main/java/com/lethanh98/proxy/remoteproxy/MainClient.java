package com.lethanh98.proxy.remoteproxy;


import java.rmi.Naming;

public class MainClient {
    public static void main(String[] args) {
        try {
            ReportGenerator reportGenerator = (ReportGenerator) Naming.lookup("rmi://127.0.0.1:1089/PizzaCoRemoteGenerator");
            System.out.println(reportGenerator.generateDailyReport());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
