package com.burst.sdk.struct.imos;
import com.burst.sdk.constanst.IMOSDefLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.burst.sdk.constanst.IMOSDefLibrary;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagShareStorageDeviceInfo extends Structure {
	/** C type : CHAR[IMOS_CODE_LEN] */
	public byte[] szStoreDevCode = new byte[IMOSDefLibrary.IMOS_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szStoreDevName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : int */
	public int ulTotalCapacity;
	/** C type : int */
	public int ulSpareCapacity;
	/** C type : int */
	public int ulTotalShareCapacity;
	/** C type : int */
	public int ulStorageHours;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public tagShareStorageDeviceInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szStoreDevCode", "szStoreDevName", "ulTotalCapacity", "ulSpareCapacity", "ulTotalShareCapacity", "ulStorageHours", "szReserve");
	}
	/**
	 * @param szStoreDevCode C type : CHAR[IMOS_CODE_LEN]<br>
	 * @param szStoreDevName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulTotalCapacity C type : int<br>
	 * @param ulSpareCapacity C type : int<br>
	 * @param ulTotalShareCapacity C type : int<br>
	 * @param ulStorageHours C type : int<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public tagShareStorageDeviceInfo(byte szStoreDevCode[], byte szStoreDevName[], int ulTotalCapacity, int ulSpareCapacity, int ulTotalShareCapacity, int ulStorageHours, byte szReserve[]) {
		super();
		if ((szStoreDevCode.length != this.szStoreDevCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szStoreDevCode = szStoreDevCode;
		if ((szStoreDevName.length != this.szStoreDevName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szStoreDevName = szStoreDevName;
		this.ulTotalCapacity = ulTotalCapacity;
		this.ulSpareCapacity = ulSpareCapacity;
		this.ulTotalShareCapacity = ulTotalShareCapacity;
		this.ulStorageHours = ulStorageHours;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public tagShareStorageDeviceInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagShareStorageDeviceInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagShareStorageDeviceInfo implements Structure.ByValue {
		
	};
}
