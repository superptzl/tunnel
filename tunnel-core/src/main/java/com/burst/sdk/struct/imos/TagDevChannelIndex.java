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
public class TagDevChannelIndex extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szDevCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : int */
	public int ulDevType;
	/** C type : int */
	public int ulChannelIndex;
	public TagDevChannelIndex() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szDevCode", "ulDevType", "ulChannelIndex");
	}
	/**
	 * @param szDevCode C type : CHAR[IMOS_DEVICE_CODE_LEN]<br>
	 * @param ulDevType C type : int<br>
	 * @param ulChannelIndex C type : int
	 */
	public TagDevChannelIndex(byte szDevCode[], int ulDevType, int ulChannelIndex) {
		super();
		if ((szDevCode.length != this.szDevCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDevCode = szDevCode;
		this.ulDevType = ulDevType;
		this.ulChannelIndex = ulChannelIndex;
	}
	public TagDevChannelIndex(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagDevChannelIndex implements Structure.ByReference {
		
	};
	public static class ByValue extends TagDevChannelIndex implements Structure.ByValue {
		
	};
}