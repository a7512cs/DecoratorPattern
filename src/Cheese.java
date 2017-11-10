
public class Cheese extends CondimentDecorator {

    public Cheese(Spaghetti pSpaghetti) {
        super(pSpaghetti);
    }

    public String GetDescription() {
        return super.GetDescription() + ",°_¥q";
    }

    public int GetPrice() {
        return super.GetPrice() + 20;
    }

    public String GetName() {
        return super.GetName();
    }
}
