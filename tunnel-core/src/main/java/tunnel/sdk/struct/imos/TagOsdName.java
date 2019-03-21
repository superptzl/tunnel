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
public class TagOsdName extends Structure {
	/** C type : int */
	public int ulEnabledFlag;
	/** C type : int */
	public int ulOsdNameIndex;
	/** C type : int */
	public int ulOsdColor;
	/** C type : int */
	public int ulTransparence;
	/** C type : AREA_SCOPE_S */
	public TagAreaScope stAreaScope;
	/** C type : int */
	public int ulOsdType1;
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szOsdString1 = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulOsdType2;
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szOsdString2 = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulSwitchIntval;
	/** C type : int */
	public int ulOsdNameType;
	/** C type : CHAR[12] */
	public byte[] szReserve = new byte[12];
	public TagOsdName() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulEnabledFlag", "ulOsdNameIndex", "ulOsdColor", "ulTransparence", "stAreaScope", "ulOsdType1", "szOsdString1", "ulOsdType2", "szOsdString2", "ulSwitchIntval", "ulOsdNameType", "szReserve");
	}
	public TagOsdName(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagOsdName implements Structure.ByReference {
		
	};
	public static class ByValue extends TagOsdName implements Structure.ByValue {
		
	};
}
