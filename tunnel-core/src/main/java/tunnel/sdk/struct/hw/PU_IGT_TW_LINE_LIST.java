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
public class PU_IGT_TW_LINE_LIST extends Structure {
	public NativeLong ulLineNum;
	/** C type : PU_IGT_TW_LINE_S[5] */
	public PU_IGT_TW_LINE[] szTWLineList = new PU_IGT_TW_LINE[5];
	public PU_IGT_TW_LINE_LIST() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulLineNum", "szTWLineList");
	}
	/** @param szTWLineList C type : PU_IGT_TW_LINE_S[5] */
	public PU_IGT_TW_LINE_LIST(NativeLong ulLineNum, PU_IGT_TW_LINE szTWLineList[]) {
		super();
		this.ulLineNum = ulLineNum;
		if ((szTWLineList.length != this.szTWLineList.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szTWLineList = szTWLineList;
	}
	public PU_IGT_TW_LINE_LIST(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_IGT_TW_LINE_LIST implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_IGT_TW_LINE_LIST implements Structure.ByValue {
		
	};
}
