
public class SpaghettiTest {

    public static void main(String[] args) {

        System.out.println("----義大利餐館菜單----");

        Spaghetti normalSpaghetti = new NormalSpaghetti(); // 產生平民義大利麵
        System.out.println(normalSpaghetti.GetName());
        System.out.println(normalSpaghetti.GetDescription());
        System.out.println(normalSpaghetti.GetPrice());
        
        normalSpaghetti = new Ham(normalSpaghetti); // 加點火腿
        System.out.println(normalSpaghetti.GetName());
        System.out.println(normalSpaghetti.GetDescription());
        System.out.println(normalSpaghetti.GetPrice());
        
        normalSpaghetti = new Egg(normalSpaghetti); // 加點蛋
        normalSpaghetti = new Cheese(normalSpaghetti); // 加點起司
        System.out.println(
                "名稱:" + normalSpaghetti.GetName() + 
                " 價錢:" + normalSpaghetti.GetPrice() + 
                " 材料:" + normalSpaghetti.GetDescription());

    }

}
