import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    private Rectangle rectangle;

    @BeforeEach
    public void createObject(){rectangle = new Rectangle();}

    @Test
    public void toGetAreaFortyFiveHavingDimensionsFiveAndNine(){assertEquals(45, rectangle.area(5, 9));}


}
