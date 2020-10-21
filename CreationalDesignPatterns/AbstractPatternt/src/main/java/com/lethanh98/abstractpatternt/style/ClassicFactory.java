package com.lethanh98.abstractpatternt.style;


import com.lethanh98.abstractpatternt.item.chair.Chair;
import com.lethanh98.abstractpatternt.item.chair.ClassicChair;
import com.lethanh98.abstractpatternt.item.table.ClassicTable;
import com.lethanh98.abstractpatternt.item.table.Table;

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
