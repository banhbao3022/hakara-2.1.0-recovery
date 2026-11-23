package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.data.model.Recording;

/* JADX INFO: renamed from: j.a.a.i.u1, reason: use source file name */
/* JADX INFO: compiled from: ItemRecordingRankingBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemRecordingRankingBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final TextView f32879t;

    /* JADX INFO: renamed from: u */
    public final TextView f32880u;

    /* JADX INFO: renamed from: v */
    public final RelativeLayout f32881v;

    /* JADX INFO: renamed from: w */
    public final AppCompatImageView f32882w;

    /* JADX INFO: renamed from: x */
    public int f32883x;

    /* JADX INFO: renamed from: y */
    public Recording f32884y;

    public ItemRecordingRankingBinding(Object obj, View view, int i, TextView textView, TextView textView2, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.f32879t = textView;
        this.f32880u = textView2;
        this.f32881v = relativeLayout;
        this.f32882w = appCompatImageView;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo14246s(int i);
}
