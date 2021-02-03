package com.lethanh98.StructuralPatterns.bridge.example1;

import com.lethanh98.StructuralPatterns.bridge.example1.color.Color;
import com.lethanh98.StructuralPatterns.bridge.example1.type.Type;

public class Image {
    private Color color;
    private Type type;

    public Image(Color color, Type type) {
        this.color = color;
        this.type = type;
    }
}
