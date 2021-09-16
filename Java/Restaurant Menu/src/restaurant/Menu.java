package restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    //1. The menu consists of several menu items.
    //4. The app should know when the menu was last updated, so visitors can see that the restaurant
    // is constantly changing and adding exciting items.

    //menu constructor with date last updated and a list of food items
    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated(Date lastUpdated) {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}
