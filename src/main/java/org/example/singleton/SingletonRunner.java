package org.example.singleton;

public class SingletonRunner {

        public static void main(String[] args) {
            // Obtendo a instância única do Singleton
            Singleton singletonInstance = Singleton.getInstance();

            // Agora você pode usar a instância conforme necessário
            // ...

            //  Testando se será criada uma nova instância ou será
            //  usada a instância já existente
            Singleton singletonInstance1 = Singleton.getInstance();

            // Exemplo: Imprimir alguma informação da instância
            System.out.println("Hashcode da instância: " + singletonInstance.hashCode());
        }
}
