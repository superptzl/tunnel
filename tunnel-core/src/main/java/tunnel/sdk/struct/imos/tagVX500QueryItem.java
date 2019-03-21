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
public class tagVX500QueryItem extends Structure {
	/** C type : CHAR[IMOS_DEVICE_CODE_LEN] */
	public byte[] szVX500Code = new byte[IMOS_DEVICE_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szVX500Name = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulVX500Type;
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szOrgCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szOrgName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulDevaddrtype;
	/** C type : CHAR[IMOS_IPADDR_LEN] */
	public byte[] szDevAddr = new byte[IMOS_IPADDR_LEN];
	/** C type : int */
	public int ulVX500DevTotalSize;
	/** C type : int */
	public int ulVX500DevUsedSize;
	/** C type : int */
	public int ulStoreRunStatus;
	/** C type : int */
	public int ulIsOnline;
	/** C type : int */
	public int ulDevExtStatus;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public tagVX500QueryItem() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szVX500Code", "szVX500Name", "ulVX500Type", "szOrgCode", "szOrgName", "ulDevaddrtype", "szDevAddr", "ulVX500DevTotalSize", "ulVX500DevUsedSize", "ulStoreRunStatus", "ulIsOnline", "ulDevExtStatus", "szReserve");
	}
	public tagVX500QueryItem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagVX500QueryItem implements Structure.ByReference {
		
	};
	public static class ByValue extends tagVX500QueryItem implements Structure.ByValue {
		
	};
}
