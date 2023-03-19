package lesson5.ls12;

public class Main {

    @interface ClassPreamble {
        String author();
        String date();
        int currentRevision() default 1;
        String lastModified() default "N/A";
        String lastModifiedBy() default "N/A";
        String[] reviewers();
    }

/**
 * я могу бращаясь к аннотации напрямую инициализировать значения
  */
    @ClassPreamble(
            author ="Serhii",
            date = "17/03/23",
            currentRevision = 5,
            lastModified = "17/03/23",
            lastModifiedBy = "Serhii Klunniy",
            reviewers = {"Serhii", "Vika", "Tania"})
    public static void main(String[] args) {

        try {

        } finally {

        }
    }
}
