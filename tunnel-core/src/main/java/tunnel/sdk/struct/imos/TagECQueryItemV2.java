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
public class TagECQueryItemV2 extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szECCode = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szECName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulECType;
	/** C type : int */
	public int ulDevaddrtype;
	/** C type : CHAR[IMOS_IPADDR_LEN] */
	public byte[] szDevAddr = new byte[IMOS_IPADDR_LEN];
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szOrgCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : int */
	public int ulIsOnline;
	/** C type : int */
	public int ulDevExtStatus;
	/** C type : int */
	public int ulIsMulticast;
	/** C type : int */
	public int ulEnableAlarm;
	/** C type : int */
	public int ulEncodeType;
	/** C type : int */
	public int ulStandard;
	/** C type : FISHEYE_INFO_S */
	public TagFishEyeInfo stFishEyeInfo;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public TagECQueryItemV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szECCode", "szECName", "ulECType", "ulDevaddrtype", "szDevAddr", "szOrgCode", "ulIsOnline", "ulDevExtStatus", "ulIsMulticast", "ulEnableAlarm", "ulEncodeType", "ulStandard", "stFishEyeInfo", "szReserve");
	}
	public TagECQueryItemV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagECQueryItemV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends TagECQueryItemV2 implements Structure.ByValue {
		
	};
}
