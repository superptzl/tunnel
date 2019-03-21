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
public class PU_CUSTOM_OSD_PARA extends Structure {
	/**
	 * OSD\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 1)]
	 */
	public byte[] acOSDContent = new byte[96 + 1];
	public PU_CUSTOM_OSD_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("acOSDContent");
	}
	/**
	 * @param acOSDContent OSD\u5185\u5bb9<br>
	 * C type : CHAR[(96 + 1)]
	 */
	public PU_CUSTOM_OSD_PARA(byte acOSDContent[]) {
		super();
		if ((acOSDContent.length != this.acOSDContent.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.acOSDContent = acOSDContent;
	}
	public PU_CUSTOM_OSD_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_CUSTOM_OSD_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_CUSTOM_OSD_PARA implements Structure.ByValue {
		
	};
}
