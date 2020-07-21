import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import tripservice.TripService;
import tripservice.User;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.Mockito.verify;

public class TripServiceTest {

    @Mock
    private TripService service;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void assertionExamples() {
        then("hello trip").isEqualTo("hello trip");
        User user = new User();
        service.getTripsByUser(user);
        verify(service).getTripsByUser(user);
    }
}