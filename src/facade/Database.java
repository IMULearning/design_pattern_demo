package facade;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private Database() {
    }

    public static Map<String, String> getProps() {
        Map<String, String> m = new HashMap<>();
        m.put("abc", "ABC");
        m.put("dce", "DCE");
        return m;
    }
}
