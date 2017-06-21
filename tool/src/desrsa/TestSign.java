package desrsa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

import javax.crypto.Cipher;
import org.apache.commons.codec.binary.Base64;
public class TestSign {
	//public static String ALGORITHM_DSA="DSA";  
    public static String ALGORITHM_RSA="RSA";  
      
    public static byte[] base64Decoder(String data) throws IOException{  
        //BASE64Decoder base64Decoder = new BASE64Decoder();  
        //return base64Decoder.decodeBuffer(data);  
    	return Base64.decodeBase64(data);
    }  
      
    public static String base64Encoder(byte[] data){  
//        BASE64Encoder base64Encoder=new BASE64Encoder();  
//        return base64Encoder.encodeBuffer(data);  
        return Base64.encodeBase64String(data);  
    }  
  
  
      
    /**  
    * @名称: readKeyFile  
    * @描述: 读取Key文件  
    * @param in 
    * @return 
    * @throws Exception 
    *  
    */  
    public static String readKeyFile(InputStream in) throws Exception {  
        BufferedReader br = new BufferedReader(new InputStreamReader(in));  
        String readLine = null;  
        StringBuilder sb = new StringBuilder();  
        while ((readLine = br.readLine()) != null) {  
            if (readLine.charAt(0) == '-') {  
                continue;  
            } else {  
                sb.append(readLine);  
                sb.append('\r');  
            }  
        }  
        return sb.toString();   
    }  
      
