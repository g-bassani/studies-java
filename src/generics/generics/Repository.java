package generics.generics;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

    private String name;
    List<T> registers = new ArrayList<>(); // Generic list, multiple Classes

    public Repository(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<T> getRegisters() {
        return registers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRegister(T register) {
        registers.add(register);
    }

    public void removeRegister(T register) {
        registers.remove(register);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":\n");

        for (T r: registers) {
            sb.append(r).append("\n");
        }
        return sb.toString();

    }
}
