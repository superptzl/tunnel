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
public class AERADTC_LIST extends Structure {
	public NativeLong ulAreaNum;
	/** C type : PU_AREA_S[(4)] */
	public PU_AREA[] stArea = new PU_AREA[4];
	public AERADTC_LIST() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulAreaNum", "stArea");
	}
	/** @param stArea C type : PU_AREA_S[(4)] */
	public AERADTC_LIST(NativeLong ulAreaNum, PU_AREA stArea[]) {
		super();
		this.ulAreaNum = ulAreaNum;
		if ((stArea.length != this.stArea.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stArea = stArea;
	}
	public AERADTC_LIST(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends AERADTC_LIST implements Structure.ByReference {
		
	};
	public static class ByValue extends AERADTC_LIST implements Structure.ByValue {
		
	};
}
