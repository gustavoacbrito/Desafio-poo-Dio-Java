import dio.desafio.dominio.Bootcamp;
import dio.desafio.dominio.Course;
import dio.desafio.dominio.Dev;
import dio.desafio.dominio.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Curso Java - Orientação a Objetos");
        course1.setDescription("Descrição curso Java de Orientação a Objetos");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Curso JavaScript - A linguagem da Web");
        course2.setDescription("Descrição curso de JavaScript");
        course2.setWorkload(6);


        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Mentoria Java");
        mentorship.setDescription("Mentoria Java Orientação a Objetos");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcampJavaDevelper = new Bootcamp();
        bootcampJavaDevelper.setName("Bootcamp Java Developer");
        bootcampJavaDevelper.setDescription("Descrição Bootcamp Java developer");
        bootcampJavaDevelper.getContents().add(course1);
        bootcampJavaDevelper.getContents().add(course2);
        bootcampJavaDevelper.getContents().add(mentorship);

        Dev devGustavo = new Dev();

        devGustavo.setName("Gustavo Afonso");
        devGustavo.subscribe(bootcampJavaDevelper);
        System.out.println("Conteúdos Inscritos de " + devGustavo.getName() + ": " + devGustavo.getSubscribedContents());
        devGustavo.progress();
        devGustavo.progress();
        devGustavo.progress();
        System.out.println("Conteúdos Inscritos de " + devGustavo.getName() + ": " + devGustavo.getSubscribedContents());
        System.out.println("Conteudos Concluídos de " + devGustavo.getName() + ": " + devGustavo.getFinishedContents());
        System.out.println("XP: " + devGustavo.handleTotalXp());

        Dev devMayara = new Dev();

        devMayara.setName("Mayara");
        devMayara.subscribe(bootcampJavaDevelper);
        devMayara.progress();

        System.out.println("Conteúdos Inscritos de " + devMayara.getName() + ": " + devMayara.getSubscribedContents());
        System.out.println("Conteúdos Concluídos de " + devMayara.getName() + ": " + devMayara.getFinishedContents());
        System.out.println("XP: " + devMayara.handleTotalXp());

    }
}

