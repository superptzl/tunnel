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
public class PU_DEC_OSD_STRING_INFO extends Structure {
	/** \u4f7f\u80fd\u4e0e\u5426 */
	public boolean bEnable;
	/** \u5b57\u7b26\u4e32\u957f\u5ea6 */
	public NativeLong ulStringLen;
	/**
	 * \u5b57\u7b26\u4e32\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 1)]
	 */
	public byte[] szString = new byte[96 + 1];
	/**
	 * OSD\u6587\u5b57\u4fe1\u606f<br>
	 * C type : PU_DEC_OSD_PARA_S
	 */
	public PU_DEC_OSD_PARA stOSDPara;
	public PU_DEC_OSD_STRING_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bEnable", "ulStringLen", "szString", "stOSDPara");
	}
	/**
	 * @param bEnable \u4f7f\u80fd\u4e0e\u5426<br>
	 * @param ulStringLen \u5b57\u7b26\u4e32\u957f\u5ea6<br>
	 * @param szString \u5b57\u7b26\u4e32\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 1)]<br>
	 * @param stOSDPara OSD\u6587\u5b57\u4fe1\u606f<br>
	 * C type : PU_DEC_OSD_PARA_S
	 */
	public PU_DEC_OSD_STRING_INFO(boolean bEnable, NativeLong ulStringLen, byte szString[], PU_DEC_OSD_PARA stOSDPara) {
		super();
		this.bEnable = bEnable;
		this.ulStringLen = ulStringLen;
		if ((szString.length != this.szString.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szString = szString;
		this.stOSDPara = stOSDPara;
	}
	public PU_DEC_OSD_STRING_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_DEC_OSD_STRING_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_DEC_OSD_STRING_INFO implements Structure.ByValue {
		
	};
}
