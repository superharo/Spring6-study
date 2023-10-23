package online.superh.ResourceLoaderAware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-23 14:25
 */
@Component
public class TestBean implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public  ResourceLoader getResourceLoader(){
        return resourceLoader;
    }

}
