package OOPs;
// Inheritance

class GrantParent{
    int assetValues = 20000000;
}

class Parent extends GrantParent{
    int bankBalance = 500000;

    void behaviour(){
        System.out.println("Always having a smiling face");
    }
}

class Child extends Parent{
    int pocketMoney = 500;
}

public class MyInheritance {
    public static void main(String[] args) {
        Child ram = new Child();

        System.out.println(ram.pocketMoney);
        System.out.println(ram.bankBalance);
        ram.behaviour();
        System.out.println("Asset value:" + ram.assetValues);
    }
}
