package pow.service.book;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pow.book.BookRepository;
import pow.model.book.Book;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class BookService {

    @Autowired(required = false)
    private BookRepository bookRepository;

    @PostConstruct
    public void initBook(){
        bookRepository.saveAll(Stream.of(new Book(1, "Pachnidło", "Patrick Suskind"),
                        new Book(2, "Zgroza w Dunwich", "Howart Phillips Lovecraft"))
                        .collect(Collectors.toList()));
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
