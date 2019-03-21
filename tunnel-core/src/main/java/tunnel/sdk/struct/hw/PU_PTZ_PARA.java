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
public class PU_PTZ_PARA extends Structure {
	/** \u4e91\u53f0\u7f16\u53f7 */
	public NativeLong ulPtzId;
	/** \u4e32\u53e3\u7f16\u53f7 */
	public NativeLong ulSerialPort;
	/**
	 * \u89e3\u7801\u5668\u7c7b\u578b<br>
	 * C type : PU_PTZ_DECODER_TYPE_E
	 */
	public int enDecoderType;
	/** \u89e3\u7801\u5668\u5730\u5740 */
	public NativeLong ulDecoderAddress;
	/**
	 * \u6b63\u53cd\u63a7\u5236\u6a21\u5f0f<br>
	 * C type : PU_PTZ_CONTROL_MODE_E
	 */
	public int enPtzControlMode;
	/** \u662f\u5426\u4f7f\u80fd */
	public boolean bEnable;
	public PU_PTZ_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulPtzId", "ulSerialPort", "enDecoderType", "ulDecoderAddress", "enPtzControlMode", "bEnable");
	}
	/**
	 * @param ulPtzId \u4e91\u53f0\u7f16\u53f7<br>
	 * @param ulSerialPort \u4e32\u53e3\u7f16\u53f7<br>
	 * @param enDecoderType \u89e3\u7801\u5668\u7c7b\u578b<br>
	 * C type : PU_PTZ_DECODER_TYPE_E<br>
	 * @param ulDecoderAddress \u89e3\u7801\u5668\u5730\u5740<br>
	 * @param enPtzControlMode \u6b63\u53cd\u63a7\u5236\u6a21\u5f0f<br>
	 * C type : PU_PTZ_CONTROL_MODE_E<br>
	 * @param bEnable \u662f\u5426\u4f7f\u80fd
	 */
	public PU_PTZ_PARA(NativeLong ulPtzId, NativeLong ulSerialPort, int enDecoderType, NativeLong ulDecoderAddress, int enPtzControlMode, boolean bEnable) {
		super();
		this.ulPtzId = ulPtzId;
		this.ulSerialPort = ulSerialPort;
		this.enDecoderType = enDecoderType;
		this.ulDecoderAddress = ulDecoderAddress;
		this.enPtzControlMode = enPtzControlMode;
		this.bEnable = bEnable;
	}
	public PU_PTZ_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PTZ_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PTZ_PARA implements Structure.ByValue {
		
	};
}
