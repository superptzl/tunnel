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
public class TagCDSQueryItem extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szCDSCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szCDSName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulCDSType;
	/** C type : CHAR[IMOS_USER_CODE_LEN] */
	public byte[] szCDSUserCode = new byte[IMOS_USER_CODE_LEN];
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szOrgCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szOrgName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulDevaddrtype;
	/** C type : CHAR[IMOS_IPADDR_LEN] */
	public byte[] szDevAddr = new byte[IMOS_IPADDR_LEN];
	/** C type : CHAR[IMOS_STRING_LEN_64] */
	public byte[] szStoreDevTotalSize = new byte[IMOS_STRING_LEN_64];
	/** C type : CHAR[IMOS_STRING_LEN_64] */
	public byte[] szStoreDevUsedSize = new byte[IMOS_STRING_LEN_64];
	/** C type : int */
	public int ulIsOnline;
	/** C type : int */
	public int ulDevExtStatus;
	/** C type : LONG_32 */
	public int lCDSPurpose;
	/** C type : CHAR[28] */
	public byte[] szReserve = new byte[28];
	public TagCDSQueryItem() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szCDSCode", "szCDSName", "ulCDSType", "szCDSUserCode", "szOrgCode", "szOrgName", "ulDevaddrtype", "szDevAddr", "szStoreDevTotalSize", "szStoreDevUsedSize", "ulIsOnline", "ulDevExtStatus", "lCDSPurpose", "szReserve");
	}
	public TagCDSQueryItem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagCDSQueryItem implements Structure.ByReference {
		
	};
	public static class ByValue extends TagCDSQueryItem implements Structure.ByValue {
		
	};
}
