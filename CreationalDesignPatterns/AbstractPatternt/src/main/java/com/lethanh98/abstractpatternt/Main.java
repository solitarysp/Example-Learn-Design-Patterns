package com.lethanh98.abstractpatternt;

import com.lethanh98.abstractpatternt.style.StyleFactoryInterface;

public class Main {
    public static void main(String[] args) {
        StyleFactoryInterface styleFactoryInterfaceCLASSIC = FactoryStyle.getFactory(TypeStyle.CLASSIC);
        System.out.println("TypeStyle.CLASSIC demo");
        styleFactoryInterfaceCLASSIC.createChair().showInfo();
        styleFactoryInterfaceCLASSIC.createTable().showInfo();

        StyleFactoryInterface styleFactoryInterfaceMODERN = FactoryStyle.getFactory(TypeStyle.MODERN);
        System.out.println("TypeStyle.MODERN demo");
        styleFactoryInterfaceMODERN.createChair().showInfo();
        styleFactoryInterfaceMODERN.createTable().showInfo();
    }
}
