package T04InterfacesAndAbstraction.E01CarShop.E02SayHello;

public abstract class BasePerson implements Person {
    private String name;

    public BasePerson(String name) {
        this.setName(name);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
