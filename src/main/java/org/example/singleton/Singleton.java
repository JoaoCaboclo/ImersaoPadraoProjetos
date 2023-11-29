package org.example.singleton;

public class Singleton {
    // A instância única da classe
    private static Singleton instance;

    // Construtor privado para evitar a criação de instâncias fora da classe
    private Singleton() {
        // Inicializações, se necessário
    }

    // Método para obter a instância única (criando-a, se necessário)
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Métodos da classe, se houver
}
