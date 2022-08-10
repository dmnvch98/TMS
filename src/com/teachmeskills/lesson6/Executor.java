package com.teachmeskills.lesson6;

import com.teachmeskills.lesson6.atm.ATM;
import com.teachmeskills.lesson6.atm.ATMService;
import com.teachmeskills.lesson6.computer.Computer;
import com.teachmeskills.lesson6.computer.HDD;
import com.teachmeskills.lesson6.computer.RAM;
import com.teachmeskills.lesson6.computer.TypeHDD;
import com.teachmeskills.lesson6.creditCard.CreditCard;
import com.teachmeskills.lesson6.creditCard.CreditCardService;

import static com.teachmeskills.lesson6.Utils.*;

public class Executor {
    public static void main(String[] args) {
        CreditCard creditCardOne = new CreditCard(1346846549234L, 1000);
        CreditCard creditCardTwo = new CreditCard(6546498794654L, 2500);
        CreditCard creditCardThree = new CreditCard(9875646864656L, 6500);
        CreditCardService creditCardService = new CreditCardService();

        creditCardService.fillBalance(creditCardOne, 123);
        creditCardService.fillBalance(creditCardTwo, 545);
        creditCardService.withdrawMoney(creditCardThree, 500);

        print(creditCardOne);
        print(creditCardTwo);
        print(creditCardThree);

        Computer computerOne = new Computer(123, "Comp1");
        computerOne.setHdd(new HDD());
        computerOne.setRam(new RAM());
        print(computerOne);

        Computer computerTwo = new Computer(
                555,
                "Comp1",
                new RAM("RAM1", 16384),
                new HDD("HDD1", 245760, TypeHDD.Internal));
        print(computerTwo);

        ATM atm = new ATM(1, 2, 3);
        ATMService atmService = new ATMService();

        print(BALANCE + atmService.getBalance(atm));
        print(WITHDRAW_STATUS + atmService.withdrawMoney(atm, 390));
        print(BALANCE + atmService.getBalance(atm));
        atmService.fillATM(atm,1, 0, 0);
        print(BALANCE + atmService.getBalance(atm));
        print(WITHDRAW_STATUS + atmService.withdrawMoney(atm, 50));
        print(BALANCE + atmService.getBalance(atm));
    }
}
