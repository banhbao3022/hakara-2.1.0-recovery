package p007c.p190n.p385d.p386j.p389b;

import com.google.firebase.analytics.FirebaseAnalytics;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p427v.Firebase;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.n.d.j.b.a */
/* JADX INFO: compiled from: com.google.firebase:firebase-analytics-ktx@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5239a {

    /* JADX INFO: renamed from: a */
    public static volatile FirebaseAnalytics f26347a;

    /* JADX INFO: renamed from: b */
    public static final Object f26348b = new Object();

    /* JADX INFO: renamed from: a */
    public static final FirebaseAnalytics m11682a(Firebase firebase) {
        Intrinsics2.m13089e(firebase, "$this$analytics");
        if (f26347a == null) {
            synchronized (f26348b) {
                if (f26347a == null) {
                    FirebaseApp2 firebaseApp2M11665b = FirebaseApp2.m11665b();
                    Intrinsics2.m13086b(firebaseApp2M11665b, "FirebaseApp.getInstance()");
                    firebaseApp2M11665b.m11668a();
                    f26347a = FirebaseAnalytics.getInstance(firebaseApp2M11665b.f26303d);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f26347a;
        Intrinsics2.m13087c(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
