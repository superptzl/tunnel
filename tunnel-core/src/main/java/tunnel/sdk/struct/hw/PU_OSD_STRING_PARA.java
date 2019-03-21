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
public class PU_OSD_STRING_PARA extends Structure {
	/** \u4f7f\u80fd\u4e0e\u5426 */
	public boolean bEnable;
	/** C type : PU_OSD_INFO_S */
	public PU_OSD_INFO stOSDInfo;
	/** \u5b57\u7b26\u4e32\u957f\u5ea6 */
	public NativeLong ulStringLen;
	/**
	 * \u5b57\u7b26\u4e32\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 4)]
	 */
	public byte[] szString = new byte[96 + 4];
	public PU_OSD_STRING_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "stOSDInfo", "ulStringLen", "szString");
	}
	/**
	 * @param bEnable \u4f7f\u80fd\u4e0e\u5426<br>
	 * @param stOSDInfo C type : PU_OSD_INFO_S<br>
	 * @param ulStringLen \u5b57\u7b26\u4e32\u957f\u5ea6<br>
	 * @param szString \u5b57\u7b26\u4e32\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 4)]
	 */
	public PU_OSD_STRING_PARA(boolean bEnable, PU_OSD_INFO stOSDInfo, NativeLong ulStringLen, byte szString[]) {
		super();
		this.bEnable = bEnable;
		this.stOSDInfo = stOSDInfo;
		this.ulStringLen = ulStringLen;
		if ((szString.length != this.szString.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szString = szString;
	}
	public PU_OSD_STRING_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_OSD_STRING_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_OSD_STRING_PARA implements Structure.ByValue {
		
	};
}
