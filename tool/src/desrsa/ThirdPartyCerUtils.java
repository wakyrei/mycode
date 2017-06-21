package desrsa;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Base64;

public class ThirdPartyCerUtils {

	public static String ALGORITHM_RSA = "RSA";
	public static final String SIGN_ALGORITHMS = "SHA1withRSA";

	/**
	 * check加密文件是否正确
	 * 
	 * @param content
	 * @param sign
	 * @param publicKey
	 * @return
	 */
	public static boolean doCheck(String content, String sign, PublicKey publicKey) {
		try {
			Signature signature = Signature.getInstance(SIGN_ALGORITHMS);
			signature.initVerify(publicKey);
			signature.update(content.getBytes());
			boolean bverify = signature.verify(Base64.decodeBase64(sign));
			return bverify;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 使用私钥签名特征字符�??
	 * 
	 * @param content
	 * @param privateKey
	 * @return
	 */
	public static String sign(String content, PrivateKey privateKey) {
		try {
			Signature signature = Signature.getInstance(SIGN_ALGORITHMS);
			signature.initSign(privateKey);
			signature.update(content.getBytes());
			byte[] signed = signature.sign();
			return Base64.encodeBase64String(signed);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * RSA解密
	 * 
	 * @param privateKey
	 * @param cipherData
	 * @return
	 * @throws Exception
	 */
	public static byte[] rsaDecrypt(RSAPrivateKey privateKey, byte[] cipherData) throws Exception {
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
	 * RSA加密（公钥）
	 * 
	 * @param publicKey
	 * @param plainTextData
	 * @return
	 * @throws Exception
	 */
	public static byte[] rsaEncrypt(RSAPublicKey publicKey, byte[] plainTextData) throws Exception {
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
	 * RSA加密（私钥）
	 * 
	 * @param privateKey
	 * @param plainTextData
	 * @return
	 * @throws Exception
	 */
	public static byte[] rsaEncrypt(RSAPrivateKey privateKey, byte[] plainTextData) throws Exception {
		if (privateKey == null) {
			return null;
		}
		Cipher cipher = null;
		cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, privateKey);
		byte[] output = cipher.doFinal(plainTextData);
		return output;
	}
	/**
	 * 加密
	 * 
	 * @param datasource
	 *            byte[]
	 * @param password
	 *            String
	 * @return byte[]
	 * @throws Exception 
	 */
	public static byte[] desEncrypt(byte[] datasource, String password) throws Exception {
		SecureRandom random = new SecureRandom();
		DESKeySpec desKey = new DESKeySpec(password.getBytes());
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(desKey);
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
		return cipher.doFinal(datasource);
	}

	/**
	 * 解密
	 * 
	 * @param src
	 *            byte[]
	 * @param password
	 *            String
	 * @return byte[]
	 * @throws Exception
	 */
	public static byte[] desDecrypt(byte[] src, String password) throws Exception {
		SecureRandom random = new SecureRandom();
		DESKeySpec desKey = new DESKeySpec(password.getBytes());
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(desKey);
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, securekey, random);
		return cipher.doFinal(src);
	}

	/**
	 * 读取Key文件
	 * 
	 * @param is
	 * @return
	 * @throws Exception
	 */
	public static String readKeyFile(InputStream is) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
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

	/**
	 * 加载私钥
	 * 
	 * @param privateKey
	 * @param algorithm
	 * @return
	 * @throws Exception
	 */
	public static PrivateKey loadPrivateKey(String privateKey, String algorithm) throws Exception {
		byte[] keyBytes = Base64.decodeBase64(privateKey);
		PKCS8EncodedKeySpec pkcs8KeySpec = new PKCS8EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
		PrivateKey priKey = keyFactory.generatePrivate(pkcs8KeySpec);
		return priKey;
	}

	/**
	 * 加载公钥
	 * 
	 * @param publicKey
	 * @param algorithm
	 * @return
	 * @throws Exception
	 */
	public static PublicKey loadPublicKey(String publicKey, String algorithm) throws Exception {
		byte[] buffer = Base64.decodeBase64(publicKey);
		KeyFactory keyFactory = KeyFactory.getInstance(algorithm);
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
		PublicKey pubKey = keyFactory.generatePublic(keySpec);
		return pubKey;
	}
}
