package T02EncapsulationExercises.E05FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Team> teams = new LinkedHashMap<>();

        String line;
        while (!"END".equals(line = scanner.nextLine())) {
            String[] data = line.split(";");
            String command = data[0];

            switch (command) {
                case "Team":
                    Team team = new Team(data[1]);
                    teams.putIfAbsent(data[1], team);
                    break;
                case "Add":
                    String teamName = data[1];
                    String playerName = data[2];
                    Team team1 = teams.get(teamName);
                    if (team1 != null) {
                        Player player = new Player(playerName, Integer.parseInt(data[3]), Integer.parseInt(data[4]),
                                Integer.parseInt(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                        team1.addPlayer(player);

                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }

                    break;
                case "Remove":
                    teamName = data[1];
                    playerName = data[2];
                    team1 = teams.get(teamName);
                    if (team1 != null) {
                        team1.removePlayer(playerName);
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }

                    break;
                case "Rating":
                    teamName = data[1];
                    team1 = teams.get(teamName);
                    if (team1 != null) {
                        double stats = team1.getRating();
                        System.out.printf("%s - %.0f", teamName, stats);
                    } else {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    }
                    break;
            }
        }
    }
}
