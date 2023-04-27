package omi11.dishes;

public class DummyItem implements Iteml {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public ItemType getType() {
        return null;
    }

    @Override
    public float getPrice() {
        return 0;
    }

    @Override
    public String getMenuText(String width) {
        return null;
    }
}
