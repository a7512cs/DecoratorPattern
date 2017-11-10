
public class Ham extends CondimentDecorator {

    public Ham(Spaghetti pSpaghetti) {
        super(pSpaghetti);
    }

    public String GetDescription() {
        return spa.GetDescription() + ",¤õ»L";
        // ¬Û¦Psuper.GetDescription() + ",¤õ»L";
    }

    public int GetPrice() {
        return spa.GetPrice() + 38;
    }

    public String GetName() {
        return spa.GetName();
    }
}
