package p555j.p556a.p557a.p597g.p601d;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import java.util.Objects;
import p636z0.p774z.p775b.LinearSnapHelper;
import p636z0.p774z.p775b.OrientationHelper;
import p636z0.p774z.p775b.OrientationHelper2;

/* JADX INFO: renamed from: j.a.a.g.d.c, reason: use source file name */
/* JADX INFO: compiled from: GravitySnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class GravitySnapHelper extends LinearSnapHelper {

    /* JADX INFO: renamed from: f */
    public final GravityDelegate f32183f;

    /* JADX INFO: renamed from: g */
    public boolean f32184g;

    /* JADX INFO: renamed from: j.a.a.g.d.c$a */
    /* JADX INFO: compiled from: GravitySnapHelper.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m14023a(int i);
    }

    public GravitySnapHelper(int i) {
        this(i, false, null);
    }

    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: b */
    public void mo14020b(RecyclerView recyclerView) throws IllegalStateException {
        GravityDelegate gravityDelegate = this.f32183f;
        Objects.requireNonNull(gravityDelegate);
        if (recyclerView != null) {
            recyclerView.setOnFlingListener(null);
            int i = gravityDelegate.f32175c;
            if (i == 8388611 || i == 8388613 || i == 17) {
                gravityDelegate.f32176d = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
            }
            if (gravityDelegate.f32178f != null) {
                recyclerView.m607h(gravityDelegate.f32181i);
            }
        }
        super.mo14020b(recyclerView);
    }

    @Override // p636z0.p774z.p775b.LinearSnapHelper, p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: c */
    public int[] mo14021c(RecyclerView.AbstractC0160m abstractC0160m, View view) {
        GravityDelegate gravityDelegate = this.f32183f;
        Objects.requireNonNull(gravityDelegate);
        int[] iArr = new int[2];
        if (abstractC0160m.mo531e()) {
            int i = gravityDelegate.f32175c;
            if (i == 8388611) {
                if (gravityDelegate.f32174b == null) {
                    gravityDelegate.f32174b = new OrientationHelper(abstractC0160m);
                }
                iArr[0] = gravityDelegate.m14015c(view, gravityDelegate.f32174b, false);
            } else if (i == 17) {
                if (gravityDelegate.f32174b == null) {
                    gravityDelegate.f32174b = new OrientationHelper(abstractC0160m);
                }
                iArr[0] = gravityDelegate.m14013a(abstractC0160m, view, gravityDelegate.f32174b);
            } else {
                if (gravityDelegate.f32174b == null) {
                    gravityDelegate.f32174b = new OrientationHelper(abstractC0160m);
                }
                iArr[0] = gravityDelegate.m14014b(view, gravityDelegate.f32174b, false);
            }
        } else {
            iArr[0] = 0;
        }
        if (abstractC0160m.mo533f()) {
            int i2 = gravityDelegate.f32175c;
            if (i2 == 48) {
                if (gravityDelegate.f32173a == null) {
                    gravityDelegate.f32173a = new OrientationHelper2(abstractC0160m);
                }
                iArr[1] = gravityDelegate.m14015c(view, gravityDelegate.f32173a, false);
            } else if (i2 == 17) {
                if (gravityDelegate.f32173a == null) {
                    gravityDelegate.f32173a = new OrientationHelper2(abstractC0160m);
                }
                iArr[1] = gravityDelegate.m14013a(abstractC0160m, view, gravityDelegate.f32173a);
            } else {
                if (gravityDelegate.f32173a == null) {
                    gravityDelegate.f32173a = new OrientationHelper2(abstractC0160m);
                }
                iArr[1] = gravityDelegate.m14014b(view, gravityDelegate.f32173a, false);
            }
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0095  */
    @Override // p636z0.p774z.p775b.LinearSnapHelper, p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: e */
    public View mo937e(RecyclerView.AbstractC0160m abstractC0160m) {
        View viewM14016d;
        GravityDelegate gravityDelegate = this.f32183f;
        Objects.requireNonNull(gravityDelegate);
        if (abstractC0160m instanceof LinearLayoutManager) {
            int i = gravityDelegate.f32175c;
            if (i != 17) {
                if (i == 48) {
                    if (gravityDelegate.f32173a == null) {
                        gravityDelegate.f32173a = new OrientationHelper2(abstractC0160m);
                    }
                    viewM14016d = gravityDelegate.m14018f(abstractC0160m, gravityDelegate.f32173a);
                } else if (i == 80) {
                    if (gravityDelegate.f32173a == null) {
                        gravityDelegate.f32173a = new OrientationHelper2(abstractC0160m);
                    }
                    viewM14016d = gravityDelegate.m14017e(abstractC0160m, gravityDelegate.f32173a);
                } else if (i == 8388611) {
                    if (gravityDelegate.f32174b == null) {
                        gravityDelegate.f32174b = new OrientationHelper(abstractC0160m);
                    }
                    viewM14016d = gravityDelegate.m14018f(abstractC0160m, gravityDelegate.f32174b);
                } else if (i != 8388613) {
                    viewM14016d = null;
                } else {
                    if (gravityDelegate.f32174b == null) {
                        gravityDelegate.f32174b = new OrientationHelper(abstractC0160m);
                    }
                    viewM14016d = gravityDelegate.m14017e(abstractC0160m, gravityDelegate.f32174b);
                }
            } else if (abstractC0160m.mo533f()) {
                if (gravityDelegate.f32173a == null) {
                    gravityDelegate.f32173a = new OrientationHelper2(abstractC0160m);
                }
                viewM14016d = gravityDelegate.m14016d(abstractC0160m, gravityDelegate.f32173a);
            } else {
                if (gravityDelegate.f32174b == null) {
                    gravityDelegate.f32174b = new OrientationHelper(abstractC0160m);
                }
                viewM14016d = gravityDelegate.m14016d(abstractC0160m, gravityDelegate.f32174b);
            }
        } else {
            viewM14016d = null;
        }
        gravityDelegate.f32179g = viewM14016d != null;
        return viewM14016d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        r2 = 1;
     */
    @Override // p636z0.p774z.p775b.LinearSnapHelper, p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo14022f(androidx.recyclerview.widget.RecyclerView.AbstractC0160m r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p555j.p556a.p557a.p597g.p601d.GravitySnapHelper.mo14022f(androidx.recyclerview.widget.RecyclerView$m, int, int):int");
    }

    public GravitySnapHelper(int i, boolean z) {
        this(i, z, null);
    }

    public GravitySnapHelper(int i, boolean z, a aVar) {
        this.f32184g = false;
        this.f32183f = new GravityDelegate(i, z, aVar);
    }
}
