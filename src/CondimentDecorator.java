
public class CondimentDecorator implements Spaghetti {

    Spaghetti spa;

    public CondimentDecorator(Spaghetti S) {
        this.spa = S;
    }

    public int GetPrice() {
        return spa.GetPrice();
    }

    public String GetName() {
        return spa.GetName();
    }

    public String GetDescription() {
        return spa.GetDescription();
    }
}
