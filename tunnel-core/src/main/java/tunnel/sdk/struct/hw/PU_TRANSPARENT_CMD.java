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
public class PU_TRANSPARENT_CMD extends Structure {
	/** \u4e32\u53e3\u7f16\u53f7 */
	public NativeLong ulSerialPort;
	/** \u900f\u660e\u901a\u9053\u547d\u4ee4\u957f\u5ea6 */
	public NativeLong ulCmdLen;
	/**
	 * \u900f\u660e\u901a\u9053\u547d\u4ee4<br>
	 * C type : CHAR[256]
	 */
	public byte[] szTransparentCmd = new byte[256];
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_TRANSPARENT_CMD() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulSerialPort", "ulCmdLen", "szTransparentCmd", "szReserve");
	}
	/**
	 * @param ulSerialPort \u4e32\u53e3\u7f16\u53f7<br>
	 * @param ulCmdLen \u900f\u660e\u901a\u9053\u547d\u4ee4\u957f\u5ea6<br>
	 * @param szTransparentCmd \u900f\u660e\u901a\u9053\u547d\u4ee4<br>
	 * C type : CHAR[256]<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_TRANSPARENT_CMD(NativeLong ulSerialPort, NativeLong ulCmdLen, byte szTransparentCmd[], byte szReserve[]) {
		super();
		this.ulSerialPort = ulSerialPort;
		this.ulCmdLen = ulCmdLen;
		if ((szTransparentCmd.length != this.szTransparentCmd.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szTransparentCmd = szTransparentCmd;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_TRANSPARENT_CMD(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_TRANSPARENT_CMD implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_TRANSPARENT_CMD implements Structure.ByValue {
		
	};
}
