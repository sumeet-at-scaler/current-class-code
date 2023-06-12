package FairWork.Lect_Inter_FW;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        // startup code
        HashMap<String, PlayerFW> registry = new HashMap<>();
        registry.put("DumbEnemyFW", new PlayerFW(10, 10, null));
        registry.put("BomberFW", new PlayerFW(50, 50, null));
        registry.put("TankFW", new PlayerFW(100, 100, null));
        registry.put("MachineFW", new PlayerFW(1000, 1000, null));
        // startup code


        Player[] players = new Player[10000];
        for(int i = 0; i < 9000; i++){
            players[i] = new Player();
            players[i].fw = registry.get("DumbEnemyFW");
        }

        // 3 more for loops
    }
}
