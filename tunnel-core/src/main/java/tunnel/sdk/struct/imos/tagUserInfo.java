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
public class tagUserInfo extends Structure {
	/** C type : CHAR[IMOS_USER_CODE_LEN] */
	public byte[] szUserCode = new byte[IMOS_USER_CODE_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szUserName = new byte[IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szUserFullName = new byte[IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_NAME_LEN] */
	public byte[] szOrgName = new byte[IMOS_NAME_LEN];
	/** C type : CHAR[IMOS_PHONE_LEN] */
	public byte[] szTelePhone = new byte[IMOS_PHONE_LEN];
	/** C type : CHAR[IMOS_MOBILE_LEN] */
	public byte[] szMobilePhone = new byte[IMOS_MOBILE_LEN];
	/** C type : CHAR[IMOS_PHONE_LEN] */
	public byte[] szFax = new byte[IMOS_PHONE_LEN];
	/** C type : CHAR[IMOS_MAIL_LEN] */
	public byte[] szEmail = new byte[IMOS_MAIL_LEN];
	/** C type : int */
	public int ulPasswdPermanetFlag;
	/** C type : CHAR[IMOS_TIME_LEN] */
	public byte[] szPasswdValidDate = new byte[IMOS_TIME_LEN];
	/** C type : int */
	public int ulPasswdValidDays;
	/** C type : int */
	public int ulPasswdValidFlag;
	/** C type : int */
	public int ulUserLockFlag;
	/** C type : int */
	public int ulUserType;
	/** C type : CHAR[IMOS_DESC_LEN] */
	public byte[] szUserDes = new byte[IMOS_DESC_LEN];
	/** C type : CHAR[IMOS_TIME_CODE_LEN] */
	public byte[] szBeginTime1 = new byte[IMOS_TIME_CODE_LEN];
	/** C type : CHAR[IMOS_TIME_CODE_LEN] */
	public byte[] szEndTime1 = new byte[IMOS_TIME_CODE_LEN];
	/** C type : CHAR[IMOS_TIME_CODE_LEN] */
	public byte[] szBeginTime2 = new byte[IMOS_TIME_CODE_LEN];
	/** C type : CHAR[IMOS_TIME_CODE_LEN] */
	public byte[] szEndTime2 = new byte[IMOS_TIME_CODE_LEN];
	/** C type : CHAR[IMOS_WEEK_CODE_LEN] */
	public byte[] szWeekChoice = new byte[IMOS_WEEK_CODE_LEN];
	/** C type : int */
	public int ulTotalTime;
	/** C type : CHAR[IMOS_TIME_CODE_LEN] */
	public byte[] szBeginDate = new byte[IMOS_TIME_CODE_LEN];
	/** C type : CHAR[IMOS_TIME_CODE_LEN] */
	public byte[] szEndDate = new byte[IMOS_TIME_CODE_LEN];
	/** C type : int */
	public int ulMaxXPChannel;
	/** C type : CHAR[8] */
	public byte[] szReserve = new byte[8];
	public tagUserInfo() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("szUserCode", "szUserName", "szUserFullName", "szOrgName", "szTelePhone", "szMobilePhone", "szFax", "szEmail", "ulPasswdPermanetFlag", "szPasswdValidDate", "ulPasswdValidDays", "ulPasswdValidFlag", "ulUserLockFlag", "ulUserType", "szUserDes", "szBeginTime1", "szEndTime1", "szBeginTime2", "szEndTime2", "szWeekChoice", "ulTotalTime", "szBeginDate", "szEndDate", "ulMaxXPChannel", "szReserve");
	}
	public tagUserInfo(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagUserInfo implements Structure.ByReference {
		
	};
	public static class ByValue extends tagUserInfo implements Structure.ByValue {
		
	};
}
