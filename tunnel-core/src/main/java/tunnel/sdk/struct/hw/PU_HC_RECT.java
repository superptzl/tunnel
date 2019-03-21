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
public class PU_HC_RECT extends Structure {
	public short startX;
	public short startY;
	public short width;
	public short height;
	public PU_HC_RECT() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("startX", "startY", "width", "height");
	}
	public PU_HC_RECT(short startX, short startY, short width, short height) {
		super();
		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.height = height;
	}
	public PU_HC_RECT(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_HC_RECT implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_HC_RECT implements Structure.ByValue {
		
	};
}
