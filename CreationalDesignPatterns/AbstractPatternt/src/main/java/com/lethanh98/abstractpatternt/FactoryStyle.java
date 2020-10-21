package com.lethanh98.abstractpatternt;


import com.lethanh98.abstractpatternt.style.ClassicFactory;
import com.lethanh98.abstractpatternt.style.ModernFactory;
import com.lethanh98.abstractpatternt.style.StyleFactoryInterface;

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
