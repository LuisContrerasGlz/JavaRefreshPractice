package EjemplosHerencia;

class Eagle extends Bird {
    @Override
    public void fly() {
        super.fly(); // llama al comportamiento base
        System.out.println("Eagle soars high with powerful wings!");
    }
}
