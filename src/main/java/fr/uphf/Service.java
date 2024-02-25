package fr.uphf;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
public class Service {
    private Integer id;
    private Integer capacite;
    private Map<String,Integer> chemin;

    public void loadFromJson(JSONObject json) {
        id = json.getInt("id");
        capacite = json.getInt("capacite");
        chemin = new HashMap<>();
        JSONArray jsonChemin = json.getJSONArray("chemin");
        for(int i = 0; i < jsonChemin.length(); i++) {
            JSONObject jsonEtape = jsonChemin.getJSONObject(i);
            chemin.put(jsonEtape.getString("point"), jsonEtape.getInt("date"));
        }
    }

    public Integer getId() {
        return id;
    } 
    public Integer getCapacite() {
        return capacite;
    }
} 

