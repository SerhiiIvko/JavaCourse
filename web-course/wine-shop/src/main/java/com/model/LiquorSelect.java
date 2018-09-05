package com.model;

import java.util.ArrayList;
import java.util.List;

public class LiquorSelect {

    public List getAvailableBrands(LiquorType type){
        List<String> brands = new ArrayList<>();
        if(type.equals(LiquorType.WINE)){
            brands.add("Adrianna Vineyard");
            brands.add(("J. P. Chenet"));
        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");
        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");
        }else {
            brands.add("No Brand Available");
        }
        return brands;
    }
}