package T04InterfacesAndAbstraction.E01CarShop;

public interface Car {
    int TIRES = 4;

    String getModel();
    String getColor();
    int getHorsePower();
    String countryProduced();
}