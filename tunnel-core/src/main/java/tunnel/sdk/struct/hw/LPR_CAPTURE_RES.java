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
public class LPR_CAPTURE_RES extends Structure {
	/**
	 * \u6293\u62cd\u65f6\u95f4<br>
	 * C type : CHAR[32]
	 */
	public byte[] szLocalTime = new byte[32];
	/** \u8f66\u9053\u53f7 */
	public int iLaneID;
	/**
	 * \u8f66\u8f86\u4fe1\u606f<br>
	 * C type : PU_VEHICLE_INFO_S
	 */
	public PU_VEHICLE_INFO stVehicleInfo;
	/**
	 * \u8f66\u724c\u4fe1\u606f<br>
	 * C type : PU_PLATE_INFO_S
	 */
	public PU_PLATE_INFO stPlateInfo;
	/**
	 * \u5168\u666f\u56fe\u7247Buffer<br>
	 * C type : CHAR*
	 */
	public Pointer pPicBuffer;
	/** \u5168\u666f\u56fe\u7247\u5927\u5c0f */
	public int uiPicSize;
	/**
	 * \u8f66\u724c\u7279\u5199\u56fe\u7247Buffer<br>
	 * C type : CHAR*
	 */
	public Pointer pLPBuffer;
	/** \u8f66\u724c\u7279\u5199\u56fe\u7247\u5927\u5c0f */
	public int uiLPPicSize;
	/**
	 * \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[512]
	 */
	public byte[] szReserved = new byte[512];
	public LPR_CAPTURE_RES() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szLocalTime", "iLaneID", "stVehicleInfo", "stPlateInfo", "pPicBuffer", "uiPicSize", "pLPBuffer", "uiLPPicSize", "szReserved");
	}
	/**
	 * @param szLocalTime \u6293\u62cd\u65f6\u95f4<br>
	 * C type : CHAR[32]<br>
	 * @param iLaneID \u8f66\u9053\u53f7<br>
	 * @param stVehicleInfo \u8f66\u8f86\u4fe1\u606f<br>
	 * C type : PU_VEHICLE_INFO_S<br>
	 * @param stPlateInfo \u8f66\u724c\u4fe1\u606f<br>
	 * C type : PU_PLATE_INFO_S<br>
	 * @param pPicBuffer \u5168\u666f\u56fe\u7247Buffer<br>
	 * C type : CHAR*<br>
	 * @param uiPicSize \u5168\u666f\u56fe\u7247\u5927\u5c0f<br>
	 * @param pLPBuffer \u8f66\u724c\u7279\u5199\u56fe\u7247Buffer<br>
	 * C type : CHAR*<br>
	 * @param uiLPPicSize \u8f66\u724c\u7279\u5199\u56fe\u7247\u5927\u5c0f<br>
	 * @param szReserved \u9884\u7559\u5b57\u6bb5<br>
	 * C type : CHAR[512]
	 */
	public LPR_CAPTURE_RES(byte szLocalTime[], int iLaneID, PU_VEHICLE_INFO stVehicleInfo, PU_PLATE_INFO stPlateInfo, Pointer pPicBuffer, int uiPicSize, Pointer pLPBuffer, int uiLPPicSize, byte szReserved[]) {
		super();
		if ((szLocalTime.length != this.szLocalTime.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szLocalTime = szLocalTime;
		this.iLaneID = iLaneID;
		this.stVehicleInfo = stVehicleInfo;
		this.stPlateInfo = stPlateInfo;
		this.pPicBuffer = pPicBuffer;
		this.uiPicSize = uiPicSize;
		this.pLPBuffer = pLPBuffer;
		this.uiLPPicSize = uiLPPicSize;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public LPR_CAPTURE_RES(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends LPR_CAPTURE_RES implements Structure.ByReference {
		
	};
	public static class ByValue extends LPR_CAPTURE_RES implements Structure.ByValue {
		
	};
}
