package edu.hubu.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.MusicDao;
import edu.hubu.learn.entity.Music;
import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicDao musicDao;

    public Music getMusic(Long id) {
        return musicDao.findById(id).get();
    }

    public List<Music> getMusics() {
        return musicDao.findAll();
    }
    public Music addMusic(Music author) {
        return musicDao.save(author);
    }

    public void deleteMusic(Long id) {
        musicDao.deleteById(id);
    }

    public void modifyMusic(Music author) {
        musicDao.save(author);
    }
}