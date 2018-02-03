/**
 * Monsterクラス
 * @author kuroiwatakumi
 *
 */
public class Monster {

    // モンスター名
    private String name = "なほみん";
    // HP
    private int hp = 250;
    // 焼肉
    private final static String yakiniku = "やきにく";

    /**
     * 話す
     * @param なし
     * @return なし
     */
    public void talk(){
        System.out.println("こんちは！私の名前は、" + this.name + "だよ！");
    }

    /**
     * 歩く
     * @param 歩く分数
     * @return なし
     */
    public void walk(int steps){
        // 歩く分数 * 20 をHPから減らす
        int damage = hp - (steps * 20);
        this.setHp(damage);
        System.out.println(steps + "分さんぽしたよ！");

        // HPが50以下の場合はコンソールにメッセージ出力
        if(this.hp <= 50){
            System.out.println("お腹空いたな、、");
        }
    }

    /**
     * 食べる
     * @param 食べ物
     * @return String お礼
     */
    public String eat(String food){
        // 食べ物が焼肉だった場合、HPを100増やす
        if(food.equals(yakiniku)){
            this.setHp(this.hp + 100);
            return "おおおぉぉ!!!!!やきにく!!!!!ありがとう!!!!!";
        }
        this.setHp(this.hp + 10);
        return "おお," + food + "をくれるの？ありがとう!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
