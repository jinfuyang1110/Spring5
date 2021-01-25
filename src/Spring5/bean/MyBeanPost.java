package Spring5.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

/**
 * @author Eric
 */
public class MyBeanPost implements BeanPostProcessor {
@Override
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("初始化前");
    return bean;
}
@Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println("初始化后");
    return bean;
    }
}
