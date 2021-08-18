import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void createObject(){rectangle = new Rectangle();}

    // Area of Rectangle

    @Test
    public void toGetAreaFortyFiveHavingDimensionsFiveAndNine(){assertEquals(45, rectangle.area(5, 9));}

    @Test
    public void toGetAreaZeroHavingDimensionsFiveAndZero(){assertEquals(0, rectangle.area(5, 0));}

    @Test
    public void toGetAreaZeroHavingDimensionsMinusFiveAndMinusFive(){assertEquals(0, rectangle.area(-5, -5));}

    @Test
    public void toGetAreaZeroHavingDimensionsMinusFiveAndFive(){assertEquals(0, rectangle.area(-5, 5));}

    // Perimeter of Rectangle

    @Test
    public void toGetPerimeterTwentyHavingDimensionsFiveAndFive(){assertEquals(20, rectangle.perimeter(5, 5));}

    @Test
    public void toGetPerimeterZeroHavingDimensionsFiveAndZero(){assertEquals(0, rectangle.perimeter(5, 0));}

    @Test
    public void toGetPerimeterZeroHavingDimensionsFiveAndMinusFive(){assertEquals(0, rectangle.perimeter(-5, -5));}

    @Test
    public void toGetPerimeterZeroHavingDimensionsFiveAndFive(){assertEquals(0, rectangle.perimeter(-5, 5));}
}
