public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){};

    //call
    public void performFly(){
        flyBehavior.fly();

    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("all duck can swim!");
    }
}
