package in.project.aryan.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;

import in.project.aryan.dao.IBookRepository;
import in.project.aryan.model.Book;

public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepository repo;
	@Override
	public List<Book> findAllBooks() {
		return StreamSupport.stream(repo.findAll().spliterator(), false).collect(Collectors.toList());

	}

	@Override
	public Book saveBook(Book book) {
		
		return repo.save(book);
	}

	@Override
	public void deleteBookById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findBookById(Integer id) {
		// TODO Auto-generated method stub

	}

}
