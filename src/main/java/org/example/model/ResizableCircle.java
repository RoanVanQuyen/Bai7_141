package org.example.model;

import org.example.ipm.Resizable;
import org.example.model.Circle;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle() {
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100;
    }

}
