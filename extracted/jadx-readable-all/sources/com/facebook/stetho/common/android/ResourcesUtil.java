package com.facebook.stetho.common.android;

import android.content.res.Resources;
import com.facebook.stetho.common.LogUtil;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class ResourcesUtil {
    private ResourcesUtil() {
    }

    private static String getFallbackIdString(int i) {
        StringBuilder sbM1556G = outline.m1556G("#");
        sbM1556G.append(Integer.toHexString(i));
        return sbM1556G.toString();
    }

    public static String getIdString(Resources resources, int i) throws Resources.NotFoundException {
        String str;
        if (resources == null) {
            return getFallbackIdString(i);
        }
        String resourcePackageName = "";
        if (getResourcePackageId(i) != 127) {
            resourcePackageName = resources.getResourcePackageName(i);
            str = ":";
        } else {
            str = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(resourceEntryName.length() + resourceTypeName.length() + str.length() + resourcePackageName.length() + 1 + 1);
        outline.m1572W(sb, "@", resourcePackageName, str, resourceTypeName);
        return outline.m1550A(sb, "/", resourceEntryName);
    }

    public static String getIdStringQuietly(Object obj, Resources resources, int i) {
        try {
            return getIdString(resources, i);
        } catch (Resources.NotFoundException unused) {
            String fallbackIdString = getFallbackIdString(i);
            LogUtil.m12611w("Unknown identifier encountered on " + obj + ": " + fallbackIdString);
            return fallbackIdString;
        }
    }

    private static int getResourcePackageId(int i) {
        return (i >>> 24) & 255;
    }
}
