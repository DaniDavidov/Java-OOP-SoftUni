package T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.Spy;

public class SpyImpl extends SoldierImpl implements Spy {
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        String output = String.format("Name: %s %s Id: %d", getFirstName(), getLastName(), getId()) + System.lineSeparator();
        output = output + String.format("Code Number: %d", getCodeNumber());
        return output;
    }
}
