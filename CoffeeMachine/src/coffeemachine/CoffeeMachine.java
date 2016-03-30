package coffeemachine;

public class CoffeeMachine {

    public Coffee prepareNewCoffe(String type) {
        Coffee coffee = new Coffee();
        coffee.setType(type);
        return coffee;
    }

}
