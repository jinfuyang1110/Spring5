package Spring5.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Eric
 * @date 2021/1/23 17:41
 */
public class Stu {
    private String[]arr;
    private List<String> list;
    private Map<String,String> maps;
    private Set<String> sets;
    private List<Actor> actors;

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", actors=" + actors +
                '}';
    }
}
