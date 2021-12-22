package com.example.studcrud.stud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudService {

    @Autowired
    private StudRepository repo;

    public List<Stud> listAll() {
        List<Stud> listOfStudents = repo.findAll();
        System.out.print(listOfStudents);
        return listOfStudents;
    }

    public void save(Stud std) {
        repo.save(std);
    }

    public Stud get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
