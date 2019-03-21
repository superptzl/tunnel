package tunnel.sdk.struct.hw;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class PU_MASK_PARA extends Structure {
	/** \u9690\u79c1\u4fdd\u62a4\u77e9\u5f62\u5de6\u4e0a\u89d2X */
	public NativeLong ulStartX;
	/** \u9690\u79c1\u4fdd\u62a4\u77e9\u5f62\u5de6\u4e0a\u89d2Y */
	public NativeLong ulStartY;
	public NativeLong ulWidth;
	public NativeLong ulHeight;
	public PU_MASK_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulStartX", "ulStartY", "ulWidth", "ulHeight");
	}
	/**
	 * @param ulStartX \u9690\u79c1\u4fdd\u62a4\u77e9\u5f62\u5de6\u4e0a\u89d2X<br>
	 * @param ulStartY \u9690\u79c1\u4fdd\u62a4\u77e9\u5f62\u5de6\u4e0a\u89d2Y
	 */
	public PU_MASK_PARA(NativeLong ulStartX, NativeLong ulStartY, NativeLong ulWidth, NativeLong ulHeight) {
		super();
		this.ulStartX = ulStartX;
		this.ulStartY = ulStartY;
		this.ulWidth = ulWidth;
		this.ulHeight = ulHeight;
	}
	public PU_MASK_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_MASK_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_MASK_PARA implements Structure.ByValue {
		
	};
}