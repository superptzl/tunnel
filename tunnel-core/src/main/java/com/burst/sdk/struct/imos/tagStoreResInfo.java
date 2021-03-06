package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import static com.burst.sdk.constanst.IMOSDefLibrary.*;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagStoreResInfo extends Structure {
	/** C type : int */
	public int ulStorageType;
	/** C type : int */
	public int ulStoreDevType;
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szStoreDevCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szStoreDevName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int bStoreDevAutoSelect;
	/** C type : int */
	public int ulPlanStreamType;
	/** C type : int */
	public int ulManualStreamType;
	/** C type : int */
	public int ulEventStreamType;
	/** C type : int */
	public int ulDiskFullPolicy;
	/** C type : int */
	public int ulStoreSize;
	/** C type : ALARM_STORAGE_TIME_S */
	public TaAlarmStorageTime stAlarmStorageTime;
	public tagStoreResInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulStorageType", "ulStoreDevType", "szStoreDevCode", "szStoreDevName", "bStoreDevAutoSelect", "ulPlanStreamType", "ulManualStreamType", "ulEventStreamType", "ulDiskFullPolicy", "ulStoreSize", "stAlarmStorageTime");
	}
	public tagStoreResInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagStoreResInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagStoreResInfo implements Structure.ByValue {
		
	};
}
