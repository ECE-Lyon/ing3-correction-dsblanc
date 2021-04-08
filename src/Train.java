import java.util.List;

public class Train<U extends Wagon> {
    private Integer id;

    private String from;
    private String to;

    private List<U> wagons;

    public Train(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<U> getWagons() {
        return wagons;
    }

    public void setWagons(List<U> wagons) {
        this.wagons = wagons;
    }
}
