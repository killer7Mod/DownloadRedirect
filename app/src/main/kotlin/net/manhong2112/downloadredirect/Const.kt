package net.manhong2112.downloadredirect

import net.manhong2112.downloadredirect.DLApi.ADMApi
import net.manhong2112.downloadredirect.DLApi.LoaderDroidApi
import org.jetbrains.anko.dip

/**
 * Created by manhong2112 on 11/4/2016.
 * Const Data
 */
object Const {
   val ACTION_DOWNLOAD_REDIRECT = "net.manhong2112.intent.DOWNLOAD_REDIRECTION"
   val PACKAGE_NAME = "net.manhong2112.downloadredirect"

   val ApiList = setOf(ADMApi::class.java, LoaderDroidApi::class.java)

   object id {
      val Pref_Page = 0
      val Debug_Label = 1
      val Debug_List = 2
      val Debug_Logging_Switch = 3
      val Pref_Label = 4
      val Pref_List = 5
      val Pref_HideIcon_Switch = 6
      val Filter_Label = 7
      val Filter_List = 8
      val Link_Filter = 9
      val Link_Filter_Add = 10
      val App_Filter = 11
      val App_Filter_Add = 12
      val About_Label = 13
      val About_Version = 14
      val Pref_Downloader_Selector = 15
      val Pref_Ignore_System_App = 16
      val Pref_Use_White_List = 17
      val Pref_Using_Downloader = 18
      val About_Github = 19
      val About_Email = 20
      val About_Author = 21
      val About_ListView = 22
   }
}
