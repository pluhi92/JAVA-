package com.zetcode;

public class Inheritance {
    public static void main(String[] args) {

        AddSubMul obj = new AddSubMul();

        obj.num1 = 5;
        obj.num2 = 4;

        obj.sum();
        System.out.println(obj.result);
        obj.sub();
        System.out.println(obj.result);
        obj.multi();
        System.out.println(obj.result);
    }
}

//single level
class Add {
    int num1, num2, result;

    public void sum() {
        result = num1 + num2;
    }
}

class AddSub extends Add {
    int num1, num2, result;

    public void sum() {
        result = num1 + num2;
    }

    public void sub() {
        result = num1 - num2;
    }
}

//multi level
class AddSubMul extends AddSub {

    public void multi() {

        result = num1 * num2;
    }
}

