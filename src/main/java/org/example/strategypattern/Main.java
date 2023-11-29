package org.example.strategypattern;

import org.example.strategypattern.contexto.AccessConfigurationContext;
import org.example.strategypattern.contrato.AccessConfiguration;
import org.example.strategypattern.strategies.DimepAccessConfiguration;
import org.example.strategypattern.strategies.HikevisionAccessConfiguration;

public class Main {

    public static void main(String[] args) {

        // Criando instâncias das configurações de acesso específicas
        AccessConfiguration dimepConfig = new DimepAccessConfiguration();
        AccessConfiguration hikevisionConfig = new HikevisionAccessConfiguration();

        // Criando o contexto com a configuração de acesso específica desejada
        AccessConfigurationContext context = new AccessConfigurationContext(dimepConfig);

        // Configurando o acesso usando a estratégia escolhida
        context.configureAccess();

        // Mudando dinamicamente para outra configuração de acesso
        context.setAccessConfiguration(hikevisionConfig);
        context.configureAccess();

    }

}
