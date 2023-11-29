package org.example.Adapterpattern.adapters;

import org.example.Adapterpattern.contrato.AccessConfiguration;
import org.example.Adapterpattern.regras.DimepAccessConfiguration;

public class DimepAdapter implements AccessConfiguration {

    private DimepAccessConfiguration dimepConfig;

    public DimepAdapter(DimepAccessConfiguration dimepConfig) {
        this.dimepConfig = dimepConfig;
    }

    @Override
    public void configureAccess() {
        dimepConfig.configureDimepAccess();
    }

}
