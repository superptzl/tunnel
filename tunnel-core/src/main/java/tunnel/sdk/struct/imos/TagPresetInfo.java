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
public class TagPresetInfo extends Structure {
	/** C type : int */
	public int ulPresetValue;
	/** C type : CHAR[IMOS_DESC_LEN] */
	public byte[] szPresetDesc = new byte[IMOS_DESC_LEN];
	public TagPresetInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulPresetValue", "szPresetDesc");
	}
	/**
	 * @param ulPresetValue C type : int<br>
	 * @param szPresetDesc C type : CHAR[IMOS_DESC_LEN]
	 */
	public TagPresetInfo(int ulPresetValue, byte szPresetDesc[]) {
		super();
		this.ulPresetValue = ulPresetValue;
		if ((szPresetDesc.length != this.szPresetDesc.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPresetDesc = szPresetDesc;
	}
	public TagPresetInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagPresetInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends TagPresetInfo implements Structure.ByValue {
		
	};
}
