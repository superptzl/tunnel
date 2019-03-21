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
public class TagQueryConditionInfo extends Structure {
	/** C type : int */
	public int ulNameCodeFlag;
	/** C type : int */
	public int ulSearchMode;
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szNameCode = new byte[IMOS_NAME_LEN];
	/** C type : int */
	public int ulTimeFlag;
	/** C type : TIME_SLICE_S */
	public tagTimeSlice stTimeSlice;
	public TagQueryConditionInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulNameCodeFlag", "ulSearchMode", "szNameCode", "ulTimeFlag", "stTimeSlice");
	}
	/**
	 * @param ulNameCodeFlag C type : int<br>
	 * @param ulSearchMode C type : int<br>
	 * @param szNameCode C type : CHAR[IMOS_NAME_LEN]<br>
	 * @param ulTimeFlag C type : int<br>
	 * @param stTimeSlice C type : TIME_SLICE_S
	 */
	public TagQueryConditionInfo(int ulNameCodeFlag, int ulSearchMode, byte szNameCode[], int ulTimeFlag, tagTimeSlice stTimeSlice) {
		super();
		this.ulNameCodeFlag = ulNameCodeFlag;
		this.ulSearchMode = ulSearchMode;
		if ((szNameCode.length != this.szNameCode.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szNameCode = szNameCode;
		this.ulTimeFlag = ulTimeFlag;
		this.stTimeSlice = stTimeSlice;
	}
	public TagQueryConditionInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagQueryConditionInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends TagQueryConditionInfo implements Structure.ByValue {
		
	};
}
