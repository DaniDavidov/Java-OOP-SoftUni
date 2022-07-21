package T04InterfacesAndAbstraction.E01CarShop.E02SayHello;

public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }


    public String sayHello() {
        return "Здравей";
    }
}
