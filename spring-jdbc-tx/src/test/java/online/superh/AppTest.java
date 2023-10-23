package online.superh;

import online.superh.config.Spring6Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testTxAllAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);

    }
}
