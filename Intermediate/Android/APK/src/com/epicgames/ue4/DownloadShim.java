package com.epicgames.ue4;

import com.YourCompany.thingsinabox2.OBBDownloaderService;
import com.YourCompany.thingsinabox2.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

