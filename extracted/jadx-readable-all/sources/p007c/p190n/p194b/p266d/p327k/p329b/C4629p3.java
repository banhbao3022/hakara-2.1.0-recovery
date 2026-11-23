package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2662h;
import p007c.p190n.p194b.p266d.p298f.p302q.C2765w;
import p007c.p190n.p194b.p266d.p298f.p309v.C2792a;
import p007c.p190n.p194b.p266d.p314j.p325k.C4286oa;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p314j.p325k.C4357tb;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4397wb;

/* JADX INFO: renamed from: c.n.b.d.k.b.p3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4629p3 extends AbstractC4475c5 {

    /* JADX INFO: renamed from: c */
    public String f24256c;

    /* JADX INFO: renamed from: d */
    public String f24257d;

    /* JADX INFO: renamed from: e */
    public int f24258e;

    /* JADX INFO: renamed from: f */
    public String f24259f;

    /* JADX INFO: renamed from: g */
    public long f24260g;

    /* JADX INFO: renamed from: h */
    public long f24261h;

    /* JADX INFO: renamed from: i */
    public List<String> f24262i;

    /* JADX INFO: renamed from: j */
    public int f24263j;

    /* JADX INFO: renamed from: k */
    public String f24264k;

    /* JADX INFO: renamed from: l */
    public String f24265l;

    /* JADX INFO: renamed from: m */
    public String f24266m;

    public C4629p3(C4707w4 c4707w4, long j2) {
        super(c4707w4);
        this.f24261h = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4475c5
    /* JADX INFO: renamed from: v */
    public final boolean mo10481v() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a5 A[Catch: NotFoundException -> 0x02aa, TRY_LEAVE, TryCatch #0 {NotFoundException -> 0x02aa, blocks: (B:110:0x0292, B:113:0x02a5), top: B:138:0x0292 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x02be  */
    /* JADX WARN: Code duplicated, block: B:122:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:138:0x0292 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:? A[LOOP:0: B:123:0x02cf->B:150:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0188  */
    /* JADX INFO: renamed from: w */
    public final void m10713w() {
        Status status;
        boolean z;
        Integer numValueOf;
        String[] stringArray;
        Iterator<String> it;
        String installerPackageName = "unknown";
        String str = "Unknown";
        String packageName = this.f24476a.f24528b.getPackageName();
        PackageManager packageManager = this.f24476a.f24528b.getPackageManager();
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            mo10684l().f24418f.m10812b("PackageManager is null, app identity information might be inaccurate. appId", C4662s3.m10738s(packageName));
        } else {
            try {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                mo10684l().f24418f.m10812b("Error retrieving app installer package name. appId", C4662s3.m10738s(packageName));
            }
            if (installerPackageName == null) {
                installerPackageName = "manual_install";
            } else if ("com.android.vending".equals(installerPackageName)) {
                installerPackageName = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f24476a.f24528b.getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    if (!TextUtils.isEmpty(applicationLabel)) {
                        applicationLabel.toString();
                    }
                    str = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                mo10684l().f24418f.m10813c("Error retrieving package info. appId, appName", C4662s3.m10738s(packageName), "Unknown");
            }
        }
        this.f24256c = packageName;
        this.f24259f = installerPackageName;
        this.f24257d = str;
        this.f24258e = i;
        this.f24260g = 0L;
        Context context = this.f24476a.f24528b;
        Object obj = C2662h.f11694a;
        C2622l.m5379i(context, "Context must not be null.");
        synchronized (C2662h.f11694a) {
            if (C2662h.f11695b == null) {
                C2662h.f11695b = new C2662h(context);
            }
            status = C2662h.f11695b.f11697d;
        }
        boolean z2 = true;
        boolean z3 = status != null && status.m12654H();
        boolean z4 = !TextUtils.isEmpty(this.f24476a.f24529c) && "am".equals(this.f24476a.f24530d);
        boolean z5 = z3 | z4;
        if (!z5) {
            if (status == null) {
                mo10684l().f24419g.m10811a("GoogleService failed to initialize (no status)");
            } else {
                mo10684l().f24419g.m10813c("GoogleService failed to initialize, status", Integer.valueOf(status.f28654l), status.f28655m);
            }
        }
        if (z5) {
            int iM10829e = this.f24476a.m10829e();
            switch (iM10829e) {
                case 0:
                    mo10684l().f24426n.m10811a("App measurement collection enabled");
                    break;
                case 1:
                    mo10684l().f24424l.m10811a("App measurement deactivated via the manifest");
                    break;
                case 2:
                    mo10684l().f24426n.m10811a("App measurement deactivated via the init parameters");
                    break;
                case 3:
                    mo10684l().f24424l.m10811a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                    break;
                case 4:
                    mo10684l().f24424l.m10811a("App measurement disabled via the manifest");
                    break;
                case 5:
                    mo10684l().f24426n.m10811a("App measurement disabled via the init parameters");
                    break;
                case 6:
                    mo10684l().f24423k.m10811a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                    break;
                case 7:
                    mo10684l().f24424l.m10811a("App measurement disabled via the global data collection setting");
                    break;
                case 8:
                    mo10684l().f24424l.m10811a("App measurement disabled due to denied storage consent");
                    break;
                default:
                    mo10684l().f24424l.m10811a("App measurement disabled");
                    mo10684l().f24419g.m10811a("Invalid scion state in identity");
                    break;
            }
            if (iM10829e == 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.f24264k = "";
        this.f24265l = "";
        this.f24266m = "";
        if (z4) {
            this.f24265l = this.f24476a.f24529c;
        }
        try {
            String strM10211h = (((InterfaceC4397wb) C4357tb.f23488f.zza()).zza() && this.f24476a.f24534h.m10417k(C4647r.f24301C0)) ? C4340s8.m10211h(this.f24476a.f24528b, "google_app_id") : C2662h.m5537a("getGoogleAppId").f11696c;
            this.f24264k = TextUtils.isEmpty(strM10211h) ? "" : strM10211h;
            if (C4286oa.m10122a() && this.f24476a.f24534h.m10417k(C4647r.f24356j0)) {
                C2765w c2765w = new C2765w(this.f24476a.f24528b);
                String strM5611a = c2765w.m5611a("ga_app_id");
                this.f24266m = TextUtils.isEmpty(strM5611a) ? "" : strM5611a;
                if (!TextUtils.isEmpty(strM10211h) || !TextUtils.isEmpty(strM5611a)) {
                    this.f24265l = c2765w.m5611a("admob_app_id");
                }
            } else if (!TextUtils.isEmpty(strM10211h)) {
                this.f24265l = new C2765w(this.f24476a.f24528b).m5611a("admob_app_id");
            }
            if (z) {
                mo10684l().f24426n.m10813c("App measurement enabled for app package, google app id", this.f24256c, TextUtils.isEmpty(this.f24264k) ? this.f24265l : this.f24264k);
            }
        } catch (IllegalStateException e) {
            mo10684l().f24418f.m10813c("Fetching Google App Id failed with exception. appId", C4662s3.m10738s(packageName), e);
        }
        List<String> listAsList = null;
        this.f24262i = null;
        C4469c c4469c = this.f24476a.f24534h;
        Objects.requireNonNull(c4469c);
        C2622l.m5359e("analytics.safelisted_events");
        Bundle bundleM10413D = c4469c.m10413D();
        if (bundleM10413D != null) {
            if (bundleM10413D.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM10413D.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                try {
                    stringArray = c4469c.f24476a.f24528b.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    }
                } catch (Resources.NotFoundException e2) {
                    c4469c.mo10684l().f24418f.m10812b("Failed to load string array from metadata: resource not found", e2);
                }
            }
            if (listAsList != null) {
                if (listAsList.size() == 0) {
                    mo10684l().f24423k.m10811a("Safelisted event list is empty. Ignoring");
                } else {
                    it = listAsList.iterator();
                    while (it.hasNext()) {
                        if (!m10817f().m10895m0("safelisted event", it.next())) {
                        }
                    }
                }
                z2 = false;
            }
            if (z2) {
                this.f24262i = listAsList;
            }
            if (packageManager != null) {
                this.f24263j = C2792a.m5632a(this.f24476a.f24528b) ? 1 : 0;
            } else {
                this.f24263j = 0;
            }
        }
        c4469c.mo10684l().f24418f.m10811a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = c4469c.f24476a.f24528b.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = Arrays.asList(stringArray);
            }
        }
        if (listAsList != null) {
            if (listAsList.size() == 0) {
                mo10684l().f24423k.m10811a("Safelisted event list is empty. Ignoring");
            } else {
                it = listAsList.iterator();
                while (it.hasNext()) {
                    if (!m10817f().m10895m0("safelisted event", it.next())) {
                    }
                }
            }
            z2 = false;
        }
        if (z2) {
            this.f24262i = listAsList;
        }
        if (packageManager != null) {
            this.f24263j = C2792a.m5632a(this.f24476a.f24528b) ? 1 : 0;
        } else {
            this.f24263j = 0;
        }
    }
}
