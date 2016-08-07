package com.game.faith.dao;

import java.util.HashMap;

import javax.annotation.Resource;

import com.game.faith.vo.Total_management;
import com.google.gson.Gson;

@Resource
public class TurnOverDao {
	
	
	Total_management total_management = new Total_management();
	
	public String gameSave(){
		String saveSource =null;
		try {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("turn", total_management.getTurn());
			
			map.put("believer", total_management.getReligionVO().getBeliever());
			map.put("temple", total_management.getReligionVO().getTemple());
			map.put("fame", total_management.getReligionVO().getFame());
			map.put("lawful", total_management.getReligionVO().getLawful());
			map.put("good", total_management.getReligionVO().getGood());
			map.put("chaos", total_management.getReligionVO().getChaos());
			map.put("evil", total_management.getReligionVO().getEvil());
			
			map.put("ap", total_management.getCharacterVO().getAp());
			map.put("cash", total_management.getCharacterVO().getCash());
			map.put("charisma", total_management.getCharacterVO().getCharisma());
			map.put("charm", total_management.getCharacterVO().getCharm());
			map.put("confidence", total_management.getCharacterVO().getConfidence());
			
			Gson gson = new Gson();
			saveSource = gson.toJson(map);
			String key = "aes256-test-key!!"; 
	        AES256_Util aes256 = new AES256_Util(key);
			saveSource = aes256.aesEncode(saveSource);
			
		} catch (Exception e) {
			System.out.println("save error");
		}
		
		return saveSource;
	}
	
	public Total_management gameLoad(String loadSource){
		
		String loadDetail =null;
		try {
			String key = "aes256-test-key!!"; 
	        AES256_Util aes256 = new AES256_Util(key);
			loadDetail = aes256.aesDecode(loadSource);
			
		} catch (Exception e) {
			System.out.println("save error");
		}
		
		return total_management;
	}
	
}
