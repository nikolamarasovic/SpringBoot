package com.SpringApp.app.bootstrap;

import com.SpringApp.app.domain.Author;
import com.SpringApp.app.domain.Book;
import com.SpringApp.app.domain.Client;
import com.SpringApp.app.repositories.AuthorRepository;
import com.SpringApp.app.repositories.BookRepository;
import com.SpringApp.app.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorrepo;
    private final BookRepository bookrepo;
    private final ClientRepository clientrepo;

    public BootStrapData(AuthorRepository authorrepo, BookRepository bookrepo, ClientRepository clientrepo) {
        this.authorrepo = authorrepo;
        this.bookrepo = bookrepo;
        this.clientrepo = clientrepo;
    }
    
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        Author author = new Author("firstName", "lastName");
        Author author2 = new Author("firstName2", "lastName2");
        Book book = new Book("title");
        Book book2 = new Book("title2");
        Client client = new Client("Nikola", "Marasovic");
        Client client2 = new Client("Niko", "Marasovic");
        Client client3 = new Client("Miro", "Marasovic");
        //author.getBooks().add(book); ovo ti ne triba
        book.getAuthors().add(author);
        book.getClients().add(client);

        authorrepo.save(author);
        bookrepo.save(book);
        clientrepo.save(client);
        
        // author.getBooks().add(book2);
         book2.getAuthors().add(author2);
         book2.getClients().add(client2);
        
        authorrepo.save(author2);
        bookrepo.save(book2);       
        clientrepo.save(client2);
        
        // author.getBooks().add(book);
        // book.getAuthors().add(author);
        // book.getClients().add(client3);

        // // authorrepo.save(author);
        // bookrepo.save(book);
        // // clientrepo.save(client3);

        System.out.println("Number of books " + bookrepo.count());
        System.out.println("Number of clients " + clientrepo.count());
        System.out.println("Number of authors " + authorrepo.count());
    }

}