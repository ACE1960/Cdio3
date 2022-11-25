package Fields;

import org.junit.jupiter.api.Test;
import org.example.Wallet;
import org.junit.jupiter.api.Assertions;
import org.example.Player;
import static org.junit.jupiter.api.Assertions.*;

class BuyableFieldTest {

    @org.junit.jupiter.api.Test
    void manKanKøbeEtFelt() {
        var auto = new BuyableField("Hus", "rød", 20, 5);
        Player player1 = new Player(10);
        Player player2 = new Player(10);
        auto.landOndField(player1, player2);
        auto.landOndField(player2, player1);
        Assertions.assertEquals(5, player2.myWallet.getMoney());
    }
    @org.junit.jupiter.api.Test
    void ManKanBetaleleje() {
        var auto = new BuyableField("hus","rød",20,5);
        Player player1 = new Player(10);
        Player player2 = new Player(10);
        auto.isOwned();
        auto.landOndField(player1, player2);
        auto.landOndField(player1, player2);

        Assertions.assertEquals(5, player1.myWallet.getMoney());
    }

    @org.junit.jupiter.api.Test
    void ManKanFåleje() {
        var auto = new BuyableField("hus","rød",20,5);
        Player player1 = new Player(10);
        Player player2 = new Player(10);

        auto.landOndField(player1, player2);
        auto.landOndField(player2, player1);

        Assertions.assertEquals(10, player1.myWallet.getMoney());
    }
}