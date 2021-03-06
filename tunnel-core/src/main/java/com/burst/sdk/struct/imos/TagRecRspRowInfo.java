package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
import static  com.burst.sdk.constanst.IMOSDefLibrary.*;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagRecRspRowInfo extends Structure {
	/** C type : int */
	public int ulRowNum;
	/** C type : int */
	public int bHasMoreRow;
	/** C type : CHAR[IMOS_TIME_LEN] */
	public byte[] szEndTime = new byte[IMOS_TIME_LEN];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public TagRecRspRowInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulRowNum", "bHasMoreRow", "szEndTime", "szReserve");
	}
	/**
	 * @param ulRowNum C type : int<br>
	 * @param bHasMoreRow C type : int<br>
	 * @param szEndTime C type : CHAR[IMOS_TIME_LEN]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public TagRecRspRowInfo(int ulRowNum, int bHasMoreRow, byte szEndTime[], byte szReserve[]) {
		super();
		this.ulRowNum = ulRowNum;
		this.bHasMoreRow = bHasMoreRow;
		if ((szEndTime.length != this.szEndTime.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szEndTime = szEndTime;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public TagRecRspRowInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagRecRspRowInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends TagRecRspRowInfo implements Structure.ByValue {
		
	};
}
