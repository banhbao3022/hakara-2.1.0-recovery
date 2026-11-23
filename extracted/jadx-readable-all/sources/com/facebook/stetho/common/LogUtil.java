package com.facebook.stetho.common;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class LogUtil {
    private static final String TAG = "stetho";

    /* JADX INFO: renamed from: d */
    public static void m12596d(String str, Object... objArr) {
        m12595d(format(str, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m12600e(String str, Object... objArr) {
        m12599e(format(str, objArr));
    }

    private static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m12604i(String str, Object... objArr) {
        m12603i(format(str, objArr));
    }

    public static boolean isLoggable(int i) {
        if (i == 5 || i == 6) {
            return true;
        }
        return LogRedirector.isLoggable(TAG, i);
    }

    /* JADX INFO: renamed from: v */
    public static void m12608v(String str, Object... objArr) {
        m12607v(format(str, objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m12612w(String str, Object... objArr) {
        m12611w(format(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m12598d(Throwable th, String str, Object... objArr) {
        m12597d(th, format(str, objArr));
    }

    /* JADX INFO: renamed from: e */
    public static void m12602e(Throwable th, String str, Object... objArr) {
        m12601e(th, format(str, objArr));
    }

    /* JADX INFO: renamed from: i */
    public static void m12606i(Throwable th, String str, Object... objArr) {
        m12605i(th, format(str, objArr));
    }

    /* JADX INFO: renamed from: v */
    public static void m12610v(Throwable th, String str, Object... objArr) {
        m12609v(th, format(str, objArr));
    }

    /* JADX INFO: renamed from: w */
    public static void m12614w(Throwable th, String str, Object... objArr) {
        m12613w(th, format(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static void m12595d(String str) {
        if (isLoggable(3)) {
            LogRedirector.m12585d(TAG, str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12599e(String str) {
        if (isLoggable(6)) {
            LogRedirector.m12587e(TAG, str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12603i(String str) {
        if (isLoggable(4)) {
            LogRedirector.m12589i(TAG, str);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m12607v(String str) {
        if (isLoggable(2)) {
            LogRedirector.m12591v(TAG, str);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m12611w(String str) {
        if (isLoggable(5)) {
            LogRedirector.m12593w(TAG, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12597d(Throwable th, String str) {
        if (isLoggable(3)) {
            LogRedirector.m12586d(TAG, str, th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m12601e(Throwable th, String str) {
        if (isLoggable(6)) {
            LogRedirector.m12588e(TAG, str, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m12605i(Throwable th, String str) {
        if (isLoggable(4)) {
            LogRedirector.m12590i(TAG, str, th);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m12609v(Throwable th, String str) {
        if (isLoggable(2)) {
            LogRedirector.m12592v(TAG, str, th);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m12613w(Throwable th, String str) {
        if (isLoggable(5)) {
            LogRedirector.m12594w(TAG, str, th);
        }
    }
}
