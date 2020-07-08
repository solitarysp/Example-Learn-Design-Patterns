package com.higgsup.abstractpatternt;

import com.higgsup.abstractpatternt.style.ClassicFactory;
import com.higgsup.abstractpatternt.style.ModernFactory;
import com.higgsup.abstractpatternt.style.StyleFactoryInterface;

public class FactoryStyle {
    public static StyleFactoryInterface getFactory(TypeStyle typeStyle) {
        switch (typeStyle) {
            case MODERN: {
                return new ModernFactory();
            }
            case CLASSIC: {
                return new ClassicFactory();
            }
        }
        return null;
    }
}
