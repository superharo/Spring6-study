package online.superh;

import online.superh.ResourceLoaderAware.TestBean;
import online.superh.config.Spring6Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;

/**
 * Unit test for simple App.
 */
public class AppResourceTest
{

    @Test
    public void testResource() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        TestBean bean = context.getBean(TestBean.class);
        Resource resource = bean.getResourceLoader().getResource("testFile.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }

}
