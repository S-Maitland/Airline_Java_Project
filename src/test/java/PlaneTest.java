import javafx.scene.layout.Pane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(416, this.plane.getCapacityFromEnum());
    }

    @Test
    public void canGetMaxPayload(){
        assertEquals(875000, this.plane.getTotalWeightFromEnum());
    }



}
