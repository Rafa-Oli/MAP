package example;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest { 
    @Test
    public void equilateralTriangleHaveEqualSides() throws Exception {
        Triangle triangle = new Triangle(2, 2, 2);

        assertEquals(TriangleKind.EQUILATERAL, triangle.getKind());
    }

    @Test
    public void scaleneTriangleWithDifferentSides() throws Exception {
        Triangle triangle = new Triangle(5, 8, 7);

        assertEquals(TriangleKind.SCALENE, triangle.getKind());
    }

    @Test
    public void isoscelesTriangleHasTwoEqualSides() throws Exception {
        Triangle triangle = new Triangle(5, 7, 7);

        assertEquals(TriangleKind.ISOSCELES, triangle.getKind());
    }



}
