package org.example.command.commands;

import org.example.command.CommandInterface;
import org.example.command.actions.Luz;

public class CommandDesligarLuz implements CommandInterface {

    private Luz luz;

    CommandDesligarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }

}
