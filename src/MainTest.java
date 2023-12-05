import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    OffsetDateTime date2 = OffsetDateTime.parse("2019-10-15T13:00:00Z");
    @Test
    void testMediumlDate () {
        String result = testing.mediumFormat(date);
        assertEquals("1 mar 2023",result);
    }
    @Test
    void testMediumlDate2 () {
        String result = testing.mediumFormat(date2);
        assertEquals("15 ott 2019",result);
    }
}