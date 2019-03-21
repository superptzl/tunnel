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
public class PU_HUMANCOUNT_ALG_PARAM extends Structure {
	/** \u8fc7\u7ebf\u8ba1\u6570\u7b97\u6cd5\u4f7f\u80fd */
	public boolean enHCEnable;
	/** OSD\u53e0\u52a0\u4f7f\u80fd */
	public boolean enOSDEnable;
	/** \u96f6\u70b9\u6e05\u96f6\u4f7f\u80fd */
	public boolean enClearAtZero;
	/**
	 * OSD\u53e0\u52a0\u4f4d\u7f6e<br>
	 * C type : PU_POINT_S
	 */
	public PU_POINT stOSDLocation;
	/** \u7b97\u6cd5\u68c0\u6d4b\u7075\u654f\u5ea6 */
	public NativeLong ulSensitivity;
	/** \u544a\u8b66\u4e0a\u62a5\u95f4\u9694 */
	public NativeLong ulAlarmTime;
	/** \u544a\u8b66\u4eba\u6570\uff08\u8d85\u8fc7\u6b64\u503c\u89e6\u53d1\u544a\u8b66\uff09 */
	public NativeLong ulAlarmHumanNum;
	/** \u4eba\u5934\u6700\u5c0f\u5c3a\u5bf8 */
	public NativeLong ulMinHeadSize;
	/**
	 * \u8fdb\u51fa\u53c2\u8003\u7ebf\uff0c\u63a8\u8350\u914d\u7f6e\u5728\u753b\u9762\u4e2d\u592e, \u7ebf\u6bb5\u63a5\u8fd1\u6c34\u5e73\u6216\u5782\u76f4<br>
	 * C type : PU_HC_LINE_S
	 */
	public PU_HC_LINE stRefLine;
	/**
	 * \u8fdb\u5165\u65b9\u5411(\u82e5\u987a\u65f6\u9488\u8d8a\u7ebf\u4e3a\u8fdb,\u82e5\u9006\u65f6\u9488\u8d8a\u7ebf\u4e3a\u51fa)<br>
	 * C type : PU_TRIPWIRE_DIR_E
	 */
	public int enInDir;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_HUMANCOUNT_ALG_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("enHCEnable", "enOSDEnable", "enClearAtZero", "stOSDLocation", "ulSensitivity", "ulAlarmTime", "ulAlarmHumanNum", "ulMinHeadSize", "stRefLine", "enInDir", "szReserved");
	}
	public PU_HUMANCOUNT_ALG_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_HUMANCOUNT_ALG_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_HUMANCOUNT_ALG_PARAM implements Structure.ByValue {
		
	};
}
