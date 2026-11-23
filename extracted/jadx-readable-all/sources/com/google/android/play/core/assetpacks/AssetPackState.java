package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.Objects;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p370b.C5027m0;
import p007c.p190n.p194b.p367f.p368a.p370b.C5053t;
import p007c.p190n.p194b.p367f.p368a.p370b.C5068y;
import p007c.p190n.p194b.p367f.p368a.p370b.InterfaceC5050s;

/* JADX INFO: loaded from: classes.dex */
public abstract class AssetPackState {
    /* JADX INFO: renamed from: d */
    public static AssetPackState m12910d(String str, int i, int i2, long j2, long j3, double d, int i3, String str2) {
        return new C5068y(str, i, i2, j2, j3, (int) Math.rint(100.0d * d), i3, str2);
    }

    /* JADX INFO: renamed from: e */
    public static AssetPackState m12911e(Bundle bundle, String str, C5027m0 c5027m0, InterfaceC5050s interfaceC5050s) {
        double dDoubleValue;
        int i = bundle.getInt(C4799a.m10951B("status", str));
        Objects.requireNonNull((C5053t) interfaceC5050s);
        int i2 = bundle.getInt(C4799a.m10951B("error_code", str));
        long j2 = bundle.getLong(C4799a.m10951B("bytes_downloaded", str));
        long j3 = bundle.getLong(C4799a.m10951B("total_bytes_to_download", str));
        synchronized (c5027m0) {
            Double d = c5027m0.f25874a.get(str);
            dDoubleValue = d == null ? 0.0d : d.doubleValue();
        }
        long j4 = bundle.getLong(C4799a.m10951B("pack_version", str));
        long j5 = bundle.getLong(C4799a.m10951B("pack_base_version", str));
        int i3 = 1;
        if (i == 4 && j5 != 0 && j5 != j4) {
            i3 = 2;
        }
        return m12910d(str, i, i2, j2, j3, dDoubleValue, i3, bundle.getString(C4799a.m10951B("pack_version_tag", str), ""));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo11514a();

    /* JADX INFO: renamed from: b */
    public abstract String mo11515b();

    /* JADX INFO: renamed from: c */
    public abstract long mo11516c();

    /* JADX INFO: renamed from: f */
    public abstract int mo11517f();

    /* JADX INFO: renamed from: g */
    public abstract String mo11518g();

    /* JADX INFO: renamed from: h */
    public abstract int mo11519h();

    /* JADX INFO: renamed from: i */
    public abstract long mo11520i();

    /* JADX INFO: renamed from: j */
    public abstract int mo11521j();
}
