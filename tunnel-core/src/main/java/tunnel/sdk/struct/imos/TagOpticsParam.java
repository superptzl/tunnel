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
public class TagOpticsParam extends Structure {
	/** C type : int */
	public int ulOpticsIndex;
	/** C type : int */
	public int ulBlackWhiteMode;
	/** C type : int */
	public int ulBlackWhiteSense;
	/** C type : int */
	public int ulAutoExposal;
	/** C type : int */
	public int ulShutter;
	/** C type : int */
	public int ulOpticsAGC;
	/** C type : int */
	public int ulVideoAEMetering;
	/** C type : int */
	public int ulVideoSharpness;
	/** C type : int */
	public int ulWhiteBalance;
	/** C type : int */
	public int ulVideoMirror;
	/** C type : int */
	public int ulVideoFlicker;
	/** C type : int */
	public int bEnableWDR;
	/** C type : int */
	public int bEnableBLC;
	/** C type : int */
	public int ulReserved3;
	public TagOpticsParam() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulOpticsIndex", "ulBlackWhiteMode", "ulBlackWhiteSense", "ulAutoExposal", "ulShutter", "ulOpticsAGC", "ulVideoAEMetering", "ulVideoSharpness", "ulWhiteBalance", "ulVideoMirror", "ulVideoFlicker", "bEnableWDR", "bEnableBLC", "ulReserved3");
	}
	public TagOpticsParam(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TagOpticsParam implements Structure.ByReference {
		
	};
	public static class ByValue extends TagOpticsParam implements Structure.ByValue {
		
	};
}
