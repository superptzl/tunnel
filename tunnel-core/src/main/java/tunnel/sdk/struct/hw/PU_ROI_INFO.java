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
public class PU_ROI_INFO extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/**
	 * \u7801\u6d41ID<br>
	 * C type : PU_STREAM_TYPE_E
	 */
	public int enStreamId;
	/** \u4f7f\u80fd */
	public NativeLong lEnable;
	/** \u6709\u6548\u7684ROI\u533a\u57df\u6570\u76ee */
	public NativeLong ulROINum;
	/**
	 * ROI\u77e9\u5f62\u53c2\u6570<br>
	 * C type : PU_ROI_AREA_INFO_S[8]
	 */
	public PU_ROI_AREA_INFO[] stROIAreaInfo = new PU_ROI_AREA_INFO[8];
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_ROI_INFO() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "enStreamId", "lEnable", "ulROINum", "stROIAreaInfo", "szReserved");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param enStreamId \u7801\u6d41ID<br>
	 * C type : PU_STREAM_TYPE_E<br>
	 * @param lEnable \u4f7f\u80fd<br>
	 * @param ulROINum \u6709\u6548\u7684ROI\u533a\u57df\u6570\u76ee<br>
	 * @param stROIAreaInfo ROI\u77e9\u5f62\u53c2\u6570<br>
	 * C type : PU_ROI_AREA_INFO_S[8]<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_ROI_INFO(NativeLong ulChannelId, int enStreamId, NativeLong lEnable, NativeLong ulROINum, PU_ROI_AREA_INFO stROIAreaInfo[], byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.enStreamId = enStreamId;
		this.lEnable = lEnable;
		this.ulROINum = ulROINum;
		if ((stROIAreaInfo.length != this.stROIAreaInfo.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.stROIAreaInfo = stROIAreaInfo;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_ROI_INFO(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_ROI_INFO implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_ROI_INFO implements Structure.ByValue {
		
	};
}
