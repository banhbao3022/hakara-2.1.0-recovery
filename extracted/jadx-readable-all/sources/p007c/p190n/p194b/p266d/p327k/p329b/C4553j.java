package p007c.p190n.p194b.p266d.p327k.p329b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.n.b.d.k.b.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4553j extends AbstractC4675t5 {

    /* JADX INFO: renamed from: c */
    public long f24018c;

    /* JADX INFO: renamed from: d */
    public String f24019d;

    /* JADX INFO: renamed from: e */
    public Boolean f24020e;

    /* JADX INFO: renamed from: f */
    public AccountManager f24021f;

    /* JADX INFO: renamed from: g */
    public Boolean f24022g;

    /* JADX INFO: renamed from: h */
    public long f24023h;

    public C4553j(C4707w4 c4707w4) {
        super(c4707w4);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: r */
    public final boolean mo10533r() {
        Calendar calendar = Calendar.getInstance();
        this.f24018c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f24019d = outline.m1587i(outline.m1558I(lowerCase2, outline.m1558I(lowerCase, 1)), lowerCase, "-", lowerCase2);
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m10605s(Context context) {
        if (this.f24020e == null) {
            this.f24020e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f24020e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f24020e.booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public final long m10606t() {
        m10763k();
        return this.f24018c;
    }

    /* JADX INFO: renamed from: u */
    public final String m10607u() {
        m10763k();
        return this.f24019d;
    }

    /* JADX INFO: renamed from: v */
    public final long m10608v() {
        mo10381b();
        return this.f24023h;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10609w() {
        mo10381b();
        long jMo5623c = this.f24476a.f24541o.mo5623c();
        if (jMo5623c - this.f24023h > 86400000) {
            this.f24022g = null;
        }
        Boolean bool = this.f24022g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.m16133a(this.f24476a.f24528b, "android.permission.GET_ACCOUNTS") != 0) {
            mo10684l().f24422j.m10811a("Permission error checking for dasher/unicorn accounts");
            this.f24023h = jMo5623c;
            this.f24022g = Boolean.FALSE;
            return false;
        }
        if (this.f24021f == null) {
            this.f24021f = AccountManager.get(this.f24476a.f24528b);
        }
        try {
            Account[] result = this.f24021f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            if (result != null && result.length > 0) {
                this.f24022g = Boolean.TRUE;
                this.f24023h = jMo5623c;
                return true;
            }
            Account[] result2 = this.f24021f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f24022g = Boolean.TRUE;
                this.f24023h = jMo5623c;
                return true;
            }
            this.f24023h = jMo5623c;
            this.f24022g = Boolean.FALSE;
            return false;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            mo10684l().f24419g.m10812b("Exception checking account types", e);
        }
    }
}
