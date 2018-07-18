package com.higgsup.proxypattern.remoteproxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {
    protected ReportGeneratorImpl() throws RemoteException {
    }

    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report********************");
        sb.append("\\n Location ID: 012");
        sb.append("\\n Today’s Date: " + new Date());
        sb.append("\\n Total Pizza’s Sell: 112");
        sb.append("\\n Total Price: $2534");
        sb.append("\\n Net Profit: $1985");
        sb.append("\\n-***************************************************************");
        return sb.toString();
    }
}
