public abstract class Duck {

    /* Declare two reference variables
        for the behavior interface types.
        All duc subclasses (in the same package)
        inherit these
    */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        // Delegate to the behavior class
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
