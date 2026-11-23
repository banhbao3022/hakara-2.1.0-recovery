package p007c.p165l.p178k0;

import android.content.Intent;
import java.util.UUID;

/* JADX INFO: renamed from: c.l.k0.a, reason: use source file name */
/* JADX INFO: compiled from: AppCall.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCall {

    /* JADX INFO: renamed from: a */
    public static AppCall f4873a;

    /* JADX INFO: renamed from: b */
    public UUID f4874b;

    /* JADX INFO: renamed from: c */
    public Intent f4875c;

    /* JADX INFO: renamed from: d */
    public int f4876d;

    public AppCall(int i) {
        this(i, UUID.randomUUID());
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m2414a(AppCall appCall) {
        AppCall appCall2;
        appCall2 = f4873a;
        f4873a = appCall;
        return appCall2 != null;
    }

    public AppCall(int i, UUID uuid) {
        this.f4874b = uuid;
        this.f4876d = i;
    }
}
