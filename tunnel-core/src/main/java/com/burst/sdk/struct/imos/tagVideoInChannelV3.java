package com.burst.sdk.struct.imos;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import static com.burst.sdk.constanst.IMOSDefLibrary.*;

import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : sdk_struct.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class tagVideoInChannelV3 extends Structure {
	/** C type : VIN_CHANNEL_S */
	public tagVideoInChannel stVinChannel;
	/** C type : CHAR[IMOS_IPADDR_LEN] */
	public byte[] szExtMulticastAddr = new byte[IMOS_IPADDR_LEN];
	/** C type : int */
	public int ulExtMulticastPort;
	/** C type : int */
	public int ulEnableMotionReport;
	/** C type : int */
	public int ulMotionReportTMSCycle;
	/** C type : int */
	public int bScrambleEnable;
	/** C type : int */
	public int ulScrambleMode;
	/** C type : int */
	public int ulScrambleKeyUpdateCycle;
	/** C type : CHAR[236] */
	public byte[] szReserve = new byte[236];
	public tagVideoInChannelV3() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("stVinChannel", "szExtMulticastAddr", "ulExtMulticastPort", "ulEnableMotionReport", "ulMotionReportTMSCycle", "bScrambleEnable", "ulScrambleMode", "ulScrambleKeyUpdateCycle", "szReserve");
	}
	/**
	 * @param stVinChannel C type : VIN_CHANNEL_S<br>
	 * @param szExtMulticastAddr C type : CHAR[IMOS_IPADDR_LEN]<br>
	 * @param ulExtMulticastPort C type : int<br>
	 * @param ulEnableMotionReport C type : int<br>
	 * @param ulMotionReportTMSCycle C type : int<br>
	 * @param bScrambleEnable C type : int<br>
	 * @param ulScrambleMode C type : int<br>
	 * @param ulScrambleKeyUpdateCycle C type : int<br>
	 * @param szReserve C type : CHAR[236]
	 */
	public tagVideoInChannelV3(tagVideoInChannel stVinChannel, byte szExtMulticastAddr[], int ulExtMulticastPort, int ulEnableMotionReport, int ulMotionReportTMSCycle, int bScrambleEnable, int ulScrambleMode, int ulScrambleKeyUpdateCycle, byte szReserve[]) {
		super();
		this.stVinChannel = stVinChannel;
		if ((szExtMulticastAddr.length != this.szExtMulticastAddr.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szExtMulticastAddr = szExtMulticastAddr;
		this.ulExtMulticastPort = ulExtMulticastPort;
		this.ulEnableMotionReport = ulEnableMotionReport;
		this.ulMotionReportTMSCycle = ulMotionReportTMSCycle;
		this.bScrambleEnable = bScrambleEnable;
		this.ulScrambleMode = ulScrambleMode;
		this.ulScrambleKeyUpdateCycle = ulScrambleKeyUpdateCycle;
		if ((szReserve.length != this.szReserve.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.szReserve = szReserve;
	}
	public tagVideoInChannelV3(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends tagVideoInChannelV3 implements Structure.ByReference {
		
	};
	public static class ByValue extends tagVideoInChannelV3 implements Structure.ByValue {
		
	};
}
