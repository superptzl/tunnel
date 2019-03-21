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
public class PU_STREAM_SMOOTH_PARA_EX extends Structure {
	public NativeLong ulChannelId;
	public boolean bEnable;
	/** \u7801\u6d41\u5e73\u6ed1\u500d\u6570,\u8303\u56f41-8,\u5bf9\u5e94\u8bbe\u5907\u500d\u65701.5-5.0,\u6b65\u957f0.5 */
	public NativeLong ulUpperCoefficient;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_STREAM_SMOOTH_PARA_EX() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "bEnable", "ulUpperCoefficient", "szReserved");
	}
	/**
	 * @param ulUpperCoefficient \u7801\u6d41\u5e73\u6ed1\u500d\u6570,\u8303\u56f41-8,\u5bf9\u5e94\u8bbe\u5907\u500d\u65701.5-5.0,\u6b65\u957f0.5<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_STREAM_SMOOTH_PARA_EX(NativeLong ulChannelId, boolean bEnable, NativeLong ulUpperCoefficient, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.bEnable = bEnable;
		this.ulUpperCoefficient = ulUpperCoefficient;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_STREAM_SMOOTH_PARA_EX(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_STREAM_SMOOTH_PARA_EX implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_STREAM_SMOOTH_PARA_EX implements Structure.ByValue {
		
	};
}
