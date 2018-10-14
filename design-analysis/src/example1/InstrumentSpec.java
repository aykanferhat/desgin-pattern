package example1;

import java.util.HashMap;
import java.util.Map;

public class InstrumentSpec {

    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = properties;
        }
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public Object getProperty(String key) {
        return properties.get(key);
    }

    public boolean matches(InstrumentSpec instrumentSpec) {
        for (Map.Entry<String, Object> entry: instrumentSpec.getProperties().entrySet()) {
            if (!this.properties.get(entry.getKey()).equals(instrumentSpec.getProperties().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
