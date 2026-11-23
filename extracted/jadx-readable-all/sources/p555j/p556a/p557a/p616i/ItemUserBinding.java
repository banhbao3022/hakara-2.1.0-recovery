package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.data.model.User;

/* JADX INFO: renamed from: j.a.a.i.g2, reason: use source file name */
/* JADX INFO: compiled from: ItemUserBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemUserBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final TextView f32546t;

    /* JADX INFO: renamed from: u */
    public final TextView f32547u;

    /* JADX INFO: renamed from: v */
    public final TextView f32548v;

    /* JADX INFO: renamed from: w */
    public final RelativeLayout f32549w;

    /* JADX INFO: renamed from: x */
    public final AppCompatImageView f32550x;

    /* JADX INFO: renamed from: y */
    public User f32551y;

    public ItemUserBinding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout, AppCompatImageView appCompatImageView) {
        super(obj, view, i);
        this.f32546t = textView;
        this.f32547u = textView2;
        this.f32548v = textView3;
        this.f32549w = relativeLayout;
        this.f32550x = appCompatImageView;
    }
}
