package src.enums;

public enum BrazilianState {
    PI("Piaui", "PI"),
    MA("Maranhão","MA"),
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ"),
    BA("Bahia", "BA");

    private String name;
    private String acronym;
    private BrazilianState (String name, String acronym) {
        this.name = name;
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public String getAcronym() {
        return acronym;
    }
}
