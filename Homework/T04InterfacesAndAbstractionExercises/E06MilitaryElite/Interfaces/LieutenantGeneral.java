package T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers.PrivateImpl;

import java.util.Set;

public interface LieutenantGeneral extends Private {

    Set<PrivateImpl> getPrivates();
}
