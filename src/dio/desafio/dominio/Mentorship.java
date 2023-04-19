package dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship {
    private String title;
    private String description;
    private LocalDate date;

    public Mentorship() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }
}
