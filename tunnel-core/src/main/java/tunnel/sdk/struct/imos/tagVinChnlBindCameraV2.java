package tunnel.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;
import static tunnel.sdk.constanst.IMOSDefLibrary.*;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagVinChnlBindCameraV2 extends Structure {
	/** C type : DEV_CHANNEL_INDEX_S */
	public TagDevChannelIndex stECChannelIndex;
	/** C type : CAMERA_INFO_S */
	public TagSCameraInfo stCameraInfo;
	/** C type : VIN_CHANNEL_S */
	public tagVideoInChannel stVinChannel;
	/** C type : MULTI_OSD_INFO_S */
	public TagMultiOsdInfo stOSDInfo;
	/** C type : int */
	public int ulVideoStreamNum;
	/** C type : VIDEO_STREAM_S[IMOS_STREAM_MAXNUM_II] */
	public tagVideoStream[] astVideoStream = new tagVideoStream[IMOS_STREAM_MAXNUM_II];
	/** C type : DETECT_AREA_S */
	public TagDetectArea stDetectArea;
	/** C type : OPTICS_PARAM_S */
	public TagOpticsParam stOpticsParam;
	public tagVinChnlBindCameraV2() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stECChannelIndex", "stCameraInfo", "stVinChannel", "stOSDInfo", "ulVideoStreamNum", "astVideoStream", "stDetectArea", "stOpticsParam");
	}
	/**
	 * @param stECChannelIndex C type : DEV_CHANNEL_INDEX_S<br>
	 * @param stCameraInfo C type : CAMERA_INFO_S<br>
	 * @param stVinChannel C type : VIN_CHANNEL_S<br>
	 * @param stOSDInfo C type : MULTI_OSD_INFO_S<br>
	 * @param ulVideoStreamNum C type : int<br>
	 * @param astVideoStream C type : VIDEO_STREAM_S[IMOS_STREAM_MAXNUM_II]<br>
	 * @param stDetectArea C type : DETECT_AREA_S<br>
	 * @param stOpticsParam C type : OPTICS_PARAM_S
	 */
	public tagVinChnlBindCameraV2(TagDevChannelIndex stECChannelIndex, TagSCameraInfo stCameraInfo, tagVideoInChannel stVinChannel, TagMultiOsdInfo stOSDInfo, int ulVideoStreamNum, tagVideoStream astVideoStream[], TagDetectArea stDetectArea, TagOpticsParam stOpticsParam) {
		super();
		this.stECChannelIndex = stECChannelIndex;
		this.stCameraInfo = stCameraInfo;
		this.stVinChannel = stVinChannel;
		this.stOSDInfo = stOSDInfo;
		this.ulVideoStreamNum = ulVideoStreamNum;
		if ((astVideoStream.length != this.astVideoStream.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.astVideoStream = astVideoStream;
		this.stDetectArea = stDetectArea;
		this.stOpticsParam = stOpticsParam;
	}
	public tagVinChnlBindCameraV2(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagVinChnlBindCameraV2 implements Structure.ByReference {
		
	};
	public static class ByValue extends tagVinChnlBindCameraV2 implements Structure.ByValue {
		
	};
}
