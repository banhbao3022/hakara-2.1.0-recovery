package p636z0.p748n;

import android.view.Choreographer;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: z0.n.i, reason: use source file name */
/* JADX INFO: compiled from: ViewDataBinding.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewDataBinding2 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewDataBinding f38201f;

    public ViewDataBinding2(ViewDataBinding viewDataBinding) {
        this.f38201f = viewDataBinding;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        this.f38201f.f722g.run();
    }
}
