package gundam.gunpla.com.streamline.model;

public class Automation {

    public static final String VIEW_TAXI = "Cab";
    public static final String VIEW_FOOD_DELIVERY = "Delivery";
    public static final String VIEW_FOOD_GROCERY = "Grocery";

    private String type;
    private String description;
    private String time;
    private String arival;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getArival() {
        return arival;
    }

    public void setArival(String arival) {
        this.arival = arival;
    }

}
