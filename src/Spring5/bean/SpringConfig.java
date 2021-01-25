package Spring5.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Eric
 * @date 2021/1/24 10:04
 */
@Configuration
@ComponentScan(basePackages = {"Spring5"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
