package com.higgsup.abstractpatternt.style;

import com.higgsup.abstractpatternt.item.chair.Chair;
import com.higgsup.abstractpatternt.item.table.Table;

public interface StyleFactoryInterface {

    Chair createChair();

    Table createTable();
}
