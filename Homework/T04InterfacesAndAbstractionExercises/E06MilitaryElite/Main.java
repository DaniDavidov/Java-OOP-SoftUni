package T04InterfacesAndAbstractionExercises.E06MilitaryElite;

import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Enums.Corps;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Enums.State;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.Private;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Interfaces.Soldier;
import T04InterfacesAndAbstractionExercises.E06MilitaryElite.Soldiers.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Soldier> soldierMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        while (!"End".equals(line = scanner.nextLine())) {
            String[] data = line.split("\\s+");
            String soldierType = data[0];
            int id = Integer.parseInt(data[1]);
            String firstName = data[2];
            String lastName = data[3];
            double salary;

            switch (soldierType) {
                case "Private":
                    createPrivate(data, id, firstName, lastName);
                    break;
                case "LieutenantGeneral":
                    createLieutenantGeneral(data, id, firstName, lastName);
                    break;
                case "Engineer":
                    createEngineer(data, id, firstName, lastName);
                    break;
                case "Commando":
                    createCommando(data, id, firstName, lastName);
                    break;
                case "Spy":
                    createSpy(data, id, firstName, lastName);
                    break;
            }
        }

        soldierMap.forEach((integer, soldier) -> System.out.println(soldier.toString()));
    }

    private static void createSpy(String[] data, int id, String firstName, String lastName) {
        int codeNumber = Integer.parseInt(data[4]);
        SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);

        soldierMap.put(id, spy);
    }

    private static void createCommando(String[] data, int id, String firstName, String lastName) {
        try {
            double salary = Double.parseDouble(data[4]);
            Corps corps = Corps.valueOf(data[5]);
            CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, corps);

            for (int i = 6; i < data.length; i+=2) {
                try {
                    String codeName = data[i];
                    State state = State.valueOf(data[i+1]);
                    Mission mission = new Mission(codeName, state);
                    commando.addMission(mission);
                } catch (IllegalArgumentException ignored) {

                }
            }
            soldierMap.put(id, commando);

        } catch (IllegalArgumentException ignored) {

        }
    }

    private static void createEngineer(String[] data, int id, String firstName, String lastName) {
        try {
            double salary = Double.parseDouble(data[4]);
            Corps corps = Corps.valueOf(data[5]);
            EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corps);

            for (int i = 6; i < data.length; i += 2) {
                String repairPart = data[i];
                int repairHours = Integer.parseInt(data[i+1]);
                Repair repair = new Repair(repairPart, repairHours);
                engineer.addRepair(repair);
            }
            soldierMap.put(id, engineer);

        } catch (IllegalArgumentException ignored) {
        }


    }

    private static void createLieutenantGeneral(String[] data, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(data[4]);
        LieutenantGeneralImpl lieutenantGeneral = new LieutenantGeneralImpl(id, firstName, lastName, salary);
        for (int i = 5; i < data.length; i++) {
            int privateId = Integer.parseInt(data[i]);
            PrivateImpl privateSoldier = (PrivateImpl) soldierMap.get(privateId);
            lieutenantGeneral.addPrivate(privateSoldier);
        }
        soldierMap.put(id, lieutenantGeneral);
    }

    private static void createPrivate(String[] data, int id, String firstName, String lastName) {
        double salary = Double.parseDouble(data[4]);
        Private privateSoldier = new PrivateImpl(id, firstName, lastName, salary);
        soldierMap.put(id, privateSoldier);
    }
}
