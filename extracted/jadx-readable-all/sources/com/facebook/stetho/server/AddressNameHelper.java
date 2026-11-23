package com.facebook.stetho.server;

import com.facebook.stetho.common.ProcessUtil;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class AddressNameHelper {
    private static final String PREFIX = "stetho_";

    public static String createCustomAddress(String str) {
        StringBuilder sbM1556G = outline.m1556G(PREFIX);
        sbM1556G.append(ProcessUtil.getProcessName());
        sbM1556G.append(str);
        return sbM1556G.toString();
    }
}
