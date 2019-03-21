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
public class PU_PTZ_PRESET_INFO_EX extends Structure {
	public NativeLong ulIndex;
	/** C type : CHAR[32] */
	public byte[] szPresetName = new byte[32];
	/** \u9a71\u52a8\u5c42\u805a\u7126\u8bb0\u5fc6\u4f7f\u80fd\u5f00\u5173 */
	public boolean bEnableFocusInfo;
	/**
	 * \u9884\u7559\u5b57<br>
	 * C type : CHAR[32]
	 */
	public byte[] szReserve = new byte[32];
	public PU_PTZ_PRESET_INFO_EX() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulIndex", "szPresetName", "bEnableFocusInfo", "szReserve");
	}
	/**
	 * @param szPresetName C type : CHAR[32]<br>
	 * @param bEnableFocusInfo \u9a71\u52a8\u5c42\u805a\u7126\u8bb0\u5fc6\u4f7f\u80fd\u5f00\u5173<br>
	 * @param szReserve \u9884\u7559\u5b57<br>
	 * C type : CHAR[32]
	 */
	public PU_PTZ_PRESET_INFO_EX(NativeLong ulIndex, byte szPresetName[], boolean bEnableFocusInfo, byte szReserve[]) {
		super();
		this.ulIndex = ulIndex;
		if ((szPresetName.length != this.szPresetName.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPresetName = szPresetName;
		this.bEnableFocusInfo = bEnableFocusInfo;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_PTZ_PRESET_INFO_EX(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PTZ_PRESET_INFO_EX implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PTZ_PRESET_INFO_EX implements Structure.ByValue {
		
	};
}
