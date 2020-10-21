package com.lethanh98.abstractpatternt.style;


import com.lethanh98.abstractpatternt.item.chair.Chair;
import com.lethanh98.abstractpatternt.item.chair.ModernChair;
import com.lethanh98.abstractpatternt.item.table.ModernTable;
import com.lethanh98.abstractpatternt.item.table.Table;

public class ModernFactory implements StyleFactoryInterface {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
