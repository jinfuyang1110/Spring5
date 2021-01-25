package Spring5.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author Eric
 * @date 2021/1/24 9:55
 */
@Controller
public class Flower {
    @Value("水仙花")
    private String name;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';
    }

}
