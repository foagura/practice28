class Test {
    int id;

    Test() {
        this(0);    // thisを使用してオーバーロードした別のコンストラクタを呼び出している
    }

    Test(int id) {
        this.id = id;    // thisを使用してインスタンス変数[id]にローカル変数[id]を代入している
    }

    void setId(int id) {
        this.id = id;    // thisを使用してインスタンス変数[id]にローカル変数[id]を代入している
    }

    void getId() {
        System.out.println(id);
    }
}

public class Practice28 {
    public static void main(String[] args) {
        Test obj = new Test();
        // obj.setId(100);
        obj.getId();
    }
}
