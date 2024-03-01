public class MiniDuckSimulator {

    public static void main(String[] args){

        MallardDuck littleDuck = new MallardDuck();
        littleDuck.display();
        littleDuck.performFly();
        littleDuck.performQuack();
        littleDuck.swim();
        System.out.println("---------");
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocket());
        modelDuck.performFly();


    }



}
