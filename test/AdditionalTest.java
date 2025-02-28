import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AdditionalTest {

    @Mock
    private DataService dataServiceMock;

    private UserManager userManager;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        userManager = new UserManager(dataServiceMock);
    }

    @Test
    public void testCreateUserWithNullUsername() {
        // Testing edge case: null username
        when(dataServiceMock.isUsernameTaken(null)).thenReturn(false);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            userManager.createUser(null, "password123");
        });

        assertEquals("Username cannot be null or empty", exception.getMessage());
        verify(dataServiceMock, never()).saveUser(any());
    }

    @Test
    public void testCreateUserWithExistingUsername() {
        // Testing duplicate username scenario
        when(dataServiceMock.isUsernameTaken("existingUser")).thenReturn(true);

        boolean result = userManager.createUser("existingUser", "password123");

        assertFalse("Should return false for existing username", result);
        verify(dataServiceMock, never()).saveUser(any());
    }

    @Test
    public void testCreateUserSuccessful() {
        // Testing happy path scenario
        when(dataServiceMock.isUsernameTaken("newUser")).thenReturn(false);
        when(dataServiceMock.saveUser(any())).thenReturn(true);

        boolean result = userManager.createUser("newUser", "password123");

        assertTrue("Should return true for successful creation", result);
        verify(dataServiceMock).saveUser(any());
    }
}
