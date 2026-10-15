package com.kiet.library;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    // 1. Get all books
    public List<Book> getAllBooks() {
        return books;
    }

    // 2. Get book by ID
    public Book getBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // 3. Add a book
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    // 4. Update a book
    public Book updateBook(int bookId, Book updatedBook) {
        Book existingBook = getBookById(bookId);

        if (existingBook != null) {
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setCategory(updatedBook.getCategory());
            existingBook.setPrice(updatedBook.getPrice());
            existingBook.setPublishedYear(updatedBook.getPublishedYear());
        }

        return existingBook;
    }

    // 5. Delete a book
    public boolean deleteBook(int bookId) {
        return books.removeIf(book -> book.getBookId() == bookId);
    }

    // 6. Search books by category
    public List<Book> searchByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory() != null
                        && book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // 7. Find books published from a given year
    public List<Book> findPublishedFromYear(int fromYear) {
        return books.stream()
                .filter(book -> book.getPublishedYear() >= fromYear)
                .collect(Collectors.toList());
    }
}