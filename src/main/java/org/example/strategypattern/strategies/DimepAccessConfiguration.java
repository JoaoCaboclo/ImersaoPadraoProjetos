package org.example.strategypattern.strategies;

import org.example.strategypattern.contrato.AccessConfiguration;

public class DimepAccessConfiguration implements AccessConfiguration {

    @Override
    public void configureAccess() {
        // Lógica de configuração de acesso para DIMEP
        System.out.println("Configurando acesso para DIMEP");
    }

}
