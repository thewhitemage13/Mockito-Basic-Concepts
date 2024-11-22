import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.thewhitemage13.Car;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CarTest {
    @Mock
    Car car;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createCar() {
        //Car car = Mockito.mock(Car.class);
        Assertions.assertEquals(null, car.getManufacturer());
    }

    @Test
    void remoteServiceReturnValue() {
        //Car car = Mockito.mock(Car.class);
        when(car.testInt(4)).thenReturn(10);
        Assertions.assertEquals(10, car.testInt(4));
    }

    @Test
    void getOwner() {
        //Car car = Mockito.mock(Car.class);
        when(car.getOwner()).thenReturn("John");
        assertEquals("John", car.getOwner());
    }

    @Test
    void verificationTest() {
        //Car car = Mockito.mock(Car.class);
        car.getOwner();
        //verify(car).getOwner();
        verify(car, times(1)).getOwner();
    }

}
