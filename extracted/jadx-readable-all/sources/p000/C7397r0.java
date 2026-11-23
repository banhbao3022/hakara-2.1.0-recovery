package p000;

import android.view.MotionEvent;
import p007c.p451o.p452a.p461e.p465d.ImageViewerView;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: r0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7397r0 extends Lambda implements InterfaceC6164l<MotionEvent, Boolean> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34092g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34093h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7397r0(int i, Object obj) {
        super(1);
        this.f34092g = i;
        this.f34093h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Boolean mo3b(MotionEvent motionEvent) {
        int i = this.f34092g;
        if (i != 0) {
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13090f(motionEvent, "it");
            ImageViewerView imageViewerView = (ImageViewerView) this.f34093h;
            imageViewerView.f27913z = !imageViewerView.m12495f();
            return Boolean.FALSE;
        }
        MotionEvent motionEvent2 = motionEvent;
        Intrinsics2.m13090f(motionEvent2, "it");
        ImageViewerView imageViewerView2 = (ImageViewerView) this.f34093h;
        if (imageViewerView2.f27906s.f29329i0) {
            ImageViewerView.m12491b(imageViewerView2, motionEvent2, imageViewerView2.f27888A);
        }
        return Boolean.FALSE;
    }
}
