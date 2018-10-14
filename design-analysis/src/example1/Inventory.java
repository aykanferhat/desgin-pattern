package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {

    private final List<Instrument> inventories = new ArrayList<>();

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {

        Instrument instrument = new Instrument(serialNumber, price, instrumentSpec);
        addInventory(instrument);
    }

    public void addInventory(Instrument instrument) {
        this.inventories.add(instrument);
    }

    public List<Instrument> search(InstrumentSpec instrumentSpec) {
        return inventories.stream()
                .filter(instrument -> instrumentSpec.matches(instrument.getInstrumentSpec()))
                .collect(Collectors.toList());
    }

}
