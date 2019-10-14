package edu.hubu.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.Music;
import edu.hubu.learn.service.MusicService;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    // @RequestMapping("/music")
    // public ModelAndView music() {
    //     ModelAndView mav = new ModelAndView();
    //     Music music = musicService.getMusic(1l);
    //     mav.addObject("music", music);
    //     mav.setViewName("music");
    //     return mav;
    // }

    // @RequestMapping("/{id}")
    // public ModelAndView getMusic(@PathVariable Long id) {
    //     ModelAndView mav = new ModelAndView();
    //     Music music = musicService.getMusic(id);
    //     mav.addObject("music", music);
    //     mav.setViewName("music");
    //     return mav;
    // }

    @RequestMapping("/list")
    public ModelAndView musics() {
        ModelAndView mav = new ModelAndView();
        List<Music> musics= musicService.getMusics();
        mav.addObject("music", musics);
        mav.setViewName("music");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView addMusic() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("add_music");
        return mav;
    }

    @RequestMapping("/do_add")
    public ModelAndView doAddUser(Music song) {
        musicService.addMusic(song);
        ModelAndView mav = new ModelAndView("redirect:/music/list");
        return mav;
    }

    @RequestMapping("/modify/{id}")
    public ModelAndView modifyMusic(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("music", musicService.getMusic(id));
        mav.setViewName("music_modify");
        return mav;
    }

    @RequestMapping("/do_modify")
    public ModelAndView doModifyMusic(Music author) {
        musicService.modifyMusic(author);
        ModelAndView mav = new ModelAndView("redirect:/music/list");
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        musicService.deleteMusic(id);
        ModelAndView mav = new ModelAndView("redirect:/music/list");
        return mav;
    }


}