package com.game.faith;

public class Test1 {
	public static void main(String[] args) throws Exception {
        String key = "aes256-test-key!!";       // key는 16자 이상 
        AES256_Util aes256 = new AES256_Util(key);
         
        String text = "Drakedog SS입니다.";
        String encText = aes256.aesEncode(text);
        String decText = aes256.aesDecode(encText);
         
        System.out.println("암호화할 문자 : " + text);
        System.out.println("암호화된 문자 : " + encText);
        System.out.println("복호화된 문자 : " + decText);
    }
}
