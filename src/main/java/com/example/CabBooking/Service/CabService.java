package com.example.CabBooking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.CabBooking.Booking;
import com.example.CabBooking.Repository.CabRepository;
import org.springframework.stereotype.Service;

@Service
public class CabService {

    @Autowired
    private CabRepository repo;

    public List<Booking> listAll() {
        return repo.findAll();
    }

    public void save(Booking cbk) {
        repo.save(cbk);
    }

    public Booking get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}