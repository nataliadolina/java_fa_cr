package task_1;

import java.lang.reflect.Array;
import java.util.Date;

public class Reader {
    private final String _fio;
    private int _num_read_ticket;
    private String _facultet;
    private Date _born_date;
    private String _phoneNumber;

    public Reader(String fio, int num_read_ticket, String facultet, Date born_date, String phoneNumber){
        _fio = fio;
        _num_read_ticket = num_read_ticket;
        _facultet = facultet;
        _born_date = born_date;
        _phoneNumber = phoneNumber;
    }

    public void takeBook(int numBooks){
        System.out.println(String.format("%s взяд %d книги",
                _fio, numBooks));
    }

    public void takeBook(String... books){
        System.out.println(String.format("%s взял книги: %s", _fio, String.join(",", books)));
    }

    public void takeBook(Book... books){
        String[] bookNames = new String[books.length];
        int k = 0;
        for (var book: books){
            bookNames[k] = book.BookName;
            k++;
        }
        String bookNamesStr = String.join(",", bookNames);
        System.out.println(String.format("%s взял книги: %s", _fio, bookNamesStr));
    }

    public void returnBook(int numBooks){
        System.out.println(String.format("%s вернул %d книги",
                _fio, numBooks));
    }

    public void returnBook(String... books){
        System.out.println(String.format("%s вернул книги: %s", _fio, String.join(",", books)));
    }

    public void returnBook(Book... books){
        String[] bookNames = new String[books.length];
        int k = 0;
        for (var book: books){
            bookNames[k] = book.BookName;
            k++;
        }
        String bookNamesStr = String.join(",", bookNames);
        System.out.println(String.format("%s вернул книги: %s", _fio, bookNamesStr));
    }
}
