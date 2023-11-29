package org.example.command.commands;

import org.example.command.CommandInterface;
import org.example.command.actions.Luz;

public class CommandLigarLuz implements CommandInterface {

    private Luz luz;

    CommandLigarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }

}
