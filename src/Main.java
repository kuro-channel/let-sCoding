/**
 * Mainクラス 実行クラス
 * @author kuroiwatakumi
 *
 */
public class Main {

    /**
     * mainメソッド
     * @param args
     */
    public static void main(String[] args) {
    // hello world!
    System.out.println("Hello world!!");
    // 5-1
    Monster monster = new Monster();
    // 5-2
    System.out.println("名前:" + monster.getName() + "HP:" + monster.getHp());
    // 5-3
    monster.talk();
    // 5-4
    monster.walk(2);
    System.out.println("名前:" + monster.getName() + " HP:" + monster.getHp());
    // 5-6
    monster.walk(10);
    System.out.println("名前:" + monster.getName() + " HP:" + monster.getHp());
    // 5-8
    System.out.println(monster.eat("サラダ"));
    System.out.println("名前:" + monster.getName() + " HP:" + monster.getHp());
    // 5-10
    System.out.println(monster.eat("やきにく"));
    System.out.println("名前:" + monster.getName() + " HP:" + monster.getHp());
    // 5-12
    monster.setName("nahomin");
    // 5-12
    monster.setHp(2000);
    monster.talk();
    System.out.println("名前:" + monster.getName() + " HP:" + monster.getHp());

    }
}
