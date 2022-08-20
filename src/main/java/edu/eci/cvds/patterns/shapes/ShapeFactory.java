package edu.eci.cvds.patterns.shapes;

import static edu.eci.cvds.patterns.shapes.RegularShapeType.Triangle;

public class ShapeFactory {
    public static Shape create(RegularShapeType type){
        switch (type){
            case Triangle:
                ;
                break;
        }
    }
}
