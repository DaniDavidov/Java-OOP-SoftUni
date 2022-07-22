package T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.LieutenantGeneral;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.Soldier;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
    private Set<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new LinkedHashSet<>();
    }

    public void addPrivate(PrivateImpl priv) {
        privates.add(priv);
    }

    @Override
    public Set<PrivateImpl> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        //"Name: {firstName} {lastName} Id: {id} Salary: {salary}
        //Privates:
        //  {private1 ToString()}
        //  {private2 ToString()}
        //  …
        //  {privateN ToString()}"
        //Note: privates must be sorted by id in descending order.
        return super.toString() + System.lineSeparator() +
                "Privates:" + (this.privates.isEmpty() ? "" : System.lineSeparator() +
                privates.stream().
                        sorted(Comparator.comparing(Soldier::getId).reversed()).
                        map(p -> "  " + p).
                        collect(Collectors.joining(System.lineSeparator())));
    }
}
