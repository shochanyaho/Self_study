package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
@Transactional
public class BookService {
	
	@Autowired
	BookRepository repository;
	
	/**
	 * データベースから本の一覧を取得する
	 * @return
	 */
	public List<Book> findAll() {
		return repository.findAll();
	}
}