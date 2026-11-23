package p007c.p190n.p194b.p266d.p297e;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4779h;

/* JADX INFO: renamed from: c.n.b.d.e.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2599z implements InterfaceC4779h {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4779h f11548a = new C2599z();

    @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4779h
    /* JADX INFO: renamed from: a */
    public final AbstractC4781i mo5192a(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = C2575c.f11499a;
        return bundle != null && bundle.containsKey("google.messenger") ? C4340s8.m10208e(null) : C4340s8.m10208e(bundle);
    }
}
