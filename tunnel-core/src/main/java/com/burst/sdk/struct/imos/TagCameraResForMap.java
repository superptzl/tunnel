package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

import static com.burst.sdk.constanst.IMOSDefLibrary.IMOS_NAME_LEN;
import static com.burst.sdk.constanst.IMOSDefLibrary.IMOS_RES_CODE_LEN;


/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagCameraResForMap extends Structure {
	/** C type : CHAR[IMOS_RES_CODE_LEN] */
	public byte[] szResCode = new byte[IMOS_RES_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szResName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulResType;
	/** C type : int */
	public int ulResStatus;
	public TagCameraResForMap() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szResCode", "szResName", "ulResType", "ulResStatus");
	}
	/**
	 * @param szResCode C type : CHAR[IMOS_RES_CODE_LEN]<br>
	 * @param szResName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulResType C type : int<br>
	 * @param ulResStatus C type : int
	 */
	public TagCameraResForMap(byte szResCode[], byte szResName[], int ulResType, int ulResStatus) {
		super();
		if ((szResCode.length != this.szResCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szResCode = szResCode;
		if ((szResName.length != this.szResName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szResName = szResName;
		this.ulResType = ulResType;
		this.ulResStatus = ulResStatus;
	}
	public TagCameraResForMap(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagCameraResForMap implements Structure.ByReference {
		
	};
	public static class ByValue extends TagCameraResForMap implements Structure.ByValue {
		
	};
}
