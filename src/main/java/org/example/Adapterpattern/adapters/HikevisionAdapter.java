package org.example.Adapterpattern.adapters;

import org.example.Adapterpattern.contrato.AccessConfiguration;
import org.example.Adapterpattern.regras.HikevisionAccessConfiguration;

public class HikevisionAdapter implements AccessConfiguration {

    private HikevisionAccessConfiguration hikevisionConfig;

    public HikevisionAdapter(HikevisionAccessConfiguration hikevisionConfig) {
        this.hikevisionConfig = hikevisionConfig;
    }

    @Override
    public void configureAccess() {
        hikevisionConfig.configureHikevisionAccess();
    }

}
