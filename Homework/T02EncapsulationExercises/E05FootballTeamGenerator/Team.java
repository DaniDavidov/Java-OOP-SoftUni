package T02EncapsulationExercises.E05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("A name should not be empty.");
        } else {
            this.name = name;
        }
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String name) {
        Player player = players.stream().filter(e -> e.getName().equals(name)).findFirst().orElse(null);
        if (player == null) {
            System.out.printf("Player %s is not in %s team.", name, this.name);
        } else {
            this.players.remove(player);
        }

    }

    public double getRating() {
        if (players.isEmpty()) {
            return 0;
        }
        return this.players.stream().mapToDouble(Player::overallSkillLevel).sum() / this.players.size();
    }
}
