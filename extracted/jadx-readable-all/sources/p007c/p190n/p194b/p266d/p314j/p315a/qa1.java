package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qa1 implements ia1<oa1> {

    /* JADX INFO: renamed from: a */
    public final lv1 f18243a;

    /* JADX INFO: renamed from: b */
    public final Context f18244b;

    public qa1(lv1 lv1Var, Context context) {
        this.f18243a = lv1Var;
        this.f18244b = context;
    }

    /* JADX INFO: renamed from: a */
    public static ResolveInfo m8197a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<oa1> zza() {
        return this.f18243a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.pa1

            /* JADX INFO: renamed from: a */
            public final qa1 f17889a;

            {
                this.f17889a = this;
            }

            /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:46:0x012f  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                String string2;
                boolean zEquals;
                ActivityInfo activityInfo;
                qa1 qa1Var = this.f17889a;
                PackageManager packageManager = qa1Var.f18244b.getPackageManager();
                Locale locale = Locale.getDefault();
                boolean z = qa1.m8197a(packageManager, "geo:0,0?q=donuts") != null;
                boolean z2 = qa1.m8197a(packageManager, "http://www.google.com") != null;
                String country = locale.getCountry();
                boolean zStartsWith = Build.DEVICE.startsWith("generic");
                boolean zM5232C = C2622l.m5232C(qa1Var.f18244b);
                boolean zM5381i1 = C2622l.m5381i1(qa1Var.f18244b);
                String language = locale.getLanguage();
                ArrayList arrayList = new ArrayList();
                if (Build.VERSION.SDK_INT >= 24) {
                    LocaleList localeList = LocaleList.getDefault();
                    for (int i = 0; i < localeList.size(); i++) {
                        arrayList.add(localeList.get(i).getLanguage());
                    }
                }
                Context context = qa1Var.f18244b;
                ResolveInfo resolveInfoM8197a = qa1.m8197a(packageManager, "market://details?id=com.google.android.gms.ads");
                if (resolveInfoM8197a == null || (activityInfo = resolveInfoM8197a.activityInfo) == null) {
                    string = null;
                } else {
                    try {
                        PackageInfo packageInfoM5635c = C2794c.m5637a(context).m5635c(activityInfo.packageName, 0);
                        if (packageInfoM5635c != null) {
                            int i2 = packageInfoM5635c.versionCode;
                            String str = activityInfo.packageName;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                            sb.append(i2);
                            sb.append(".");
                            sb.append(str);
                            string = sb.toString();
                        } else {
                            string = null;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                try {
                    PackageInfo packageInfo = C2794c.m5637a(qa1Var.f18244b).f11958a.getPackageManager().getPackageInfo("com.android.vending", 128);
                    if (packageInfo != null) {
                        int i3 = packageInfo.versionCode;
                        String str2 = packageInfo.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
                        sb2.append(i3);
                        sb2.append(".");
                        sb2.append(str2);
                        string2 = sb2.toString();
                    } else {
                        string2 = null;
                    }
                } catch (Exception unused2) {
                }
                String str3 = Build.FINGERPRINT;
                Context context2 = qa1Var.f18244b;
                if (packageManager == null) {
                    zEquals = false;
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                    ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                    List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                    if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                        zEquals = false;
                    } else {
                        for (int i4 = 0; i4 < listQueryIntentActivities.size(); i4++) {
                            if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i4).activityInfo.name)) {
                                zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(C2622l.m5263I0(context2));
                            }
                        }
                        zEquals = false;
                    }
                }
                return new oa1(z, z2, country, zStartsWith, zM5232C, zM5381i1, language, arrayList, string, string2, str3, zEquals, Build.MODEL, C2330u.f10884a.f10891f.mo4720i());
            }
        });
    }
}
