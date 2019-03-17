package com.example.demo.an;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: Pingfan
 * @Date: 2019-03-05
 */
public class MovieRecommender {

    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Action")
    private MovieCatalog actionVhsCatalog;

    @Autowired
    @MovieQualifier(format = Format.VHS, genre = "Comedy")
    private MovieCatalog comedyVhsCatalog;

    @Autowired
    @MovieQualifier(format = Format.DVD, genre = "Action")
    private MovieCatalog actionDvdCatalog;

    @Autowired
    @MovieQualifier(format = Format.BLURAY, genre = "Comedy")
    private MovieCatalog comedyBluRayCatalog;
}
