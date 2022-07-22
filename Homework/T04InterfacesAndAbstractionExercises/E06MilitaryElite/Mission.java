package T04InterfacesAndAbstractionExercises.E06MilitaryElite;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Enums.State;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    public void completeMission() {
        this.state = State.finished;
    }

    public String getCodeName() {
        return codeName;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", codeName, state.name());
    }
}
