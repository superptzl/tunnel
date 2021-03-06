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
public class tagSlotInfo extends Structure {
	/** C type : int */
	public int ulSlotNum;
	/** C type : int */
	public int ulHasDisk;
	/** C type : int */
	public int ulUsedSize;
	/** C type : int */
	public int ulDiskCapacity;
	/** C type : int */
	public int ulStatus;
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szManufacturer = new byte[IMOS_NAME_LEN];
	public tagSlotInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulSlotNum", "ulHasDisk", "ulUsedSize", "ulDiskCapacity", "ulStatus", "szManufacturer");
	}
	/**
	 * @param ulSlotNum C type : int<br>
	 * @param ulHasDisk C type : int<br>
	 * @param ulUsedSize C type : int<br>
	 * @param ulDiskCapacity C type : int<br>
	 * @param ulStatus C type : int<br>
	 * @param szManufacturer C type : CHAR[IMOS_NAME_LEN]
	 */
	public tagSlotInfo(int ulSlotNum, int ulHasDisk, int ulUsedSize, int ulDiskCapacity, int ulStatus, byte szManufacturer[]) {
		super();
		this.ulSlotNum = ulSlotNum;
		this.ulHasDisk = ulHasDisk;
		this.ulUsedSize = ulUsedSize;
		this.ulDiskCapacity = ulDiskCapacity;
		this.ulStatus = ulStatus;
		if ((szManufacturer.length != this.szManufacturer.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szManufacturer = szManufacturer;
	}
	public tagSlotInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagSlotInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagSlotInfo implements Structure.ByValue {
		
	};
}
