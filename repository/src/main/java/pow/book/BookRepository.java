package pow.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pow.model.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
