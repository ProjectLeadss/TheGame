package com.epicgames.ue4;

import com.YourCompany.TheGame.OBBDownloaderService;
import com.YourCompany.TheGame.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

