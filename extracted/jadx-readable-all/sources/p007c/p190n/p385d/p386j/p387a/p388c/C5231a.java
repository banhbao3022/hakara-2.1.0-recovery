package p007c.p190n.p385d.p386j.p387a.p388c;

import android.content.Context;
import android.os.Bundle;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p385d.DataCollectionDefaultChange;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p386j.p387a.C5230b;
import p007c.p190n.p385d.p386j.p387a.C5237d;
import p007c.p190n.p385d.p386j.p387a.ExecutorC5238e;
import p007c.p190n.p385d.p390k.ComponentContainer;
import p007c.p190n.p385d.p390k.ComponentFactory;
import p007c.p190n.p385d.p416p.Subscriber;

/* JADX INFO: renamed from: c.n.d.j.a.c.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5231a implements ComponentFactory {

    /* JADX INFO: renamed from: a */
    public static final ComponentFactory f26329a = new C5231a();

    @Override // p007c.p190n.p385d.p390k.ComponentFactory
    /* JADX INFO: renamed from: a */
    public final Object mo11679a(ComponentContainer componentContainer) {
        FirebaseApp2 firebaseApp2 = (FirebaseApp2) componentContainer.mo11684a(FirebaseApp2.class);
        Context context = (Context) componentContainer.mo11684a(Context.class);
        Subscriber subscriber = (Subscriber) componentContainer.mo11684a(Subscriber.class);
        Objects.requireNonNull(firebaseApp2, "null reference");
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(subscriber, "null reference");
        Objects.requireNonNull(context.getApplicationContext(), "null reference");
        if (C5230b.f26326a == null) {
            synchronized (C5230b.class) {
                if (C5230b.f26326a == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp2.m11672h()) {
                        subscriber.mo11702b(DataCollectionDefaultChange.class, ExecutorC5238e.f26346f, C5237d.f26345a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp2.m11671g());
                    }
                    C5230b.f26326a = new C5230b(C4177h.m9633b(context, null, null, null, bundle).f23199f);
                }
            }
        }
        return C5230b.f26326a;
    }
}
