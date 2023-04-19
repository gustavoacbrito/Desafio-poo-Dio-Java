
import dio.desafio.dominio.Course;
import dio.desafio.dominio.Mentorship;

import java.time.LocalDate;

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

        Course course2 = new Course();
        course2.setTitle("Curso JavaScript - A linguagem da Web");
        course2.setDescription("Descrição curso de JavaScript");
        course2.setWorkload(6);


        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentoria Java");
        mentorship.setDescription("Mentoria Java Orientação a Objetos");
        mentorship.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);

    }
}
