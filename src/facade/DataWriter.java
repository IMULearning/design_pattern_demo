package facade;

import java.util.Map;

public class DataWriter {

    private DataWriter() {
    }

    public static void API() {
        Map<String, String> data = Database.getProps();
        data.forEach((s, s2) -> {
            Writer.write(s);
            Writer.write(s2);
        });
    }
}
