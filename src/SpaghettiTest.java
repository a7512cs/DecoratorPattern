
public class SpaghettiTest {

    public static void main(String[] args) {

        System.out.println("----�q�j�Q�\�]���----");

        Spaghetti normalSpaghetti = new NormalSpaghetti(); // ���ͥ����q�j�Q��
        System.out.println(normalSpaghetti.GetName());
        System.out.println(normalSpaghetti.GetDescription());
        System.out.println(normalSpaghetti.GetPrice());
        
        normalSpaghetti = new Ham(normalSpaghetti); // �[�I���L
        System.out.println(normalSpaghetti.GetName());
        System.out.println(normalSpaghetti.GetDescription());
        System.out.println(normalSpaghetti.GetPrice());
        
        normalSpaghetti = new Egg(normalSpaghetti); // �[�I�J
        normalSpaghetti = new Cheese(normalSpaghetti); // �[�I�_�q
        System.out.println(
                "�W��:" + normalSpaghetti.GetName() + 
                " ����:" + normalSpaghetti.GetPrice() + 
                " ����:" + normalSpaghetti.GetDescription());

    }

}
