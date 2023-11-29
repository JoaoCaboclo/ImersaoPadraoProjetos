package org.example.command.commands;

import org.example.command.RemoteControl;
import org.example.command.actions.Luz;

// Cliente
public class RemoteControlRunner {

    public static void main(String[] args) {

        Luz minhaLuz = new Luz();
        CommandLigarLuz ligarLuz = new CommandLigarLuz(minhaLuz);
        CommandDesligarLuz desligarLuz = new CommandDesligarLuz(minhaLuz);

         RemoteControl controle = new RemoteControl();

        controle.setComando(ligarLuz);
        controle.pressionarBotao();

        controle.setComando(desligarLuz);
        controle.pressionarBotao();
    }

}
