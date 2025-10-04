package ProgramacionOrientadaObjetos;

public class Person {
    private String name;
    private int age;
    private String id;

    // Constructor principal (con id)
    public Person(String name, int age, String id) {
        this.name = name;
        setAge(age); // usamos el setter para validar edad
        this.id = id;
    }

    // Constructor alternativo (sin id -> se asigna valor por defecto)
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // validación incluida
        this.id = "N/A"; // valor por defecto
    }

    // Getter y Setter de name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    // Getter y Setter de age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0; // valor por defecto si es inválido
        }
    }

    // Getter y Setter de id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null && !id.isBlank()) {
            this.id = id;
        }
    }

    // Método personalizado
    public void sayHello() {
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }

    // toString para imprimir bonito
    @Override
    public String toString() {
        return name + " (" + age + " años, id=" + id + ")";
    }
}
