package dnd;

public enum BodyType {

    ONE("Body type One"),
    TWO("Body type Two"),
    THREE("Body type Three");

    private final String label;

    BodyType(String getString) {
        this.label = getString;
    }

    public String getLabel() {
        return this.label;
    }

}
