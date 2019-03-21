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
public class PU_HUMANCOUNT_PARAM extends Structure {
	/** \u901a\u9053ID */
	public NativeLong ulChannelId;
	/**
	 * \u8fc7\u7ebf\u8ba1\u6570\u7b97\u6cd5\u53c2\u6570<br>
	 * C type : PU_HUMANCOUNT_ALG_PARAM_S
	 */
	public PU_HUMANCOUNT_ALG_PARAM stAlgParams;
	/**
	 * \u8fc7\u7ebf\u8ba1\u6570\u68c0\u6d4b\u533a\u57df<br>
	 * C type : PU_IGT_AERADTC_LIST_S
	 */
	public PU_IGT_AERADTC_LIST stGuardAreaList;
	/**
	 * \u8fc7\u7ebf\u8ba1\u6570\u5e03\u9632\u8ba1\u5212<br>
	 * C type : PU_ALARM_TIME_LIST_S
	 */
	public PU_ALARM_TIME_PARA_LIST stHCGuardPlan;
	/** C type : CHAR[32] */
	public byte[] szReserved = new byte[32];
	public PU_HUMANCOUNT_PARAM() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("ulChannelId", "stAlgParams", "stGuardAreaList", "stHCGuardPlan", "szReserved");
	}
	/**
	 * @param ulChannelId \u901a\u9053ID<br>
	 * @param stAlgParams \u8fc7\u7ebf\u8ba1\u6570\u7b97\u6cd5\u53c2\u6570<br>
	 * C type : PU_HUMANCOUNT_ALG_PARAM_S<br>
	 * @param stGuardAreaList \u8fc7\u7ebf\u8ba1\u6570\u68c0\u6d4b\u533a\u57df<br>
	 * C type : PU_IGT_AERADTC_LIST_S<br>
	 * @param stHCGuardPlan \u8fc7\u7ebf\u8ba1\u6570\u5e03\u9632\u8ba1\u5212<br>
	 * C type : PU_ALARM_TIME_LIST_S<br>
	 * @param szReserved C type : CHAR[32]
	 */
	public PU_HUMANCOUNT_PARAM(NativeLong ulChannelId, PU_HUMANCOUNT_ALG_PARAM stAlgParams, PU_IGT_AERADTC_LIST stGuardAreaList, PU_ALARM_TIME_PARA_LIST stHCGuardPlan, byte szReserved[]) {
		super();
		this.ulChannelId = ulChannelId;
		this.stAlgParams = stAlgParams;
		this.stGuardAreaList = stGuardAreaList;
		this.stHCGuardPlan = stHCGuardPlan;
		if ((szReserved.length != this.szReserved.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserved = szReserved;
	}
	public PU_HUMANCOUNT_PARAM(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends PU_HUMANCOUNT_PARAM implements Structure.ByReference {
		
	};
	public static class ByValue extends PU_HUMANCOUNT_PARAM implements Structure.ByValue {
		
	};
}
