package p555j.p556a.p557a.p616i;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.data.model.Image;

/* JADX INFO: renamed from: j.a.a.i.i1, reason: use source file name */
/* JADX INFO: compiled from: ItemImageBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ItemImageBinding extends ViewDataBinding {

    /* JADX INFO: renamed from: t */
    public final ImageView f32588t;

    /* JADX INFO: renamed from: u */
    public final AppCompatImageView f32589u;

    /* JADX INFO: renamed from: v */
    public final RelativeLayout f32590v;

    /* JADX INFO: renamed from: w */
    public boolean f32591w;

    /* JADX INFO: renamed from: x */
    public Image f32592x;

    public ItemImageBinding(Object obj, View view, int i, ImageView imageView, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.f32588t = imageView;
        this.f32589u = appCompatImageView;
        this.f32590v = relativeLayout;
    }

    /* JADX INFO: renamed from: s */
    public abstract void mo14241s(boolean z);
}
