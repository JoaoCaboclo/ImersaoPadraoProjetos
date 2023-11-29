package org.example.strategypattern.strategies;

import org.example.strategypattern.contrato.AccessConfiguration;

public class HikevisionAccessConfiguration implements AccessConfiguration {
    @Override
    public void configureAccess() {
        // Lógica de configuração de acesso para HIKEVISION
        System.out.println("Configurando acesso para HIKEVISION");
    }

}
