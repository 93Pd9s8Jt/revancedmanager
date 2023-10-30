package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.zero.app_installer.AppInstallerPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin app_installer, com.zero.app_installer.AppInstallerPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new dev.yashgarg.appcheck.AppcheckPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin appcheck, dev.yashgarg.appcheck.AppcheckPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new com.example.launchexternalapp.LaunchexternalappPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin external_app_launcher, com.example.launchexternalapp.LaunchexternalappPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin flutter_native_splash, net.jonhanson.flutter_native_splash.FlutterNativeSplashPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e);
    }
    try {
      flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
    } catch (Exception e) {
      Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e);
    }
  }
}