package tunnel.sdk.struct.hw;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import tunnel.sdk.library.HWPuSDKLibrary;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : D:\HWPuSDK.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ST_BINARY extends Structure {
	public NativeLong ulBinaryLenth;
	/** C type : UCHAR* */
	public HWPuSDKLibrary.UCHAR pBinaryData;
	public ST_BINARY() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulBinaryLenth", "pBinaryData");
	}
	/** @param pBinaryData C type : UCHAR* */
	public ST_BINARY(NativeLong ulBinaryLenth, HWPuSDKLibrary.UCHAR pBinaryData) {
		super();
		this.ulBinaryLenth = ulBinaryLenth;
		this.pBinaryData = pBinaryData;
	}
	public ST_BINARY(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ST_BINARY implements Structure.ByReference {
		
	};
	public static class ByValue extends ST_BINARY implements Structure.ByValue {
		
	};
}