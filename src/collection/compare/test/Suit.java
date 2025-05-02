package collection.compare.test;

public enum Suit {

    SPADE("♠️"),
    HEART("❤️"),
    DIAMOND("💎️"),
    CLOVER("♠");

    private String  icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
