package com.lethanh98.abstractpatternt.style;


import com.lethanh98.abstractpatternt.item.chair.Chair;
import com.lethanh98.abstractpatternt.item.table.Table;

public interface StyleFactoryInterface {

    Chair createChair();

    Table createTable();
}
