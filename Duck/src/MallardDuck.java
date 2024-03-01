public class MallardDuck extends Duck{
    public MallardDuck(){
        //assign its fly behavior and quack behavior
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }


    public void display(){
        System.out.println("I'm a real mallard duck");
    }

}
