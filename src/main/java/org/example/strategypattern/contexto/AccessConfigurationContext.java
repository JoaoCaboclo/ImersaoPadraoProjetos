package org.example.strategypattern.contexto;

import org.example.strategypattern.contrato.AccessConfiguration;

public class AccessConfigurationContext {

    private AccessConfiguration accessConfiguration;

    public AccessConfigurationContext(AccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
    }

    public void setAccessConfiguration(AccessConfiguration accessConfiguration) {
        this.accessConfiguration = accessConfiguration;
    }

    public void configureAccess() {
        accessConfiguration.configureAccess();
    }

}
