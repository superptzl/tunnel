package tunnel.sdk.struct.hw;
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
public class LOCATION_INFO extends Structure {
	/** \u7403\u673a\u89d2\u5ea6 */
	public float fxDegree;
	public float fyDegree;
	public float fDZoomRatio;
	/** POS */
	public int lPOS;
	/**
	 * \u89c6\u9891\u955c\u50cf\u6a21\u5f0f<br>
	 * C type : VIDEO_VENC_ROTATION_E
	 */
	public int enVideoRotation;
	public LOCATION_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("fxDegree", "fyDegree", "fDZoomRatio", "lPOS", "enVideoRotation");
	}
	/**
	 * @param fxDegree \u7403\u673a\u89d2\u5ea6<br>
	 * @param lPOS POS<br>
	 * @param enVideoRotation \u89c6\u9891\u955c\u50cf\u6a21\u5f0f<br>
	 * C type : VIDEO_VENC_ROTATION_E
	 */
	public LOCATION_INFO(float fxDegree, float fyDegree, float fDZoomRatio, int lPOS, int enVideoRotation) {
		super();
		this.fxDegree = fxDegree;
		this.fyDegree = fyDegree;
		this.fDZoomRatio = fDZoomRatio;
		this.lPOS = lPOS;
		this.enVideoRotation = enVideoRotation;
	}
	public LOCATION_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends LOCATION_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends LOCATION_INFO implements Structure.ByValue {
		
	};
}
