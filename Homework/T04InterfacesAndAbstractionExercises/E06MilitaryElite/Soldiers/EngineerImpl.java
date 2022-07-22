package T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Enums.Corps;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.Engineer;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Repair;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new LinkedHashSet<>();
    }


    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }


    @Override
    public Collection<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        //"Name: {firstName} {lastName} Id: {id} Salary: {salary}
        //Corps: {corps}
        //Repairs:
        //  {repair1 ToString()}
        //  {repair2 ToString()}
        //  …
        //  {repairN ToString()}"

        return super.toString() + System.lineSeparator() +
                "Repairs:" + (repairs.isEmpty() ? "" : System.lineSeparator() +
                repairs.stream().
                        map(r -> "  " + r).
                        collect(Collectors.joining(System.lineSeparator())));
    }
}
