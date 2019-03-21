package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
import static tunnel.sdk.constanst.IMOSDefLibrary.*;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagVODInfo extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szVODCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szVODName = new byte[IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szOrgCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_DESC_LEN - IMOS_STRING_LEN_128] */
	public byte[] szDevDesc = new byte[IMOS_DESC_LEN - IMOS_STRING_LEN_128];
	/** C type : int */
	public int ulVODType;
	/** C type : CHAR[124] */
	public byte[] szReserve = new byte[124];
	public tagVODInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szVODCode", "szVODName", "szOrgCode", "szDevDesc", "ulVODType", "szReserve");
	}
	/**
	 * @param szVODCode C type : CHAR[IMOS_DEVICE_CODE_LEN]<br>
	 * @param szVODName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param szOrgCode C type : CHAR[IMOS_DOMAIN_CODE_LEN]<br>
	 * @param szDevDesc C type : CHAR[IMOS_DESC_LEN - IMOS_STRING_LEN_128]<br>
	 * @param ulVODType C type : int<br>
	 * @param szReserve C type : CHAR[124]
	 */
	public tagVODInfo(byte szVODCode[], byte szVODName[], byte szOrgCode[], byte szDevDesc[], int ulVODType, byte szReserve[]) {
		super();
		if ((szVODCode.length != this.szVODCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szVODCode = szVODCode;
		if ((szVODName.length != this.szVODName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szVODName = szVODName;
		if ((szOrgCode.length != this.szOrgCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szOrgCode = szOrgCode;
		if ((szDevDesc.length != this.szDevDesc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDevDesc = szDevDesc;
		this.ulVODType = ulVODType;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public tagVODInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagVODInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagVODInfo implements Structure.ByValue {
		
	};
}
