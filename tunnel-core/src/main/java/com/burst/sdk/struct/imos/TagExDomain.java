package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

import static com.burst.sdk.constanst.IMOSDefLibrary.*;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagExDomain extends Structure {
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szDomainCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szDomainName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulOuterDomainType;
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szDomainParentCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : int */
	public int ulPriority;
	/** C type : int */
	public int ulIsSession;
	/** C type : int */
	public int ulOuterDomainPort;
	/** C type : int */
	public int ulBroadcastStrategy;
	/** C type : int */
	public int uladdrtype;
	/** C type : CHAR[IMOS_IPADDR_LEN] */
	public byte[] szDomainAddr = new byte[IMOS_IPADDR_LEN];
	/** C type : int */
	public int ulInTrunkNum;
	/** C type : CHAR[IMOS_STRING_LEN_64] */
	public byte[] szManufacturerType = new byte[IMOS_STRING_LEN_64];
	/** C type : int */
	public int ulDomainLevel;
	/** C type : int */
	public int ulProtocolType;
	/** C type : int */
	public int ulActiveRegSta;
	/** C type : int */
	public int ulRecvRegSta;
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szInterDomainCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_USER_CODE_LEN] */
	public byte[] szInterUserCode = new byte[IMOS_USER_CODE_LEN];
	/** C type : int */
	public int bIsAutofit;
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szMSCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : int */
	public int ulStreamTransProtocol;
	/** C type : int */
	public int ulStreamByPassMaxNum;
	/** C type : int */
	public int ulMonStreamMatchPolicy;
	/** C type : CHAR[20] */
	public byte[] szReserve = new byte[20];
	public TagExDomain() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szDomainCode", "szDomainName", "ulOuterDomainType", "szDomainParentCode", "ulPriority", "ulIsSession", "ulOuterDomainPort", "ulBroadcastStrategy", "uladdrtype", "szDomainAddr", "ulInTrunkNum", "szManufacturerType", "ulDomainLevel", "ulProtocolType", "ulActiveRegSta", "ulRecvRegSta", "szInterDomainCode", "szInterUserCode", "bIsAutofit", "szMSCode", "ulStreamTransProtocol", "ulStreamByPassMaxNum", "ulMonStreamMatchPolicy", "szReserve");
	}
	public TagExDomain(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagExDomain implements Structure.ByReference {
		
	};
	public static class ByValue extends TagExDomain implements Structure.ByValue {
		
	};
}