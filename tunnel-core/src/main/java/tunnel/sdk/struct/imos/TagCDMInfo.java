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
public class TagCDMInfo extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szCDMCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szCDMName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulCDMType;
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szOrgCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_DESC_LEN] */
	public byte[] szDevDesc = new byte[IMOS_DESC_LEN];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public TagCDMInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szCDMCode", "szCDMName", "ulCDMType", "szOrgCode", "szDevDesc", "szReserve");
	}
	/**
	 * @param szCDMCode C type : CHAR[IMOS_DEVICE_CODE_LEN]<br>
	 * @param szCDMName C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulCDMType C type : int<br>
	 * @param szOrgCode C type : CHAR[IMOS_DOMAIN_CODE_LEN]<br>
	 * @param szDevDesc C type : CHAR[IMOS_DESC_LEN]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public TagCDMInfo(byte szCDMCode[], byte szCDMName[], int ulCDMType, byte szOrgCode[], byte szDevDesc[], byte szReserve[]) {
		super();
		if ((szCDMCode.length != this.szCDMCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szCDMCode = szCDMCode;
		if ((szCDMName.length != this.szCDMName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szCDMName = szCDMName;
		this.ulCDMType = ulCDMType;
		if ((szOrgCode.length != this.szOrgCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szOrgCode = szOrgCode;
		if ((szDevDesc.length != this.szDevDesc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szDevDesc = szDevDesc;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public TagCDMInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagCDMInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends TagCDMInfo implements Structure.ByValue {
		
	};
}
