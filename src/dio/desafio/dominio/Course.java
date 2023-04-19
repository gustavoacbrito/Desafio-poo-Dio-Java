package dio.desafio.dominio;

public class Course extends Content {
    private int workload;

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "\n\ttitle='" + getTitle() + '\'' +
                ",\n\tdescription='" + getDescription() + '\'' +
                ",\n\tworkload=" + workload +
                "\n}";
    }

    @Override
    public double handleXp() {
        return XP_STANDART * workload;
    }
}
