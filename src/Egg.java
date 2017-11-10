
public class Egg extends CondimentDecorator {

    public Egg(Spaghetti pSpaghetti) {
        super(pSpaghetti);
    }

    public String GetDescription() {
        return super.GetDescription() + ",³J";
    }

    public int GetPrice() {
        return super.GetPrice() + 5;
    }

    public String GetName() {
        return super.GetName();
    }
}
