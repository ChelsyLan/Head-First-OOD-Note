public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){};

    //setter method to change behavior dynamically
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

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
