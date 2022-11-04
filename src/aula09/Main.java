package aula09;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Wendel", 37, "M");
        p[1] = new Pessoa("Jane", 36, "F");

        l[0] = new Livro("Como programar Java", "Deitel", 970, p[0]);
        l[1] = new Livro("Spring Boot: Acelere o desenvolvimento de microsserviços", "Fernando Boaglio", 210, p[0]);

        l[0].abrir();
        l[0].folhear(970);
        System.out.println(l[0].detalhes());
    }
}
