public class Customer extends Person {
    public enum FidelityCard {
        ANS_12_25,
        SENIOR,
        GRAND_VOYAGEUR
    }

    private Integer id;
    private FidelityCard fidelityCard;

    public Customer(String name, String surname, Integer id) {
        super(name, surname);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FidelityCard getFidelityCard() {
        return fidelityCard;
    }

    public void setFidelityCard(FidelityCard fidelityCard) {
        this.fidelityCard = fidelityCard;
    }
}
