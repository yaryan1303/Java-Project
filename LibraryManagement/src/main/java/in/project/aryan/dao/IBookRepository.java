package in.project.aryan.dao;

import org.springframework.data.repository.CrudRepository;

import in.project.aryan.model.Book;

public interface IBookRepository extends CrudRepository<Book, Integer> {

}
