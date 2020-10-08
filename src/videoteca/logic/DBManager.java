/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoteca.logic;

import javax.persistence.Persistence;
import videoteca.controllers.FilmJpaController;
import videoteca.controllers.RegistaJpaController;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */
public class DBManager {
    
    private static DBManager _instance = null;
    private FilmJpaController filmJpaController;
    private RegistaJpaController registaJpaController;
    
    public static DBManager getInstance() {
        if (_instance == null) {
            _instance = new DBManager();
            return _instance;
        } else {
            return _instance;
        }
    }
    
    private DBManager() {
        super();
        init();
    }
    
    private void init(){
        filmJpaController = new FilmJpaController(Persistence.createEntityManagerFactory("VideoTecaPU"));
        registaJpaController = new RegistaJpaController(Persistence.createEntityManagerFactory("VideoTecaPU"));
    }

    public FilmJpaController getFilmJpaController() {
        return filmJpaController;
    }

    public RegistaJpaController getRegistaJpaController() {
        return registaJpaController;
    }
    
    
    
}
