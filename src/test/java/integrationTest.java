import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class integrationTest {

    @Test
    public void testExceptionHandling() {
        DataSource mockDataSource = mock(DataSource.class);
        when(mockDataSource.fetchData()).thenThrow(new RuntimeException("Connection failed"));
        RuntimeException exception = assertThrows(RuntimeException.class, mockDataSource::fetchData);
        System.out.println("Exception message: " + exception.getMessage());
        assertEquals("Connection failed", exception.getMessage());
    }
}
