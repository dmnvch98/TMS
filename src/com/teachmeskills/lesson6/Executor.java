package com.teachmeskills.lesson6;

import com.teachmeskills.lesson6.atm.ATM;
import com.teachmeskills.lesson6.computer.Computer;
import com.teachmeskills.lesson6.computer.HDD;
import com.teachmeskills.lesson6.computer.RAM;
import com.teachmeskills.lesson6.computer.TypeHDD;
import com.teachmeskills.lesson6.creditCard.CreditCard;

import static com.teachmeskills.lesson6.Utils.*;

public class Executor {
    public static void main(String[] args) {
        CreditCard creditCardOne = new CreditCard(1346846549234L, 1000);
        CreditCard creditCardTwo = new CreditCard(6546498794654L, 2500);
        CreditCard creditCardThree = new CreditCard(9875646864656L, 6500);

        creditCardOne.fillBalance(123);
        creditCardTwo.fillBalance(545);
        creditCardThree.withdrawMoney(500);

        print(creditCardOne.toString());
        print(creditCardTwo.toString());
        print(creditCardThree.toString());

        Computer computerOne = new Computer(123, "Comp1");
        print(computerOne);
        Computer computerTwo = new Computer(
                555,
                "Comp1",
                new RAM("RAM1", 16384),
                new HDD("HDD1", 245760, TypeHDD.Internal));
        print(computerTwo);

        ATM atm = new ATM(1, 2, 3);
        print(BALANCE + atm.getBalance());

        print(WITHDRAW_STATUS + atm.withdrawMoney(390));
        print(BALANCE + atm.getBalance());

        atm.fillATM(1, 0, 0);
        print(BALANCE + atm.getBalance());
        print(WITHDRAW_STATUS + atm.withdrawMoney(390));
        print(BALANCE + atm.getBalance());
    }
}
