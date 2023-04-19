package dio.desafio.dominio;

import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate date;

    public Mentorship() {
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
                "\n\ttitle='" + getTitle() + '\'' +
                ",\n\tdescription='" + getDescription() + '\'' +
                ", \n\tdate=" + date +
                " \n}";
    }

    @Override
    public double handleXp() {
        return XP_STANDART + 20d;
    }
}
