package example1;

public enum InstrumentType {

    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;
    public String toString() {
        switch (this) {
            case BASS: return "Bass";
            case DOBRO: return "Dobro";
            case FIDDLE: return "Fiddle";
            case BANJO: return "Banjo";
            case GUITAR: return "Guitar";
            case MANDOLIN: return "Mandolin";
            default: return "unspecified";
        }
    }
}
