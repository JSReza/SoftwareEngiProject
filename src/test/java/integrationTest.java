import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class integrationTest {

    @Test
    public void testExceptionHandling() {
        DataSource mockDataSource = mock(DataSource.class);
        when(mockDataSource.fetchData()).thenThrow(new RuntimeException("Connection failed"));
        assertThrows(RuntimeException.class, mockDataSource::fetchData);
        verify(mockDataSource).fetchData();
    }
}
