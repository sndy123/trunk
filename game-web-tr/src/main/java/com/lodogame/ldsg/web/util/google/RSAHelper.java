package com.lodogame.ldsg.web.util.google;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
 

import javax.crypto.Cipher;

import com.lodogame.ldsg.web.sdk.GooGlePlaySdk;
 
 
public class RSAHelper {
 
      /**
       * 得到公钥
       * @param key 密钥字符串（经过base64编码）
       * @throws Exception
       */
      public static PublicKey getPublicKey(String key) throws Exception {
            byte[] keyBytes = Base64.decode(key);
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKey = keyFactory.generatePublic(keySpec);
            return publicKey;
      }
      /**
       * 得到私钥
       * @param key 密钥字符串（经过base64编码）
       * @throws Exception
       */
      public static PrivateKey getPrivateKey(String key) throws Exception {
            byte[] keyBytes = Base64.decode(key);
 
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(keySpec);
            return privateKey;
      }
 
      /**
       * 得到密钥字符串（经过base64编码）
       * @return
       */
      public static String getKeyString(Key key) throws Exception {
            byte[] keyBytes = key.getEncoded();
            String s = Base64.encode(keyBytes);
            return s;
      }
 
 
      public static void main(String[] args) throws Exception {
 
//            KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
//            //密钥位数
//            keyPairGen.initialize(1024);
//            //密钥对
//            KeyPair keyPair = keyPairGen.generateKeyPair();
// 
//            // 公钥
//            PublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
// 
//            // 私钥
//            PrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
//            
//            
// 
//            String publicKeyString = getKeyString(publicKey);
//            System.out.println("public key:\n" + publicKeyString);
// 
//            String privateKeyString = getKeyString(privateKey);
//            System.out.println("private key:\n" + privateKeyString);
// 
//            //加解密类
            Cipher cipher = Cipher.getInstance("RSA");//Cipher.getInstance("RSA/ECB/PKCS1Padding");
// 
//            //明文
//            String context = "0110012013052300000001";
//            System.out.println("context: " + context);
//            byte[] plainText = context.getBytes();
// 
//            //加密
//           cipher.init(Cipher.ENCRYPT_MODE, publicKey);
//           byte[] enBytes = cipher.doFinal(plainText);
//           String str = Base64.encode(enBytes);
//           System.out.println("encrpyted with public key："+str);
           //通过密钥字符串得到密钥
//            publicKey = getPublicKey(publicKeyString);
//            privateKey = getPrivateKey(privateKeyString);
            //解密

      }
      
      
 
}
 