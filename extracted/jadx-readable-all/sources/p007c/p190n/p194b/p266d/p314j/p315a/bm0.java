package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2277l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bm0 extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public final C2277l f12744f;

    public bm0(Context context, View view, C2277l c2277l) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f12744f = c2277l;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f12744f.m4787a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof InterfaceC3410ps)) {
                arrayList.add((InterfaceC3410ps) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((InterfaceC3410ps) arrayList.get(i2)).destroy();
        }
    }
}
