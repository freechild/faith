package com.game.faith.dao;

import java.util.HashMap;

import com.game.faith.vo.Total_management;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class test1 {
	
	public static void main(String[] args) {
		
		String saveSource =null;
		Total_management total_management = new Total_management();
		total_management.setTurn(59);
		
		total_management.getReligionVO().setBeliever(10);
		total_management.getReligionVO().setTemple(12);
		total_management.getReligionVO().setFame(11);
		total_management.getReligionVO().setLawful(22);
		total_management.getReligionVO().setGood(12);
		total_management.getReligionVO().setChaos(44);
		total_management.getReligionVO().setEvil(1);
		
		total_management.getCharacterVO().setAp(100);
		total_management.getCharacterVO().setCash(2000);
		total_management.getCharacterVO().setCharisma(15);
		total_management.getCharacterVO().setCharm(2);
		total_management.getCharacterVO().setConfidence(6);;
		
		try{
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
		
		String key = "aes256-test-key!!"; 
        AES256_Util aes256 = new AES256_Util(key);
        saveSource =gson.toJson(map);
		saveSource = aes256.aesEncode(saveSource);
		System.out.println("암호화 ="+saveSource);
		
		saveSource = aes256.aesDecode(saveSource);
		System.out.println("복호화 ="+saveSource);
		}catch(Exception e){
			System.out.println("무슨에러?");
		}
		
		
		
	}
}
