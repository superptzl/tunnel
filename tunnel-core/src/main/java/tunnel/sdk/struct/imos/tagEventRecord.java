package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import tunnel.sdk.constanst.IMOSDefLibrary;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagEventRecord extends Structure {
	/** C type : CHAR[IMOS_RES_CODE_LEN] */
	public byte[] szEventRecordCode = new byte[IMOSDefLibrary.IMOS_RES_CODE_LEN];
	/** C type : int */
	public int ulEventType;
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szDeviceCode = new byte[IMOSDefLibrary.IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szDeviceName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szActiveName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : int */
	public int ulEventSecurity;
	/** C type : CHAR[IMOS_TIME_LEN] */
	public byte[] szEventTime = new byte[IMOSDefLibrary.IMOS_TIME_LEN];
	/** C type : int */
	public int ulAlarmStatus;
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szSecurityName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_STRING_LEN_14] */
	public byte[] szSecurityColor = new byte[IMOSDefLibrary.IMOS_STRING_LEN_14];
	/** C type : CHAR[IMOS_TIME_LEN] */
	public byte[] szCheckTime = new byte[IMOSDefLibrary.IMOS_TIME_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szCheckUser = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_TIME_LEN] */
	public byte[] szAckTime = new byte[IMOSDefLibrary.IMOS_TIME_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szAckUser = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_STRING_LEN_128] */
	public byte[] szKeyValue = new byte[IMOSDefLibrary.IMOS_STRING_LEN_128];
	/** C type : CHAR[IMOS_DESC_LEN] */
	public byte[] szEventDesc = new byte[IMOSDefLibrary.IMOS_DESC_LEN];
	/** C type : CHAR[IMOS_DESC_LEN] */
	public byte[] szAckSuggestion = new byte[IMOSDefLibrary.IMOS_DESC_LEN];
	/** C type : int */
	public int ulIsMisinform;
	/** C type : int */
	public int ulIsPlanAlarm;
	/** C type : int */
	public int ulIsOncePlanAlarm;
	/** C type : int */
	public int ulIsManualTask;
	public tagEventRecord() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szEventRecordCode", "ulEventType", "szDeviceCode", "szDeviceName", "szActiveName", "ulEventSecurity", "szEventTime", "ulAlarmStatus", "szSecurityName", "szSecurityColor", "szCheckTime", "szCheckUser", "szAckTime", "szAckUser", "szKeyValue", "szEventDesc", "szAckSuggestion", "ulIsMisinform", "ulIsPlanAlarm", "ulIsOncePlanAlarm", "ulIsManualTask");
	}
	public tagEventRecord(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagEventRecord implements Structure.ByReference {
		
	};
	public static class ByValue extends tagEventRecord implements Structure.ByValue {
		
	};
}
