package com.giulianogabella.firstspringbootapp.service;

import com.giulianogabella.firstspringbootapp.dao.ArtistDAO;
import com.giulianogabella.firstspringbootapp.entity.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private ArtistDAO artistDAO;

    @Autowired
    public ArtistServiceImpl(ArtistDAO theArtistDAO) {
        artistDAO = theArtistDAO;
    }

    @Override
    @Transactional
    public List<Artist> findAll() {
        return artistDAO.findAll();
    }

    @Override
    @Transactional
    public Artist findById(int theId) {
        return artistDAO.findById(theId);
    }

    @Override
    public Artist findByName(String theName) {
        return artistDAO.findByName(theName);
    }

    @Override
    @Transactional
    public void save(Artist theArtist) {
        artistDAO.save(theArtist);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        artistDAO.deleteById(theId);
    }

    @Override
    public Artist findByAlbumId(int albumId) {
        return artistDAO.findByAlbumId(albumId);
    }
}
