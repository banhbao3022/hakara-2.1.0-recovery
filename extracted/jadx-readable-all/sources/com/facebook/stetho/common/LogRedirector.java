package com.facebook.stetho.common;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class LogRedirector {
    private static volatile Logger sLogger;

    public interface Logger {
        boolean isLoggable(String str, int i);

        void log(int i, String str, String str2);
    }

    /* JADX INFO: renamed from: d */
    public static void m12586d(String str, String str2, Throwable th) {
        StringBuilder sbM1561L = outline.m1561L(str2, "\n");
        sbM1561L.append(formatThrowable(th));
        m12585d(str, sbM1561L.toString());
    }

    /* JADX INFO: renamed from: e */
    public static void m12588e(String str, String str2, Throwable th) {
        StringBuilder sbM1561L = outline.m1561L(str2, "\n");
        sbM1561L.append(formatThrowable(th));
        m12587e(str, sbM1561L.toString());
    }

    private static String formatThrowable(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace();
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: i */
    public static void m12590i(String str, String str2, Throwable th) {
        StringBuilder sbM1561L = outline.m1561L(str2, "\n");
        sbM1561L.append(formatThrowable(th));
        m12589i(str, sbM1561L.toString());
    }

    public static boolean isLoggable(String str, int i) {
        Logger logger = sLogger;
        return logger != null ? logger.isLoggable(str, i) : Log.isLoggable(str, i);
    }

    private static void log(int i, String str, String str2) {
        Logger logger = sLogger;
        if (logger != null) {
            logger.log(i, str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    public static void setLogger(Logger logger) {
        Util.throwIfNull(logger);
        Util.throwIfNotNull(sLogger);
        sLogger = logger;
    }

    /* JADX INFO: renamed from: v */
    public static void m12592v(String str, String str2, Throwable th) {
        StringBuilder sbM1561L = outline.m1561L(str2, "\n");
        sbM1561L.append(formatThrowable(th));
        m12591v(str, sbM1561L.toString());
    }

    /* JADX INFO: renamed from: w */
    public static void m12594w(String str, String str2, Throwable th) {
        StringBuilder sbM1561L = outline.m1561L(str2, "\n");
        sbM1561L.append(formatThrowable(th));
        m12593w(str, sbM1561L.toString());
    }

    /* JADX INFO: renamed from: d */
    public static void m12585d(String str, String str2) {
        log(3, str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m12587e(String str, String str2) {
        log(6, str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m12589i(String str, String str2) {
        log(4, str, str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m12591v(String str, String str2) {
        log(2, str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m12593w(String str, String str2) {
        log(5, str, str2);
    }
}
