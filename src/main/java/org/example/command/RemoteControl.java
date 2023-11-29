package org.example.command;

// Invoker
public class RemoteControl {

    private CommandInterface comando;

    public void setComando(CommandInterface comando) {
        this.comando = comando;
    }

    public void pressionarBotao() {
        comando.executar();
    }

}
