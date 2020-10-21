package com.lethanh98.proxy.remoteproxy;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MainServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1089);
            String url="rmi://127.0.0.1:1089/PizzaCoRemoteGenerator";
            ReportGenerator reportGenerator = new ReportGeneratorImpl();
            Naming.rebind(url, reportGenerator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
