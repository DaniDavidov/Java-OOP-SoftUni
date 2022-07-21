package T04InterfacesAndAbstraction.E01CarShop.E02SayHello;

public class European extends BasePerson implements Person {

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
