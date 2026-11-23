package p007c.p114h.p115a.p117b;

import android.view.animation.Animation;
import p636z0.p752p.p753c.BackStackRecord;
import p636z0.p752p.p753c.Fragment;

/* JADX INFO: renamed from: c.h.a.b.c, reason: use source file name */
/* JADX INFO: compiled from: CameraPreviewFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraPreviewFragment implements Animation.AnimationListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CameraPreviewFragment2 f3866f;

    public CameraPreviewFragment(CameraPreviewFragment2 cameraPreviewFragment2) {
        this.f3866f = cameraPreviewFragment2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f3866f.m2070a1();
        CameraPreviewFragment2 cameraPreviewFragment2 = this.f3866f;
        Fragment fragmentM16656I = cameraPreviewFragment2.m16570w().m16656I("FRAGMENT_TAG");
        if (fragmentM16656I != null) {
            BackStackRecord backStackRecord = new BackStackRecord(cameraPreviewFragment2.m16570w());
            backStackRecord.mo16449h(fragmentM16656I);
            backStackRecord.m16454o();
        }
        this.f3866f.f3873i0 = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
