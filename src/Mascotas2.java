public class Mascotas2 {

    private String nom;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacuna;

    public Mascotas2(String nom, String especie, int edad, double peso) {
        this.nom = nom;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacuna = false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    public Mascotas2() {

    }

    @Override
    public String toString() {
        return "Mascotas2{" +
                "nom='" + nom + '\'' +
                ", especie='" + especie + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacuna=" + vacuna +
                '}';
    }
    public void vacunar() {
        this.vacuna = true;
        System.out.println(" -" + nom + " ha sido vacunado/a.");
    }


    public void alimentar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("️  Error: no se permiten cantidades negativas.");
        } else {
            this.peso += cantidad;
            System.out.println(" " + nom + " fue alimentado/a. Nuevo peso: " + peso + " kg.");
        }
    }


    public void cumplirAnios() {
        this.edad++;
        System.out.println(" " + nom + " cumplió un año más Edad actual: " + edad);
    }
    public void mostrarDatos(){
        System.out.println("─────────────────────────────────");
        System.out.println(" INFORMACIÓN DE LA MASCOTA");
        System.out.println("─────────────────────────────────");
        System.out.println("  Nombre  : " + nom);
        System.out.println("  Especie : " + especie);
        System.out.println("  Edad    : " + edad + " año(s)");
        System.out.println("  Peso    : " + peso + " kg");
        System.out.println("  Vacunado: "+ vacuna +" ");

    }
}
