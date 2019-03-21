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
public class TagOrgResQueryItem extends Structure {
	/** C type : CHAR[IMOS_RES_CODE_LEN] */
	public byte[] szResCode = new byte[IMOS_RES_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szResName = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulResType;
	/** C type : int */
	public int ulResSubType;
	/** C type : int */
	public int ulResStatus;
	/** C type : int */
	public int ulResExtStatus;
	/** C type : int */
	public int ulResIsBeShare;
	/** C type : CHAR[IMOS_DOMAIN_CODE_LEN] */
	public byte[] szOrgCode = new byte[IMOS_DOMAIN_CODE_LEN];
	/** C type : int */
	public int ulStreamNum;
	/** C type : int */
	public int ulResIsForeign;
	public TagOrgResQueryItem() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szResCode", "szResName", "ulResType", "ulResSubType", "ulResStatus", "ulResExtStatus", "ulResIsBeShare", "szOrgCode", "ulStreamNum", "ulResIsForeign");
	}
	public TagOrgResQueryItem(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagOrgResQueryItem implements Structure.ByReference {
		
	};
	public static class ByValue extends TagOrgResQueryItem implements Structure.ByValue {
		
	};
}
