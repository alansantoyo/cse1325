package store;

public enum Exposure {
    SHADE, 
    PARTSUN, 
    SUN;

    @Override
    public String toString() {
        if(this == PARTSUN) {
            return "part sun / part shade";
        }
        else if(this == SUN) {
            return "full sun";
        }
        else if(this == SHADE) {
            return "full shade";
        }
        else {
            return "N/A";
        }
    }
}
