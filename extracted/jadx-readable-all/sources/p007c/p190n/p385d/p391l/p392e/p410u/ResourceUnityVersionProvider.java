package p007c.p190n.p385d.p391l.p392e.p410u;

import android.content.Context;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p395k.CommonUtils;

/* JADX INFO: renamed from: c.n.d.l.e.u.a, reason: use source file name */
/* JADX INFO: compiled from: ResourceUnityVersionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceUnityVersionProvider implements UnityVersionProvider {

    /* JADX INFO: renamed from: a */
    public final Context f27011a;

    /* JADX INFO: renamed from: b */
    public boolean f27012b = false;

    /* JADX INFO: renamed from: c */
    public String f27013c;

    public ResourceUnityVersionProvider(Context context) {
        this.f27011a = context;
    }

    /* JADX INFO: renamed from: a */
    public String m12044a() {
        String string;
        if (!this.f27012b) {
            Context context = this.f27011a;
            int iM11750m = CommonUtils.m11750m(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (iM11750m != 0) {
                string = context.getResources().getString(iM11750m);
                outline.m1566Q("Unity Editor version is: ", string, Logger4.f26421a);
            } else {
                string = null;
            }
            this.f27013c = string;
            this.f27012b = true;
        }
        String str = this.f27013c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
