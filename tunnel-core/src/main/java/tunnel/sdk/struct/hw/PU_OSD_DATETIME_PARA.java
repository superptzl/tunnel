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
public class PU_OSD_DATETIME_PARA extends Structure {
	/** \u662f\u5426\u663e\u793a\u661f\u671f */
	public boolean bShowWeekday;
	/** \u65f6\u95f4\u4f7f\u80fd\u4e0e\u5426 */
	public boolean bDateEnable;
	/**
	 * \u65e5\u671f\u683c\u5f0f<br>
	 * C type : PU_OSD_DATE_TYPE_E
	 */
	public int enDateType;
	/**
	 * OSD\u663e\u793a\u7684\u8bed\u8a00\u7c7b\u578b: 0:\u7b80\u4f53\u4e2d\u6587 1:\u82f1\u6587<br>
	 * C type : PU_LANGUAGE_TYPE_E
	 */
	public int enLanguageType;
	/**
	 * \u4f4d\u7f6e\u53ca\u989c\u8272<br>
	 * C type : PU_OSD_INFO_S
	 */
	public PU_OSD_INFO stOsdPara;
	/** C type : CHAR[32] */
	public byte[] szReserve = new byte[32];
	public PU_OSD_DATETIME_PARA() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("bShowWeekday", "bDateEnable", "enDateType", "enLanguageType", "stOsdPara", "szReserve");
	}
	/**
	 * @param bShowWeekday \u662f\u5426\u663e\u793a\u661f\u671f<br>
	 * @param bDateEnable \u65f6\u95f4\u4f7f\u80fd\u4e0e\u5426<br>
	 * @param enDateType \u65e5\u671f\u683c\u5f0f<br>
	 * C type : PU_OSD_DATE_TYPE_E<br>
	 * @param enLanguageType OSD\u663e\u793a\u7684\u8bed\u8a00\u7c7b\u578b: 0:\u7b80\u4f53\u4e2d\u6587 1:\u82f1\u6587<br>
	 * C type : PU_LANGUAGE_TYPE_E<br>
	 * @param stOsdPara \u4f4d\u7f6e\u53ca\u989c\u8272<br>
	 * C type : PU_OSD_INFO_S<br>
	 * @param szReserve C type : CHAR[32]
	 */
	public PU_OSD_DATETIME_PARA(boolean bShowWeekday, boolean bDateEnable, int enDateType, int enLanguageType, PU_OSD_INFO stOsdPara, byte szReserve[]) {
		super();
		this.bShowWeekday = bShowWeekday;
		this.bDateEnable = bDateEnable;
		this.enDateType = enDateType;
		this.enLanguageType = enLanguageType;
		this.stOsdPara = stOsdPara;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public PU_OSD_DATETIME_PARA(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_OSD_DATETIME_PARA implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_OSD_DATETIME_PARA implements Structure.ByValue {
		
	};
}
