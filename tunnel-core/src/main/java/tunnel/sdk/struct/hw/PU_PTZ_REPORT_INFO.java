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
public class PU_PTZ_REPORT_INFO extends Structure {
	/**
	 * \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S
	 */
	public PU_EVENT_COMMON stPuEventCommon;
	/** C type : PU_LENS_INFO_S */
	public PU_LENS_INFO stCamDegree;
	/** C type : PU_CAM_GEOG_POSITION_S */
	public PU_CAM_GEOG_POSITION stCamPosition;
	/** C type : PU_CAM_INSTALL_HEIGHT_S */
	public PU_CAM_INSTALL_HEIGHT stCamFixHeight;
	/** C type : PU_CMOS_SIZE_PARA_S */
	public PU_CMOS_SIZE_PARA stCamCMOSSize;
	public PU_PTZ_REPORT_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stPuEventCommon", "stCamDegree", "stCamPosition", "stCamFixHeight", "stCamCMOSSize");
	}
	/**
	 * @param stPuEventCommon \u901a\u7528\u4e8b\u4ef6<br>
	 * C type : PU_EVENT_COMMON_S<br>
	 * @param stCamDegree C type : PU_LENS_INFO_S<br>
	 * @param stCamPosition C type : PU_CAM_GEOG_POSITION_S<br>
	 * @param stCamFixHeight C type : PU_CAM_INSTALL_HEIGHT_S<br>
	 * @param stCamCMOSSize C type : PU_CMOS_SIZE_PARA_S
	 */
	public PU_PTZ_REPORT_INFO(PU_EVENT_COMMON stPuEventCommon, PU_LENS_INFO stCamDegree, PU_CAM_GEOG_POSITION stCamPosition, PU_CAM_INSTALL_HEIGHT stCamFixHeight, PU_CMOS_SIZE_PARA stCamCMOSSize) {
		super();
		this.stPuEventCommon = stPuEventCommon;
		this.stCamDegree = stCamDegree;
		this.stCamPosition = stCamPosition;
		this.stCamFixHeight = stCamFixHeight;
		this.stCamCMOSSize = stCamCMOSSize;
	}
	public PU_PTZ_REPORT_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_PTZ_REPORT_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_PTZ_REPORT_INFO implements Structure.ByValue {
		
	};
}
