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
public class PU_MEDIA_PLAY_RSP extends Structure {
	/** \u5a92\u4f53\u6d41\u7684\u552f\u4e00\u6807\u5fd7 */
	public NativeLong ulSessionId;
	/**
	 * \u53d1\u9001\u7aef\u7684\u7aef\u53e3\u4fe1\u606f<br>
	 * C type : PU_PORT_INFO_S
	 */
	public PU_PORT_INFO stPeerPortInfo;
	/**
	 * \u53d1\u9001\u7aef\u7684IP<br>
	 * C type : CHAR[16]
	 */
	public byte[] szPeerIp = new byte[16];
	/**
	 * \u89c6\u9891\u7f16\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E
	 */
	public int enVideoEncodeType;
	/**
	 * \u97f3\u9891\u7f16\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E
	 */
	public int enAudioEncodeType;
	/**
	 * \u5f55\u50cf\u5b9e\u9645\u5f00\u59cb\u65f6\u95f4<br>
	 * C type : PU_TIME_S
	 */
	public PU_TIME stStartTime;
	/**
	 * \u5f55\u50cf\u5b9e\u9645\u7ed3\u675f\u65f6\u95f4<br>
	 * C type : PU_TIME_S
	 */
	public PU_TIME stEndTime;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_MEDIA_PLAY_RSP() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulSessionId", "stPeerPortInfo", "szPeerIp", "enVideoEncodeType", "enAudioEncodeType", "stStartTime", "stEndTime", "szReserved");
	}
	/**
	 * @param ulSessionId \u5a92\u4f53\u6d41\u7684\u552f\u4e00\u6807\u5fd7<br>
	 * @param stPeerPortInfo \u53d1\u9001\u7aef\u7684\u7aef\u53e3\u4fe1\u606f<br>
	 * C type : PU_PORT_INFO_S<br>
	 * @param szPeerIp \u53d1\u9001\u7aef\u7684IP<br>
	 * C type : CHAR[16]<br>
	 * @param enVideoEncodeType \u89c6\u9891\u7f16\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E<br>
	 * @param enAudioEncodeType \u97f3\u9891\u7f16\u7801\u7c7b\u578b<br>
	 * C type : PU_ENCODE_TYPE_E<br>
	 * @param stStartTime \u5f55\u50cf\u5b9e\u9645\u5f00\u59cb\u65f6\u95f4<br>
	 * C type : PU_TIME_S<br>
	 * @param stEndTime \u5f55\u50cf\u5b9e\u9645\u7ed3\u675f\u65f6\u95f4<br>
	 * C type : PU_TIME_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_MEDIA_PLAY_RSP(NativeLong ulSessionId, PU_PORT_INFO stPeerPortInfo, byte szPeerIp[], int enVideoEncodeType, int enAudioEncodeType, PU_TIME stStartTime, PU_TIME stEndTime, byte szReserved[]) {
		super();
		this.ulSessionId = ulSessionId;
		this.stPeerPortInfo = stPeerPortInfo;
		if ((szPeerIp.length != this.szPeerIp.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szPeerIp = szPeerIp;
		this.enVideoEncodeType = enVideoEncodeType;
		this.enAudioEncodeType = enAudioEncodeType;
		this.stStartTime = stStartTime;
		this.stEndTime = stEndTime;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_MEDIA_PLAY_RSP(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_MEDIA_PLAY_RSP implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_MEDIA_PLAY_RSP implements Structure.ByValue {
		
	};
}
