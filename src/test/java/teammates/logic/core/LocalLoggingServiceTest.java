package teammates.logic.core;

import org.testng.annotations.Test;


public class LocalLoggingServiceTest extends BaseLogicTest {

    @Test
    public void testIsExceptionFilterSatisfied() {
        LocalLoggingService service = new LocalLoggingService();

        assertTrue(service.isExceptionFilterSatisfied(null,null));
        //assertFalse(service.isExceptionFilterSatisfied(null,"test"));
    }
}
