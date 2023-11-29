package org.example.Adapterpattern;

import org.example.Adapterpattern.adapters.DimepAdapter;
import org.example.Adapterpattern.adapters.HikevisionAdapter;
import org.example.Adapterpattern.contrato.AccessConfiguration;
import org.example.Adapterpattern.regras.DimepAccessConfiguration;
import org.example.Adapterpattern.regras.HikevisionAccessConfiguration;

public class AdapterRunner {

    public static void main(String[] args) {

        // Criando instâncias das configurações específicas
        DimepAccessConfiguration dimepConfig = new DimepAccessConfiguration();
        HikevisionAccessConfiguration hikevisionConfig = new HikevisionAccessConfiguration();

        // Criando adaptadores para as configurações específicas
        AccessConfiguration dimepAdapter = new DimepAdapter(dimepConfig);
        AccessConfiguration hikevisionAdapter = new HikevisionAdapter(hikevisionConfig);

        // Configurando o acesso usando os adaptadores
        dimepAdapter.configureAccess();
        hikevisionAdapter.configureAccess();
    }

}
