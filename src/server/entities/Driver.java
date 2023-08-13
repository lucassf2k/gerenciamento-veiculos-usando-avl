package server.entities;

public class Driver {
    private String name;
    private String cpf;

    public Driver() {}

    public Driver(String name, String cpf) {
        this.setName(name);
        this.setCpf(cpf);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
