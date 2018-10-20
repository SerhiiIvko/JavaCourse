package com.model;

import java.util.ArrayList;
import java.util.List;

public class TourSelect {

    public List getAvailableTours(TourType type) {
        List<String> tours = new ArrayList<>();
        if (type.equals(TourType.REST)) {
            tours.add("Antalya, Stars Hotel SPA");
            tours.add(("Beldibi, Nirvana Hotel"));
        } else if (type.equals(TourType.SHOPPING)) {
            tours.add("Istanbul, Big Bazaar Hotel");
            tours.add("Kemer, AnnexTour Bus Hotel");
        } else if (type.equals(TourType.EXCURSION)) {
            tours.add("Cappadokia travel");
        } else {
            tours.add("No tours available");
        }
        return tours;
    }
}