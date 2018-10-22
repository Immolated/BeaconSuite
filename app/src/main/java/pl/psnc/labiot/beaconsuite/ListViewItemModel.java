package pl.psnc.labiot.beaconsuite;

public class ListViewItemModel {
    private String title;
    private String description;
    private int icon;

    //constructor
    public ListViewItemModel(String title, String description, int icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }
}
