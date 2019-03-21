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
public class tagAlarmSrc extends Structure {
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szAlarmSrcName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : int */
	public int ulAlarmSrcType;
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szDevCode = new byte[IMOSDefLibrary.IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szDevName = new byte[IMOSDefLibrary.IMOS_NAME_LEN];
	/** C type : int */
	public int ulChannelIndex;
	public tagAlarmSrc() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szAlarmSrcName", "ulAlarmSrcType", "szDevCode", "szDevName", "ulChannelIndex");
	}
	/**
	 * @param szAlarmSrcName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulAlarmSrcType C type : int<br>
	 * @param szDevCode C type : CHAR[IMOS_DEVICE_CODE_LEN]<br>
	 * @param szDevName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulChannelIndex C type : int
	 */
	public tagAlarmSrc(byte szAlarmSrcName[], int ulAlarmSrcType, byte szDevCode[], byte szDevName[], int ulChannelIndex) {
		super();
		if ((szAlarmSrcName.length != this.szAlarmSrcName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szAlarmSrcName = szAlarmSrcName;
		this.ulAlarmSrcType = ulAlarmSrcType;
		if ((szDevCode.length != this.szDevCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDevCode = szDevCode;
		if ((szDevName.length != this.szDevName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDevName = szDevName;
		this.ulChannelIndex = ulChannelIndex;
	}
	public tagAlarmSrc(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagAlarmSrc implements Structure.ByReference {
		
	};
	public static class ByValue extends tagAlarmSrc implements Structure.ByValue {
		
	};
}
