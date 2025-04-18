package org.creation.builder;

public class User {
    // Campos obrigatórios
    private final String firstName;
    private final String lastName;

    // Campos opcionais
    private final int age;
    private final String phone;
    private final String address;

    // Construtor privado que recebe o Builder
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Builder interno
    public static class Builder {
        // Campos obrigatórios
        private final String firstName;
        private final String lastName;

        // Campos opcionais
        private int age = 0;
        private String phone = "";
        private String address = "";

        // Construtor do builder com campos obrigatórios
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Métodos do builder para campos opcionais
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // Método final de construção
        public User build() {
            return new User(this);
        }
    }

    // Getters (opcional, para demonstração)
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
}

