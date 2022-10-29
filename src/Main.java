import task_1.Book;
import task_1.Reader;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Рогожкин К. Д.", 123, "it", new Date(102, Calendar.JANUARY, 7), "+7(995)201-45-31");
        reader.takeBook(3);
        reader.takeBook("Приключения", "Ужасы");
        reader.takeBook(new Book("Приключения", "Пушкин"), new Book("Ужасы", "Кристи"));
    }
}