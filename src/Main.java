import dio.desafio.dominio.Course;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Curso Java - Orientação a Objetos");
        course1.setDescription("Curso sobre programação orientada a " +
                "objetos usando a linguagem Java. Os alunos aprendem a criar" +
                " classes, objetos, encapsulamento, herança, polimorfismo e interfaces." +
                " Eles também trabalham em projetos práticos para desenvolver aplicativos" +
                " Java de alta qualidade.");
        course1.setWorkload(8);

        System.out.println(course1);

    }
}
