package aula14;

public class Main {
    public static void main(String[] args) {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Aula 03 de POO");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Wendel", 37, "M", "wlm");
        g[1] = new Gafanhoto("Melina", 3, "F", "mel");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[1], v[0]);
        vis[1] = new Visualizacao(g[1], v[1]);
        vis[2] = new Visualizacao(g[1], v[2]);

//        System.out.println(v[0]);
//        System.out.println(g[0]);

        System.out.println(vis[0]);
        System.out.println(vis[1]);
        System.out.println(vis[2]);
    }
}
