package undergroundsystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {
    Map<String, List<Integer>> sumTime;
    Map<Integer, Info> customer;

    public class Info {
        String station;
        int time;

        public Info(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    public UndergroundSystem() {
        customer = new HashMap<>();
        sumTime = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        customer.put(id, new Info(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Info info = customer.get(id);
        String station = info.station;
        int time = info.time;
        String key = station + "->" + stationName;
        List<Integer> list = sumTime.getOrDefault(key, new LinkedList<>());
        list.add(t - time);
        sumTime.put(key, list);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + "->" + endStation;
        List<Integer> listTime = sumTime.get(key);
        int count = listTime.size();
        int totalTime = 0;
        for (int item : listTime) {
            totalTime += item;
        }
        return (double) totalTime / count;
    }
}
