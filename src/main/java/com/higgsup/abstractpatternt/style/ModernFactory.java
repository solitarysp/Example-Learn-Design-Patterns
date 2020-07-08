package com.higgsup.abstractpatternt.style;

import com.higgsup.abstractpatternt.item.chair.Chair;
import com.higgsup.abstractpatternt.item.chair.ModernChair;
import com.higgsup.abstractpatternt.item.table.ModernTable;
import com.higgsup.abstractpatternt.item.table.Table;

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
