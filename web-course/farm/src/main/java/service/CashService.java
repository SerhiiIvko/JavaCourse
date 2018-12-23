package service;

import entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CashService {
//    private Map<User, List<String>> gameCache;

    public static Map<User, List<String>> getGameCache(User user, List<String> plants) {
        Map<User, List<String>> gameCache = new HashMap<>();
        gameCache.put(user, plants);
        return gameCache;
    }
}