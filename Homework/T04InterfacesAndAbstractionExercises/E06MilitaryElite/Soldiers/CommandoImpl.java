package T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Enums.Corps;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.Commando;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Mission;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new LinkedHashSet<>();
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    @Override
    public Collection<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {
        //"Name: {firstName} {lastName} Id: {id} Salary: {salary}
        //Corps: {corps}
        //Missions:
        //  {mission1 ToString()}
        //  {mission2 ToString()}
        //  …
        //  {missionN ToString()}"

        return super.toString() + System.lineSeparator() +
                "Missions:" + (missions.isEmpty() ? "" : System.lineSeparator() +
                missions.stream().
                        map(m -> "  " + m).
                        collect(Collectors.joining(System.lineSeparator())));
    }
}
