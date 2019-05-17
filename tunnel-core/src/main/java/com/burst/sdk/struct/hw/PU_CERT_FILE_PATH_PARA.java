package com.burst.sdk.struct.hw;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_CERT_FILE_PATH_PARA extends Structure {
	/**
	 * CA\u6587\u4ef6\u8def\u5f84<br>
	 * C type : CHAR[512]
	 */
	public byte[] szCACertFilePath = new byte[512];
	/**
	 * \u5ba2\u6237\u7aef\u7aef\u79c1\u94a5\u8def\u5f84<br>
	 * C type : CHAR[512]
	 */
	public byte[] szKeyFilePath = new byte[512];
	/**
	 * \u5ba2\u6237\u7aef\u7aef\u8bc1\u4e66\u8def\u5f84<br>
	 * C type : CHAR[512]
	 */
	public byte[] szCertFilePath = new byte[512];
	/**
	 * \u79c1\u94a5\u5bc6\u7801<br>
	 * C type : CHAR[(64 + 4)]
	 */
	public byte[] szKeyPasswd = new byte[64 + 4];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_CERT_FILE_PATH_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szCACertFilePath", "szKeyFilePath", "szCertFilePath", "szKeyPasswd", "szReserve");
	}
	/**
	 * @param szCACertFilePath CA\u6587\u4ef6\u8def\u5f84<br>
	 * C type : CHAR[512]<br>
	 * @param szKeyFilePath \u5ba2\u6237\u7aef\u7aef\u79c1\u94a5\u8def\u5f84<br>
	 * C type : CHAR[512]<br>
	 * @param szCertFilePath \u5ba2\u6237\u7aef\u7aef\u8bc1\u4e66\u8def\u5f84<br>
	 * C type : CHAR[512]<br>
	 * @param szKeyPasswd \u79c1\u94a5\u5bc6\u7801<br>
	 * C type : CHAR[(64 + 4)]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_CERT_FILE_PATH_PARA(byte szCACertFilePath[], byte szKeyFilePath[], byte szCertFilePath[], byte szKeyPasswd[], byte szReserve[]) {
		super();
		if ((szCACertFilePath.length != this.szCACertFilePath.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szCACertFilePath = szCACertFilePath;
		if ((szKeyFilePath.length != this.szKeyFilePath.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szKeyFilePath = szKeyFilePath;
		if ((szCertFilePath.length != this.szCertFilePath.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szCertFilePath = szCertFilePath;
		if ((szKeyPasswd.length != this.szKeyPasswd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szKeyPasswd = szKeyPasswd;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_CERT_FILE_PATH_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CERT_FILE_PATH_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CERT_FILE_PATH_PARA implements Structure.ByValue {
		
	};
}