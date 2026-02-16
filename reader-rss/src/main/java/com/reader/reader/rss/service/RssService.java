package com.reader.reader.rss.service;

import java.io.IOException;
import com.apptasticsoftware.rssreader.RssReader;

public class RssService {
    
    public void readRssFeed(String url) {
        // Lógica para ler o feed RSS a partir da URL fornecida
        // Você pode usar bibliotecas como Rome ou RSSReader para facilitar a leitura do feed
        RssReader rssReader = new RssReader();        
        try {
            rssReader.read(url).forEach(item -> {
                System.out.println("Title: " + item.getTitle());
                System.out.println("Link: " + item.getLink());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Publication Date: " + item.getPubDate());
                System.out.println("-----------------------------------");
            });
        } catch (IOException e) {            
            e.printStackTrace();
        }       

    }
}
