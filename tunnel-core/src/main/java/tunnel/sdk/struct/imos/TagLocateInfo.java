package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TagLocateInfo extends Structure {
	/** C type : int */
	public int bIsEnabled;
	/** C type : PTZ_PARAMETER_S */
	public TagPTZParam stPTZParam;
	/** C type : REVISE_PARAMETER_S */
	public TagReviseParam stReviseParam;
	public TagLocateInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bIsEnabled", "stPTZParam", "stReviseParam");
	}
	/**
	 * @param bIsEnabled C type : int<br>
	 * @param stPTZParam C type : PTZ_PARAMETER_S<br>
	 * @param stReviseParam C type : REVISE_PARAMETER_S
	 */
	public TagLocateInfo(int bIsEnabled, TagPTZParam stPTZParam, TagReviseParam stReviseParam) {
		super();
		this.bIsEnabled = bIsEnabled;
		this.stPTZParam = stPTZParam;
		this.stReviseParam = stReviseParam;
	}
	public TagLocateInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagLocateInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends TagLocateInfo implements Structure.ByValue {
		
	};
}
