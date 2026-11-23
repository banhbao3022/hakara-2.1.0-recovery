package p007c.p190n.p385d.p386j.p387a;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p325k.C4108c0;
import p007c.p190n.p194b.p266d.p314j.p325k.C4177h;
import p007c.p190n.p385d.DataCollectionDefaultChange;
import p007c.p190n.p385d.p416p.Event2;
import p007c.p190n.p385d.p416p.EventHandler2;

/* JADX INFO: renamed from: c.n.d.j.a.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5237d implements EventHandler2 {

    /* JADX INFO: renamed from: a */
    public static final EventHandler2 f26345a = new C5237d();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p385d.p416p.EventHandler2
    /* JADX INFO: renamed from: a */
    public final void mo11681a(Event2 event2) {
        boolean z = ((DataCollectionDefaultChange) event2.f27034b).f26297a;
        synchronized (C5230b.class) {
            C4177h c4177h = ((C5230b) C5230b.f26326a).f26327b.f23687a;
            Objects.requireNonNull(c4177h);
            c4177h.f23198e.execute(new C4108c0(c4177h, z));
        }
    }
}
