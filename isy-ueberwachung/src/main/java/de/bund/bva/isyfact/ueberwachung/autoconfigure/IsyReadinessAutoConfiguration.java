package de.bund.bva.isyfact.ueberwachung.autoconfigure;

@ConfigurationProperties(prefix = "isy.ueberwachung.nachbarsysteme.beispielnachbar.systemname")
public class IsyReadinessAutoConfiguration {
    private List<String> systems;

    // todo: add getter and setter etx.
}
