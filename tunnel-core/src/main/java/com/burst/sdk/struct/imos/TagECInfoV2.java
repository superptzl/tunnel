package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

import static com.burst.sdk.constanst.IMOSDefLibrary.IMOS_STRING_LEN_64;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagECInfoV2 extends Structure {
	/** C type : EC_INFO_S */
	public TagECInfo stEcInfoV1;
	/** C type : CHAR[IMOS_STRING_LEN_64] */
	public byte[] szECDisplayVer = new byte[IMOS_STRING_LEN_64];
	/** C type : CHAR[256] */
	public byte[] szReserve = new byte[256];
	public TagECInfoV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stEcInfoV1", "szECDisplayVer", "szReserve");
	}
	/**
	 * @param stEcInfoV1 C type : EC_INFO_S<br>
	 * @param szECDisplayVer C type : CHAR[IMOS_STRING_LEN_64]<br>
	 * @param szReserve C type : CHAR[256]
	 */
	public TagECInfoV2(TagECInfo stEcInfoV1, byte szECDisplayVer[], byte szReserve[]) {
		super();
		this.stEcInfoV1 = stEcInfoV1;
		if ((szECDisplayVer.length != this.szECDisplayVer.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szECDisplayVer = szECDisplayVer;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public TagECInfoV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagECInfoV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends TagECInfoV2 implements Structure.ByValue {
		
	};
}
