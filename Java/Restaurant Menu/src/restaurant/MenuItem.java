package restaurant;

//2. Each menu item has a price, description, and category (appetizer, main course, or dessert)
//3. It should be possible to display whether a menu item is new or not

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    //menuItem constructor
    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsNew() {
        return isNew;
    }

    public String isItemNew() {
        if (this.isNew) {
            return ("This item is new!");
        } else {
            return ("This item is not new!");
        }
    }
}
