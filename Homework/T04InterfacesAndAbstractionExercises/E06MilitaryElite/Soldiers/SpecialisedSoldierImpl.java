package T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Enums.Corps;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.SpecialisedSoldier;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {
    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    @Override
    public Corps getCorps() {
        return corps;
    }
}
