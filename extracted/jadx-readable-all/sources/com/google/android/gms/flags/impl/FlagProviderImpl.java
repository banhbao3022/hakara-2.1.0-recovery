package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p312i.AbstractBinderC2823c;
import p007c.p190n.p194b.p266d.p312i.p313a.C2820e;
import p007c.p190n.p194b.p266d.p312i.p313a.CallableC2816a;
import p007c.p190n.p194b.p266d.p312i.p313a.CallableC2817b;
import p007c.p190n.p194b.p266d.p312i.p313a.CallableC2818c;
import p007c.p190n.p194b.p266d.p312i.p313a.CallableC2819d;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class FlagProviderImpl extends AbstractBinderC2823c {

    /* JADX INFO: renamed from: f */
    public boolean f28687f = false;

    /* JADX INFO: renamed from: g */
    public SharedPreferences f28688g;

    @Override // p007c.p190n.p194b.p266d.p312i.InterfaceC2822b
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f28687f) {
            return z;
        }
        SharedPreferences sharedPreferences = this.f28688g;
        Boolean boolValueOf = Boolean.valueOf(z);
        try {
            boolValueOf = (Boolean) C2622l.m5248F0(new CallableC2816a(sharedPreferences, str, boolValueOf));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return boolValueOf.booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p312i.InterfaceC2822b
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f28687f) {
            return i;
        }
        SharedPreferences sharedPreferences = this.f28688g;
        Integer numValueOf = Integer.valueOf(i);
        try {
            numValueOf = (Integer) C2622l.m5248F0(new CallableC2817b(sharedPreferences, str, numValueOf));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return numValueOf.intValue();
    }

    @Override // p007c.p190n.p194b.p266d.p312i.InterfaceC2822b
    public long getLongFlagValue(String str, long j2, int i) {
        if (!this.f28687f) {
            return j2;
        }
        SharedPreferences sharedPreferences = this.f28688g;
        Long lValueOf = Long.valueOf(j2);
        try {
            lValueOf = (Long) C2622l.m5248F0(new CallableC2818c(sharedPreferences, str, lValueOf));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
        }
        return lValueOf.longValue();
    }

    @Override // p007c.p190n.p194b.p266d.p312i.InterfaceC2822b
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f28687f) {
            return str2;
        }
        try {
            return (String) C2622l.m5248F0(new CallableC2819d(this.f28688g, str, str2));
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagDataUtils", strValueOf.length() != 0 ? "Flag value not available, returning default: ".concat(strValueOf) : new String("Flag value not available, returning default: "));
            return str2;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p312i.InterfaceC2822b
    public void init(InterfaceC2799a interfaceC2799a) {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        if (this.f28687f) {
            return;
        }
        try {
            this.f28688g = C2820e.m5651a(context.createPackageContext("com.google.android.gms", 0));
            this.f28687f = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            Log.w("FlagProviderImpl", strValueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(strValueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
