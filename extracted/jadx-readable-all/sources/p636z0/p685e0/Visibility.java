package p636z0.p685e0;

import android.view.View;
import android.view.ViewGroup;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: z0.e0.a0, reason: use source file name */
/* JADX INFO: compiled from: Visibility.java */
/* JADX INFO: loaded from: classes.dex */
public class Visibility extends TransitionListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f36375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f36376b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f36377c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Visibility2 f36378d;

    public Visibility(Visibility2 visibility2, ViewGroup viewGroup, View view, View view2) {
        this.f36378d = visibility2;
        this.f36375a = viewGroup;
        this.f36376b = view;
        this.f36377c = view2;
    }

    @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
    /* JADX INFO: renamed from: b */
    public void mo12474b(Transition3 transition3) {
        this.f36375a.getOverlay().remove(this.f36376b);
    }

    @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
    /* JADX INFO: renamed from: c */
    public void mo12475c(Transition3 transition3) {
        this.f36377c.setTag(R.id.save_overlay_view, null);
        this.f36375a.getOverlay().remove(this.f36376b);
        transition3.mo15518z(this);
    }

    @Override // p636z0.p685e0.TransitionListenerAdapter, p636z0.p685e0.Transition3.d
    /* JADX INFO: renamed from: e */
    public void mo12477e(Transition3 transition3) {
        if (this.f36376b.getParent() == null) {
            this.f36375a.getOverlay().add(this.f36376b);
        } else {
            this.f36378d.cancel();
        }
    }
}
