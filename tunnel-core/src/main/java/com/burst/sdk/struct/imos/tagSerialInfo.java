package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagSerialInfo extends Structure {
	/** C type : int */
	public int ulSerialMode;
	/** C type : int */
	public int ulSerialType;
	/** C type : int */
	public int ulBaudRate;
	/** C type : int */
	public int ulDataBit;
	/** C type : int */
	public int ulStopBit;
	/** C type : int */
	public int ulParityBit;
	/** C type : int */
	public int ulFlowControl;
	public tagSerialInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulSerialMode", "ulSerialType", "ulBaudRate", "ulDataBit", "ulStopBit", "ulParityBit", "ulFlowControl");
	}
	/**
	 * @param ulSerialMode C type : int<br>
	 * @param ulSerialType C type : int<br>
	 * @param ulBaudRate C type : int<br>
	 * @param ulDataBit C type : int<br>
	 * @param ulStopBit C type : int<br>
	 * @param ulParityBit C type : int<br>
	 * @param ulFlowControl C type : int
	 */
	public tagSerialInfo(int ulSerialMode, int ulSerialType, int ulBaudRate, int ulDataBit, int ulStopBit, int ulParityBit, int ulFlowControl) {
		super();
		this.ulSerialMode = ulSerialMode;
		this.ulSerialType = ulSerialType;
		this.ulBaudRate = ulBaudRate;
		this.ulDataBit = ulDataBit;
		this.ulStopBit = ulStopBit;
		this.ulParityBit = ulParityBit;
		this.ulFlowControl = ulFlowControl;
	}
	public tagSerialInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagSerialInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagSerialInfo implements Structure.ByValue {
		
	};
}
