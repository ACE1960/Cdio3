package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class WalletTest {



        @Test
        void walletCanAddMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(50);
            auto.UpdateMoney();
            Assertions.assertEquals(1050, auto.getMoney());
        }

        @Test
        void walletCanSubtractMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(-50);
            auto.UpdateMoney();
            Assertions.assertEquals(950, auto.getMoney());
        }

        @Test
        void walletCanStoreMoney() {
            var auto = new Wallet(1000);
            auto.setSquareMoney(50);
            auto.UpdateMoney();
            auto.setSquareMoney(50);
            auto.UpdateMoney();
            Assertions.assertEquals(1100, auto.getMoney());
        }
    }

