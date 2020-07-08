package com.higgsup.abstractpatternt.style;

import com.higgsup.abstractpatternt.item.chair.Chair;
import com.higgsup.abstractpatternt.item.chair.ClassicChair;
import com.higgsup.abstractpatternt.item.table.ClassicTable;
import com.higgsup.abstractpatternt.item.table.Table;

public class ClassicFactory implements StyleFactoryInterface {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }
}