    public static PrivateKey loadPrivateKey(String privateKey,String algorithm) throws Exception{  
        // 解密由base64编码的私�??     
        byte[] keyBytes = base64Decoder(privateKey);     
        // 构�?�PKCS8EncodedKeySpec对象     
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);     
        // KEY_ALGORITHM 指定的加密算�??     
        KeyFactory keyFactory = KeyFactory.getInstance(algorithm);     
        // 取私钥匙对象     
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);     
        return priKey;  
    }  
      
    public static PublicKey loadPublicKey(String publicKey,String algorithm) throws Exception {  
        byte[] buffer = base64Decoder(publicKey);
        KeyFactory keyFactory = KeyFactory.getInstance(algorithm);  
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);  
        PublicKey pubKey = keyFactory.generatePublic(keySpec);  
        return pubKey;  
    }  
  
    /**  
    * @名称: rsaEncrypt  
    * @描述: RSA加密  
    * @param publicKey 
    * @param plainTextData 
    * @return 
    * @throws Exception 
    *  
    */  
    public static byte[] rsaEncrypt(RSAPublicKey publicKey, byte[] plainTextData)  
            throws Exception {  
        if (publicKey == null) {  
            return null;  
        }  
        Cipher cipher = null;  
        cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] output = cipher.doFinal(plainTextData);  
        return output;  
    }  
  
    /**  
    * @名称: rsaDecrypt  
    * @描述: RSA解密  
    * @param privateKey 
    * @param cipherData 
    * @return 
    * @throws Exception 
    *  
    */  
    public static byte[] rsaDecrypt(RSAPrivateKey privateKey, byte[] cipherData)  
            throws Exception {  
        if (privateKey == null) {  
            return null;  
        }  
        Cipher cipher = null;  
        cipher = Cipher.getInstance("RSA");  
        cipher.init(Cipher.DECRYPT_MODE, privateKey);  
        byte[] output = cipher.doFinal(cipherData);  
        return output;  
    }  
  
    /** 
     * @名称: genKeyPair 
     * @描述: 生成随机公钥私钥 
     * @return 
     * @throws Exception 
     *  
     */  
   /* public static Key[] genKeyPair() throws Exception {  
        KeyPairGenerator keyPairGen = null;  
        keyPairGen = KeyPairGenerator.getInstance("RSA");  
        keyPairGen.initialize(1024);  
        KeyPair keyPair = keyPairGen.generateKeyPair();  
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();  
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();  
        Key[] key = new Key[2];  
        key[0] = privateKey;  
        key[1] = publicKey;  
        return key;  
    }  */
      
      
      
    /*public static String dsaSign(byte[] data,String privateKey) throws Exception{  
        // 解密由base64编码的私�??     
        byte[] keyBytes = base64Decoder(privateKey);     
        // 构�?�PKCS8EncodedKeySpec对象     
        PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);     
        // KEY_ALGORITHM 指定的加密算�??     
        KeyFactory keyFactory = KeyFactory.getInstance("DSA");     
        // 取私钥匙对象     
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);     
        // 用私钥对信息生成数字签名     
        Signature signature = Signature.getInstance(keyFactory.getAlgorithm());     
        signature.initSign(priKey);     
        signature.update(data);     
        return base64Encoder(signature.sign());   
    }  */
      
    /*public static boolean dsaVerify(byte[] data, String publicKey, String sign) throws Exception{  
        // 解密由base64编码的公�??     
        byte[] keyBytes = base64Decoder(publicKey);     
        // 构�?�X509EncodedKeySpec对象     
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);     
        // KEY_ALGORITHM 指定的加密算�??     
        KeyFactory keyFactory = KeyFactory.getInstance("DSA");     
        // 取公钥匙对象     
        PublicKey pubKey = keyFactory.generatePublic(keySpec);     
        Signature signature = Signature.getInstance(keyFactory.getAlgorithm());     
        signature.initVerify(pubKey);     
        signature.update(data);     
        // 验证签名是否正常     
        return signature.verify(base64Decoder(sign));    
    }  */
    public static final String SIGN_ALGORITHMS = "SHA1withRSA";
    public static String sign(String content, PrivateKey privateKey){  
        try   
        {  
//            PKCS8EncodedKeySpec priPKCS8    = new PKCS8EncodedKeySpec( Base64.decode(privateKey) );   
//            KeyFactory keyf = KeyFactory.getInstance("RSA");  
//            PrivateKey priKey = keyf.generatePrivate(priPKCS8);  
            java.security.Signature signature = java.security.Signature.getInstance(SIGN_ALGORITHMS);  
            signature.initSign(privateKey);  
            signature.update( content.getBytes());  
            byte[] signed = signature.sign();  
            return base64Encoder(signed);  
        }  
        catch (Exception e)   
        {  
            e.printStackTrace();  
        }  
        return null;  
    }  
    public static boolean doCheck(String content, String sign, PublicKey publicKey){  
        try   
        {  
            java.security.Signature signature = java.security.Signature.getInstance(SIGN_ALGORITHMS);
            signature.initVerify(publicKey);  
            signature.update(content.getBytes());
            boolean bverify = signature.verify(base64Decoder(sign));
            return bverify;  
        }   
        catch (Exception e)   
        {  
            e.printStackTrace();  
        }  
        return false;  
    }
  
    public static void main2(String[] args) throws Exception{
        //String str="appid=3&oid=BYH170224145627334&payamount=14500&paytime=1488271420&pid=24&time=1488271420&uid=1";
        String str="u=ADMIN&p=OTZlNzkyMTg5NjVlYjcyYzkyYTU0OWRkNWEzMzAxMTI=&t=1491979722";
        InputStream is=new FileInputStream("D:\\workspace_jjff\\weidian\\kasly-product\\src\\main\\resources\\cer\\thirdparty\\rsa_public_key.pem");
        byte[] bytes=TestSign.rsaEncrypt((RSAPublicKey)loadPublicKey(readKeyFile(is),TestSign.ALGORITHM_RSA),str.getBytes());  
        is.close();
//        System.out.println(new String(bytes,"utf-8"));
        String encode64 = base64Encoder(bytes);
        System.out.println(encode64);
        is=new FileInputStream("D:\\workspace_jjff\\weidian\\kasly-product\\src\\main\\resources\\cer\\thirdparty\\rsa_private_key.pem");
        //encode64 = "DtjtZIPyYthVYXjyprJQhPShcVA/hc62Rvoyx0FgUvZnYgZBMqTsuhKgum8Sqw9P8xiXUb12YK/TW13T7/alrTi3fY/1YVByGjxxfUINvJWKh+NIL9cFIYjCqcSCHCDH5xQTcxVohKR9fTXTqt1ESWvOsO8Qrg92nV3Sv6YvxWM=";
        //encode64 = "ZWDP/22yO3kIznI9IGxZamxgUlft/vaMyPl2ochMyn5SUHqYoXTeTkiSR+B1gkBCVPpgo8Noa+BObWcPqe2iQs8WTNq1hr6ixnfpmKkktCcRP+VVorjzxQekhvdGMEnc3UgLJtWCSbMNwyoup1qagKBDTFNdLu2DK0tOHwZQ+mQ=";
//        encode64 = "D92PRsStOW1YzSblb72uprla2AnL0oeTkBulHf9RYWfhm7UQuRA55g1ZOYvIKEktbhYS/cgUxI4fimKpHQH3xFXQQqf0jFywdJ6JLcEMIiJqoerdKTUmA89P39jPRpek9icAlCT/ZAlGpWLRAwfleOs2BxHAX0mfC8X+vySuv8c=";
        bytes = base64Decoder(encode64);
        System.out.println("---------------"+new String(bytes,"utf-8"));
        bytes=TestSign.rsaDecrypt((RSAPrivateKey)loadPrivateKey(readKeyFile(is),TestSign.ALGORITHM_RSA), bytes);  
        System.out.println(new String(bytes,"utf-8"));
        
//        String signst2 = "VliZyPzRhuQIHJZ9W8KgEu+X3oKMXtsvP9OhS3EZrr8ypfF8vL+Kqp4t49OODCeA4wLfIcIpwz451gbVLNIv5G8z4RTvRmP5WETEILcjrV/KjZJ3O2w0ll2iWeUafvtKVZtD717lJyYoAg/EyYvI/kX+UvnafwZhUStoV3oa0EQ=";
//        InputStream iss=new FileInputStream("D:\\neon_workspace\\env_work\\AAA\\cert\\lxh_public_key.pem");
//        System.out.println("验签结果�??"+doCheck("appid=3&oid=BYH170224145627334&payamount=14500&paytime=1488271420&pid=24&time=1488271420&uid=1", signst2,loadPublicKey(readKeyFile(iss),TestSign.ALGORITHM_RSA) ));  
//        System.out.println();  
        
        //InputStream is2=new FileInputStream("D:\\neon_workspace\\env_work\\AAA\\cert\\rsa_public_key.pem");
        /*InputStream is2=new FileInputStream("D:\\neon_workspace\\env_work\\AAA\\cert\\rsa_public_key.pem");
        PublicKey publicKey = loadPublicKey(readKeyFile(is2),TestSign.ALGORITHM_RSA);
        InputStream is3=new FileInputStream("D:\\neon_workspace\\env_work\\AAA\\cert\\rsa_private_key.pem"); 
        PrivateKey privateKey = loadPrivateKey(readKeyFile(is3),TestSign.ALGORITHM_RSA);
        
        String sssss = sign(str,privateKey);
        System.out.println(sssss);
        System.out.println(doCheck(str,sssss,publicKey));*/
        
        
    }  
    public static void main(String[] args) throws Exception{
    	String key = "123456789abcd";
		String param = "1234567890";
		try {
			//加载key和待加密数据
			System.out.println("加载加密数据");
			FileInputStream dateIs = new FileInputStream(System.getProperty("user.dir")+File.separator+"data.txt");
			Properties p=new Properties();
			p.load(dateIs);
			String data_key = (String) p.get("data_key");
			String data_param = (String) p.get("data_param");
			//加载加密数据
			System.out.println("date_key:"+data_key);
			System.out.println("date_param:"+data_param);
			
			key = data_key;
			param = data_param;
			
			System.out.println("加密");
			//加密key
			InputStream is= TestSign.class.getResourceAsStream("/desrsa/rsa_public_key.pem"); 
			String publicKeyFile = ThirdPartyCerUtils.readKeyFile(is);
			RSAPublicKey loadPublicKey = (RSAPublicKey)ThirdPartyCerUtils.loadPublicKey(publicKeyFile, ThirdPartyCerUtils.ALGORITHM_RSA);
			byte[] key_utf_bts = key.getBytes("UTF-8");
			byte[] key_rsa_en_bts = ThirdPartyCerUtils.rsaEncrypt(loadPublicKey, key_utf_bts);
			String key_rsa_en_base64String =  Base64.encodeBase64String(key_rsa_en_bts);
			System.out.println("加密key");
			System.out.println("key:\n"+key);
			System.out.println("key_rsa_en_base64String:\n"+key_rsa_en_base64String);
			//加密param
			byte[] param_utf_bts = param.getBytes("UTF-8");
			byte[] param_des_en_bts = ThirdPartyCerUtils.desEncrypt(param_utf_bts, key);
			String param_des_en_base64String =  Base64.encodeBase64String(param_des_en_bts);
			System.out.println("加密param");
			System.out.println("param:\n"+param);
			System.out.println("param_des_base64String:\n"+param_des_en_base64String);
			

			System.out.println("解密");
			//解密key
	        InputStream is2= TestSign.class.getResourceAsStream("/desrsa/rsa_private_key.pem"); 
	        byte[] key_rsa_en_base64byts = Base64.decodeBase64(key_rsa_en_base64String);
	        String privateKeyFile = ThirdPartyCerUtils.readKeyFile(is2);
			RSAPrivateKey loadPrivateKey = (RSAPrivateKey)ThirdPartyCerUtils.loadPrivateKey(privateKeyFile,ThirdPartyCerUtils.ALGORITHM_RSA);
			byte[] key_rsa_de_bts = ThirdPartyCerUtils.rsaDecrypt(loadPrivateKey, key_rsa_en_base64byts);  
	        String key_rsa_de_str = new String(key_rsa_de_bts,"utf-8");
			System.out.println("解密key");
	        System.out.println("key_rsa_de_str:\n"+key_rsa_de_str);
	        //解密param
	        byte[] param_des_en_base64sts = Base64.decodeBase64(param_des_en_base64String);
	        byte[] param_des_de_byts = ThirdPartyCerUtils.desDecrypt(param_des_en_base64sts, key_rsa_de_str);
	        String param_des_de_str = new String(param_des_de_byts,"utf-8");

			System.out.println("解密param");
	        System.out.println("param_des_des_str:\n"+param_des_de_str);
	        
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
